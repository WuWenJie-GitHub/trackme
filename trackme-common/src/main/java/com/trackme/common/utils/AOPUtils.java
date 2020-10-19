package com.trackme.common.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class AOPUtils {

    public static String getName(ProceedingJoinPoint pjp) {
        StringBuilder name = new StringBuilder();

        String className = pjp.getSignature().getDeclaringTypeName();
        String methodName = pjp.getSignature().getName();
        name.append(className).append(".").append(methodName);

        name.append("	(");
        Object[] args = pjp.getArgs();
        if (args != null && args.length != 0) {
            for (Object arg : args) {
                name.append(arg).append(",");
            }
            name.deleteCharAt(name.length() - 1);
        }
        name.append(")");

        return name.toString();
    }

    public static String getNameNotArgs(ProceedingJoinPoint pjp) {
        StringBuilder name = new StringBuilder();

        String className = pjp.getSignature().getDeclaringTypeName();
        String methodName = pjp.getSignature().getName();
        name.append(className).append(".").append(methodName);

        return name.toString();
    }
}
