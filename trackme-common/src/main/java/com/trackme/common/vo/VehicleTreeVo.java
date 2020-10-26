package com.trackme.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @description element-ui Tree 树形控件
 * @author: wuwenjie
 * @data: 2020/10/22 14:28
 */
@Data
public class VehicleTreeVo extends ElementTreeVo {
    private String online = "0";
    private List<VehicleTreeVo> children;
}
