package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.TerminalEntity;
import com.trackme.webgis.service.TerminalService;
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
@RequestMapping("webgis/terminal")
public class TerminalController {
    @Autowired
    private TerminalService terminalService;

    /**
     * 列表
     */
    @Log("获取当前登录用户下终端信息列表")
    @ApiOperation("获取当前登录用户下终端信息列表")
    @RequestMapping("/userTerPages")
    public R userTerPages(@RequestParam Map<String, Object> params){
        PageUtils pages = terminalService.getUserTerPages(params);
        return R.ok().put("page", pages);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{termid}")
    public R info(@PathVariable("termid") Integer termid){

        return R.ok().put("terminal", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TerminalEntity terminal){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TerminalEntity terminal){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] termids){

        return R.ok();
    }

}
