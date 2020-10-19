package com.trackme.webgis.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.trackme.common.jwt.JwtHelper;
import com.trackme.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description 登录校验拦截器
 * @author: wuwenjie
 * @data: 2020/10/10 14:54
 */
@Slf4j
@Component
public class CommonInterceptor extends HandlerInterceptorAdapter {

    /**
     * 在方法被调用前执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String url = request.getRequestURI();
        if (url.contains("login") || url.contains("imageCode") || url.contains("swagger") || url.contains("error")) {
            return true;
        }
        System.out.println(url);
        String jwt = request.getHeader("token");
        //判断jwt是否有效
        if(!"null".equals(jwt) && jwt != null && !"".equals(jwt)){
            //校验jwt是否有效,有效则返回json信息，无效则返回空
            String retJson = JwtHelper.validateLogin(jwt);
            log.info("[登录校验拦截器]-校验JWT有效性返回结果:{}", retJson);
            //retJSON为空则说明jwt超时或非法
            if(StringUtils.isNotBlank(retJson)){
                JSONObject jsonObject = JSONObject.parseObject(retJson);
                //获取刷新后的jwt值，设置到响应头中
//                response.setHeader("token", jsonObject.getString("freshToken"));
//                return true;
                //校验客户端信息
                String userAgent = request.getHeader("User-Agent");
                if (userAgent.equals(jsonObject.getString("userAgent"))) {
                    //获取刷新后的jwt值，设置到响应头中
                    response.setHeader("User-Token", jsonObject.getString("freshToken"));
//                    //将客户编号设置到session中
//                    request.getSession().setAttribute(GlobalConstant.SESSION_CUSTOMER_NO_KEY, jsonObject.getString("userId"));
                    return true;
                }else{
                    log.warn("[登录校验拦截器]-客户端浏览器信息与JWT中存的浏览器信息不一致，重新登录。当前浏览器信息:{}", userAgent);
                    responseMessage(response,"浏览器信息不一致，重新登录。");
                    return false;
                }
            }else {
                log.warn("[登录校验拦截器]-JWT非法或已超时，重新登录");
                responseMessage(response,"已超时，重新登录。");
                return false;
            }
        }else{
            log.warn("[登录校验拦截器]-JWT为空，先登录");
            responseMessage(response,"亲 请先登录");
            return false;
        }

    }

    /**
     * 在方法被调用后执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

    }


    private void responseMessage(HttpServletResponse response,String message) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        response.getOutputStream().write(JSONObject.toJSONString(R.error(message)).getBytes("UTF-8"));
    }
}
