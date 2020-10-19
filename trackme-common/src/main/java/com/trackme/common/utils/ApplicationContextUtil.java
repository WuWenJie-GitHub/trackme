package com.trackme.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @description 从已有的spring上下文取得已实例化的bean。通过ApplicationContextAware接口进行实现
 * @author: wuwenjie
 * @data: 2020/10/13 11:26
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    public static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return context;
    }
}
