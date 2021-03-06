package com.trackme.webgis.controller;

import java.util.List;
import java.util.Map;

import com.trackme.common.vo.FuncTreeVo;
import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trackme.webgis.entity.FunctionmodelEntity;
import com.trackme.webgis.service.FunctionmodelService;
import com.trackme.common.utils.R;



/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:38:06
 */
@RestController
@RequestMapping("webgis/functionmodel")
public class FunctionmodelController {
    @Autowired
    private FunctionmodelService functionmodelService;

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
    @RequestMapping("/info/{funcid}")
    public R info(@PathVariable("funcid") Integer funcid){

        return R.ok().put("functionmodel", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FunctionmodelEntity functionmodel){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FunctionmodelEntity functionmodel){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] funcids){

        return R.ok();
    }

    @ApiOperation("功能菜单树对象")
    @GetMapping("/funcTrees")
    @Log("获取功能菜单树对象")
    public R funcTrees() {
        List<FuncTreeVo> funcTrees = functionmodelService.getFuncTrees();
        return R.ok().put("funcTrees",funcTrees);
    }
}
