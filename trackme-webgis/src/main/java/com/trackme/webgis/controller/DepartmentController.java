package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trackme.webgis.entity.DepartmentEntity;
import com.trackme.webgis.service.DepartmentService;
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
@RequestMapping("webgis/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    /**
     * 根据当前登录用户获取部门店列表
     */
    @Log("根据当前登录用户获取部门店列表")
    @ApiOperation("根据当前登录用户获取部门店列表")
    @RequestMapping("/userDepPages")
    public R userDepList(@RequestParam Map<String, Object> params, HttpServletRequest request){
        PageUtils page = departmentService.userDepPages(params,request);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{depid}")
    public R info(@PathVariable("depid") Integer depid){

        return R.ok().put("department", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DepartmentEntity department){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DepartmentEntity department){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] depids){

        return R.ok();
    }



}
