package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trackme.webgis.entity.EnclosureEntity;
import com.trackme.webgis.service.EnclosureService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;



/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:38:06
 */
@Api("电子围栏管理")
@RestController
@RequestMapping("webgis/enclosure")
public class EnclosureController {
    @Autowired
    private EnclosureService enclosureService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){

        return R.ok().put("page", null);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{enclosureid}")
    public R info(@PathVariable("enclosureid") Integer enclosureid){

        return R.ok().put("enclosure", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EnclosureEntity enclosure){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EnclosureEntity enclosure){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] enclosureids){

        return R.ok();
    }

}
