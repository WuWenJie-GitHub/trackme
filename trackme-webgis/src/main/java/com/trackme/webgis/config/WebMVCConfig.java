package com.trackme.webgis.config;

import com.trackme.webgis.interceptor.CommonInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: wuwenjie
 * @data: 2019/11/26 15:53
 */
@Configuration
@EnableWebMvc
public class WebMVCConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CommonInterceptor());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
//        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
//        registry.addResourceHandler("/lib/**").addResourceLocations("classpath:/static/lib/");
//        registry.addResourceHandler("/layui/**").addResourceLocations("classpath:/static/lib/layui/");
        registry.addResourceHandler("/subvention/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("favicon.ico").addResourceLocations("classpath:/");
//        registry.addResourceHandler("*.txt").addResourceLocations("classpath:/");
//        registry.addResourceHandler("/xls/**").addResourceLocations("classpath:/xls/");
//        registry.addResourceHandler("/image/**").addResourceLocations("file:F:/image/upload/oa/");
    }
}
