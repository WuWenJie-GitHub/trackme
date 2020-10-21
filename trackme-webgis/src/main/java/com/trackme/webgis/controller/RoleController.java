package com.trackme.webgis.controller;

import java.util.List;
import java.util.Map;

import com.trackme.common.vo.OptionVo;
import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trackme.webgis.entity.RoleEntity;
import com.trackme.webgis.service.RoleService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;



/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:38:06
 */
@Api("角色管理")
@RestController
@RequestMapping("webgis/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("角色列表")
    @Log("角色列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = roleService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleid}")
    public R info(@PathVariable("roleid") Integer roleid){

        return R.ok().put("role", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RoleEntity role){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RoleEntity role){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] roleids){

        return R.ok();
    }

    @ApiOperation("角色下拉框的值")
    @GetMapping("/roleOptions")
    @Log("获取角色下拉框值")
    public R roleOptions() {
        List<OptionVo> roleOptions = roleService.getRoleOptions();
        return R.ok().put("options",roleOptions);
    }

}
