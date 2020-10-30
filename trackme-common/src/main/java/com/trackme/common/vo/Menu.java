package com.trackme.common.vo;

import lombok.Data;

import java.util.Map;

/**
 * @description 菜单vo
 * @author: wuwenjie
 * @data: 2020/10/15 17:10
 */
@Data
public class Menu {

    private int id;
    private String text;
    private String icon;
    private String code;
    private Map<String,Object> attributes;

}
