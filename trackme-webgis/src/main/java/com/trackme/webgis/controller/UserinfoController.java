package com.trackme.webgis.controller;

import java.util.Map;

import com.trackme.webgis.core.annotation.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.service.UserinfoService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;



/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:38:06
 */
@Api("用户管理")
@RestController
@RequestMapping("webgis/userinfo")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation("用户列表")
    @Log("用户列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userinfoService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userid}")
    public R info(@PathVariable("userid") Integer userid){

        return R.ok().put("userinfo", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserinfoEntity userinfo){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserinfoEntity userinfo){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] userids){

        return R.ok();
    }

    @GetMapping("/state")
//    @Log("角色列表")
    public R state(){
        Map<String,Object> option = userinfoService.getUserStateOption();
        return R.ok().put("option",option);
    }
}
