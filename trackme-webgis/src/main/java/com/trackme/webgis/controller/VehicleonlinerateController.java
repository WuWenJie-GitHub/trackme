package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.VehicleonlinerateEntity;
import com.trackme.webgis.service.VehicleonlinerateService;
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
@RequestMapping("webgis/vehicleonlinerate")
public class VehicleonlinerateController {
    @Autowired
    private VehicleonlinerateService vehicleonlinerateService;

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

        return R.ok().put("vehicleonlinerate", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody VehicleonlinerateEntity vehicleonlinerate){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody VehicleonlinerateEntity vehicleonlinerate){

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
