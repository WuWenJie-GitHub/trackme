package com.trackme.webgis.aop;

import com.trackme.common.jwt.JwtHelper;
import com.trackme.common.threadpool.ThreadPoolManager;
import com.trackme.common.utils.HttpContextUtils;
import com.trackme.common.utils.IPUtils;
import com.trackme.webgis.annotation.Log;
import com.trackme.webgis.entity.OperationlogEntity;
import com.trackme.webgis.service.OperationlogService;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @description 日志处理
 * @author: wuwenjie
 * @data: 2020/10/12 15:23
 */
@Component
@Slf4j
@Aspect
public class LogAop {

    @Autowired
    OperationlogService operationlogService;

    @Pointcut(value = "@annotation(com.trackme.webgis.annotation.Log)")
    public void cutService(){

    }

    @Around("cutService()")
    public Object recordSysLog(ProceedingJoinPoint point) throws Throwable{
        Object result = point.proceed();
        try {
            handle(point);
        } catch (Exception e){
            log.error("日志记录出错!", e);
        }

        return result;
    }

    /**
     * 拦截方法 日志记录
     * @param point
     */
    private void handle(ProceedingJoinPoint point) throws NoSuchMethodException {
        MethodSignature signature = (MethodSignature) point.getSignature();

        OperationlogEntity log = new OperationlogEntity();

        //IP地址
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        String ipAddr = IPUtils.getIpAddr(request);

        //用户ID和用户名称
        String token = request.getHeader("token");
        Claims claims = JwtHelper.parseJWT(token);
        Object userId = claims.get("userId");
        Object userName = claims.get("userName");

        //备注
        Method method = point.getTarget().getClass().getMethod(signature.getName(), signature.getParameterTypes());
        Log annotation = method.getAnnotation(Log.class);
        String value = annotation.value();

        //请求的方法名称
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();

        //请求的URL
        String url = request.getRequestURI();

        log.setCreatedate(new Date());
        log.setDetail(className+"."+methodName+"()");
        log.setIp(ipAddr);
        log.setUrl(url);
        log.setUserid((Integer) userId);
        log.setUsername((String) userName);
        log.setRemark(value);

        //多线程异步执行
        ThreadPoolManager.me().execute(()->{
            //新增日志
            operationlogService.save(log);
        });
    }
}
