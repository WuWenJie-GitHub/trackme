package com.trackme.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @description element-ui Tree 树形控件
 * @author: wuwenjie
 * @data: 2020/10/22 15:24
 */
@Data
public class ElementTreeVo {
    private String id;
    private String name;
    private Boolean leaf = true; //指定节点是否为叶子节点，仅在指定了 lazy 属性的情况下生效

}
