package com.trackme.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @description 主页的主菜单
 * @author: wuwenjie
 * @data: 2020/10/15 17:25
 */
@Data
public class WebMenuVo extends Menu {

    private List<WebMenuVo> menu;
}
