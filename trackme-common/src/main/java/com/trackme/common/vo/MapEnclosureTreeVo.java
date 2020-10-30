package com.trackme.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @description 地图电子围栏tree
 * @author: wuwenjie
 * @data: 2020/10/22 15:23
 */
@Data
public class MapEnclosureTreeVo extends ElementTree {
    private List<MapEnclosureTreeVo> children;

    public MapEnclosureTreeVo(String name) {
        this.setName(name);
    }
    public MapEnclosureTreeVo() {
    }
}
