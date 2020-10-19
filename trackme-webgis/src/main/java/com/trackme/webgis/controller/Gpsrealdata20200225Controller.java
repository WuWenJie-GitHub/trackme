package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.Gpsrealdata20200225Entity;
import com.trackme.webgis.service.Gpsrealdata20200225Service;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;



/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:38:06
 */
@RestController
@RequestMapping("webgis/gpsrealdata20200225")
public class Gpsrealdata20200225Controller {
    @Autowired
    private Gpsrealdata20200225Service gpsrealdata20200225Service;

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
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){

        return R.ok().put("gpsrealdata20200225", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Gpsrealdata20200225Entity gpsrealdata20200225){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Gpsrealdata20200225Entity gpsrealdata20200225){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){

        return R.ok();
    }

}
