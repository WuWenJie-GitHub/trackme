package com.trackme.webgis.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.trackme.common.constant.SecretConstant;
import com.trackme.common.jwt.AESSecretUtil;
import com.trackme.common.jwt.JwtHelper;
import com.trackme.webgis.entity.DepartmentEntity;
import com.trackme.webgis.entity.PointLatLng;
import com.trackme.webgis.service.DepartmentService;
import com.trackme.webgis.service.LoginService;
import com.trackme.webgis.service.impl.MapFixService;
import io.jsonwebtoken.Claims;
import io.netty.util.internal.StringUtil;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trackme.webgis.entity.GpsrealdataEntity;
import com.trackme.webgis.service.GpsrealdataService;
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
@RequestMapping("webgis/gpsrealdata")
public class GpsrealdataController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private GpsrealdataService gpsrealdataService;


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        String requestToken = loginService.getRequestToken(request);
        Claims claims = JwtHelper.parseJWT(requestToken);
        String decryptUserId = AESSecretUtil.decryptToStr(claims.get("userId").toString(), SecretConstant.DATAKEY);//解密客户编号
        //当前用户所拥的部门
        List<DepartmentEntity> departmentEntities=departmentService.getUserDeps(Integer.parseInt(decryptUserId));
        //矩形范围
        String strRoutePoints=params.get("strRoutePoints").toString();
        //当前页
        Integer currentPage= Integer.parseInt(params.get("currentPage").toString()) ;
        //没页数
        Integer pageSize= Integer.parseInt(params.get("pageSize").toString()) ;
        //部门id
        List <Integer> depIds=new ArrayList<>();
        departmentEntities.forEach((v)->{
            depIds.add(v.getDepid());
        });

        return R.ok().put("data",gpsrealdataService.selectGpsRealData(depIds,strRoutePoints,currentPage,pageSize));



    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){

        return R.ok().put("gpsrealdata", null);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GpsrealdataEntity gpsrealdata){

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GpsrealdataEntity gpsrealdata){

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){

        return R.ok();
    }

}
