package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.KilediDeviceRepairEntity;
import com.trackme.webgis.service.KilediDeviceRepairService;
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
@RequestMapping("webgis/kiledidevicerepair")
public class KilediDeviceRepairController {
    @Autowired
    private KilediDeviceRepairService kilediDeviceRepairService;

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
    public R info(@PathVariable("id") String id){

        return R.ok().put("kilediDeviceRepair", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KilediDeviceRepairEntity kilediDeviceRepair){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KilediDeviceRepairEntity kilediDeviceRepair){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){

        return R.ok();
    }

}
