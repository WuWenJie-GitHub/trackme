package com.trackme.webgis.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.GovplatformmsgEntity;
import com.trackme.webgis.service.GovplatformmsgService;
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
@RequestMapping("webgis/govplatformmsg")
public class GovplatformmsgController {
    @Autowired
    private GovplatformmsgService govplatformmsgService;

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

        return R.ok().put("govplatformmsg", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GovplatformmsgEntity govplatformmsg){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GovplatformmsgEntity govplatformmsg){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] funcids){

        return R.ok();
    }

}
