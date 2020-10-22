package com.trackme.common.vo;

import lombok.Data;

/**
 * @description element-ui Tree 树形控件
 * @author: wuwenjie
 * @data: 2020/10/22 15:24
 */
@Data
public class ElementTreeVo {
    private String id;
    private String name;
    private Boolean leaf = true;
}
