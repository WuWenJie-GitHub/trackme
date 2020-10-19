//package com.trackme.common.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * @description 跨域处理
// * @author: wuwenjie
// * @data: 2020/8/31 15:33
// */
//@Configuration
//public class GatewayCorsConfig {
//
////    @Bean
////    public CorsWebFilter corsWebFilter(){
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        CorsConfiguration corsConfiguration = new CorsConfiguration();
////
////        corsConfiguration.addAllowedHeader("*"); //头信息
////        corsConfiguration.addAllowedMethod("*"); //方法
////        corsConfiguration.addAllowedOrigin("*"); //请求类型
////        corsConfiguration.setAllowCredentials(true); //cooking
////
////        source.registerCorsConfiguration("/**",corsConfiguration);
////
////
////        return new CorsWebFilter(source);
////    }
//
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOrigins("*")
//                        .allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS")
//                        .allowCredentials(false).maxAge(3600);
//            }
//        };
//    }
//
////    @Bean
////    public FilterRegistrationBean corsFilter() {
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        CorsConfiguration config = new CorsConfiguration();
////        config.setAllowCredentials(false);
////        config.addAllowedOrigin("*");
////        config.addAllowedHeader("*");
////        config.addAllowedMethod("*");
////        source.registerCorsConfiguration("/**", config);
////        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
////        bean.setOrder(0);
////        return bean;
////    }
//}
