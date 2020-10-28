package com.trackme.common.utils;

/**
 * @description String
 * @author: wuwenjie
 * @data: 2020/10/28 15:35
 */
public class MyStringUtils {

    public static boolean isNotNull(Object str) {
        if(!"null".equals(str) && null != str && !"".equals(str)) {
                return true;
        }
        return false;
    }
}
