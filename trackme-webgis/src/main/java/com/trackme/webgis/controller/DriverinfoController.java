package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.DriverinfoEntity;
import com.trackme.webgis.service.DriverinfoService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;

import javax.servlet.http.HttpServletRequest;


/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:38:06
 */
@RestController
@RequestMapping("webgis/driverinfo")
public class DriverinfoController {
    @Autowired
    private DriverinfoService driverinfoService;

    /**
     * 获取当前登录用户下部门下车主列表
     */
    @Log("获取当前登录用户下部门下车主列表")
    @ApiOperation("获取当前登录用户下部门下车主列表")
    @RequestMapping("/userDriPages")
    public R getUserDriPages(@RequestParam Map<String, Object> params, HttpServletRequest request){
        PageUtils pages = driverinfoService.getUserDriPages(params,request);
        return R.ok().put("page", pages);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{driverid}")
    public R info(@PathVariable("driverid") Integer driverid){

        return R.ok().put("driverinfo", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DriverinfoEntity driverinfo){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DriverinfoEntity driverinfo){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] driverids){

        return R.ok();
    }

}
