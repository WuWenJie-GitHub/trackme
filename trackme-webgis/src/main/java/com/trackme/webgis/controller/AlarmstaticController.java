package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.AlarmstaticEntity;
import com.trackme.webgis.service.AlarmstaticService;
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
@RequestMapping("webgis/alarmstatic")
public class AlarmstaticController {
    @Autowired
    private AlarmstaticService alarmstaticService;

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
    @RequestMapping("/info/{staticid}")
    public R info(@PathVariable("staticid") Integer staticid){

        return R.ok().put("alarmstatic", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AlarmstaticEntity alarmstatic){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AlarmstaticEntity alarmstatic){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] staticids){

        return R.ok();
    }

}
