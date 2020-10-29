package com.trackme.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @description 功能菜单树对象
 * @author: wuwenjie
 * @data: 2020/10/29 8:57
 */
@Data
public class FuncTreeVo extends ElementTreeVo {
    private List<FuncTreeVo> children; //指定子树为节点对象的某个属性值
}
