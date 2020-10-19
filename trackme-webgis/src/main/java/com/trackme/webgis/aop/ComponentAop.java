package com.trackme.webgis.aop;

import com.trackme.common.utils.AOPUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @description service controller mapper方法使用时间 > 200
 * @author: wuwenjie
 * @data: 2020/10/12 14:53
 */
@Slf4j
@Component
@Aspect
public class ComponentAop {

    private static final long COST_THRESHOLD = 200;

    @Around("execution(public * com.trackme.webgis.service.*Service*.*(..))")
    public Object serviceAround(ProceedingJoinPoint point) throws Throwable{
        long start = System.currentTimeMillis();
        try{
            return point.proceed();
        } finally {
            long end = System.currentTimeMillis();
            long cost = end - start;
            if (cost > COST_THRESHOLD) {
                log.info("耗时：" + cost + "ms." + "方法：" + AOPUtils.getName(point));
            }
        }
    }


    @Around("execution(* com.trackme.webgis.controller..*.*(..))")
    public Object controllerAround(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        try {
            return pjp.proceed();
        } finally {
            long end = System.currentTimeMillis();
            long cost = end - start;
            if (cost >= COST_THRESHOLD) {
                log.info("耗时：" + cost + "ms." + "方法：{}", AOPUtils.getNameNotArgs(pjp));
            }
        }
    }


    @Around("execution(public * com.trackme.webgis.mapper..*.*(..))")
    public Object daoAround(ProceedingJoinPoint pjp) throws Throwable {

        long start = System.currentTimeMillis();
        try {
            Object result = pjp.proceed();
            return result;
        } catch (Throwable e) {
            throw e;
        } finally {
            long end = System.currentTimeMillis();
            long cost = end - start;
            if (cost >= COST_THRESHOLD) {
                log.info("耗时：" + cost + "ms." + "方法：{}", AOPUtils.getNameNotArgs(pjp));
            }
        }
    }
}
