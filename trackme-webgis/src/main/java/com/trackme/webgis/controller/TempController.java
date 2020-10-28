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

import com.trackme.webgis.entity.TempEntity;
import com.trackme.webgis.service.TempService;
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
@RequestMapping("webgis/temp")
public class TempController {
    @Autowired
    private TempService tempService;

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
    @RequestMapping("/info/{alarmid}")
    public R info(@PathVariable("alarmid") Integer alarmid){

        return R.ok().put("temp", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TempEntity temp){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TempEntity temp){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] alarmids){

        return R.ok();
    }

}
