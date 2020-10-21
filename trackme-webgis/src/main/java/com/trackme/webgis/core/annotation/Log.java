package com.trackme.webgis.core.annotation;

import java.lang.annotation.*;

/**
 * @description 日志注解
 * @author: wuwenjie
 * @data: 2020/10/12 15:26
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface Log {

    String value() default "";
}
