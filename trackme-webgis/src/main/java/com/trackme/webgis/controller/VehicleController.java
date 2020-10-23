package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trackme.webgis.entity.VehicleEntity;
import com.trackme.webgis.service.VehicleService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;



/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:38:06
 */
@Api("车辆信息管理")
@RestController
@RequestMapping("webgis/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

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
    @RequestMapping("/info/{vehicleid}")
    public R info(@PathVariable("vehicleid") Integer vehicleid){

        return R.ok().put("vehicle", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody VehicleEntity vehicle){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody VehicleEntity vehicle){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] vehicleids){

        return R.ok();
    }

    @GetMapping("/vehicleTree/{depid}")
    @Log("获取部门下面的车辆树")
    @ApiOperation("获取部门下面的车辆树")
    public R getVehicleTree(@PathVariable("depid") int depid) {
        return vehicleService.getVehicleTree(depid);
    }

    @GetMapping("/vehicleInfo/{vehicleIds}")
    @Log("根据id[]获取车辆信息")
    @ApiOperation("根据id[]获取车辆信息")
    public R getVehicleInfos(@PathVariable("vehicleIds") Integer[] vehicleIds) {
        return vehicleService.getVehicleInfos(vehicleIds);
    }

}
