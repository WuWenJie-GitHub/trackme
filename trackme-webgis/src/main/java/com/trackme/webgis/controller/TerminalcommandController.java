package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import com.trackme.webgis.core.annotation.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.TerminalcommandEntity;
import com.trackme.webgis.service.TerminalcommandService;
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
@RequestMapping("webgis/terminalcommand")
public class TerminalcommandController {
    @Autowired
    private TerminalcommandService terminalcommandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @Log("终端日志列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = terminalcommandService.queryParams(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{cmdid}")
    public R info(@PathVariable("cmdid") Integer cmdid){

        return R.ok().put("terminalcommand", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TerminalcommandEntity terminalcommand){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TerminalcommandEntity terminalcommand){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] cmdids){

        return R.ok();
    }

}
