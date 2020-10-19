package com.trackme.common.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * cookie Created by huixiangyin on 2017/4/5.
 */
public class CookieUtil {

    private static Log logger = LogFactory.getLog(CookieUtil.class);

    /**
     * 获得对应的cookie值
     * 
     * @param key
     * @return
     */
    public static String getCookieVal(String key, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return null;
        }
        System.out.println(cookies.length);
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            System.out.println(cookies+"--"+cookie.getName());

            if (key.equals(cookie.getName())) {
                String value = cookie.getValue();
//                try {
//                    value = AesUtil.decrypt(URLDecoder.decode(value, "utf-8"));
//                } catch (UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                }
                return StringUtils.isEmpty(value) ? null : value;
            }
        }
        return null;
    }

    /**
     * 存入cookie值
     * 
     * @param value
     * @return
     */
    public static void setCookieVal(String key, Object value, HttpServletResponse response,
        String domain) {
        try {
//            Cookie cookie = new Cookie(key, URLEncoder.encode(AesUtil.encrypt(String.valueOf(value)), "utf-8"));
            Cookie cookie = new Cookie(key, value.toString());
            // 设置cookie的域,如果不设置该属性将不能够写入cookie
            cookie.setDomain(domain);
            // 设置cookie的路径,这个路径即改工程下都可以访问该cookie 如果不设置路径，那么只有设置该cookie的路径及其子路径可以访问
            cookie.setPath("/");
            // 浏览器关闭、cookie失效
            cookie.setMaxAge(-1);
            // 写入cookie
            response.addCookie(cookie);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除cookie
     * 
     * @param key
     */
    public static void removeCookieVal(String key, HttpServletResponse response, HttpServletRequest request) {
        Cookie cookie = new Cookie(key, null);
        cookie.setDomain(request.getServerName());
        // 项目所有目录均有效
        cookie.setPath("/");
        // 立即删除
        cookie.setMaxAge(0);
        // 重新写入
        response.addCookie(cookie);
    }

}
