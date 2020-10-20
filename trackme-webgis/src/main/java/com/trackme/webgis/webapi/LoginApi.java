package com.trackme.webgis.webapi;

import com.trackme.common.form.LoginForm;
import com.trackme.common.utils.R;
import com.trackme.common.vo.MapToolMenuVo;
import com.trackme.common.vo.TerminalCommandMenuVo;
import com.trackme.common.vo.WebMenuVo;
import com.trackme.webgis.annotation.Log;
import com.trackme.webgis.entity.FunctionmodelEntity;
import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.service.FunctionmodelService;
import com.trackme.webgis.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

/**
 * @description 登录
 * @author: wuwenjie
 * @data: 2020/10/10 9:19
 */
@Slf4j
@RestController
@Api(value = "LoginApi", description = "登录相关的接口")
public class LoginApi {

    @Autowired
    private LoginService loginService;

    @Autowired
    private FunctionmodelService functionmodelService;

    /**
     * 登录
     * @param loginForm
     * @return
     */
    @PostMapping("/login")
    @ApiOperation(value = "登录", notes = "登录")
    public R login(@RequestBody LoginForm loginForm, HttpServletRequest request){
        return loginService.login(loginForm,request);
    }

    /**
     * 图片验证码
     * @throws Exception
     */
    @GetMapping("/imageCode")
    @ApiOperation(value = "获取图片验证码", notes = "获取图片验证码")
    public void imageCode(HttpServletResponse response, @RequestParam("uuid") String uuid)throws IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //获取图片验证码
        BufferedImage image = loginService.getCaptcha(response,uuid);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        IOUtils.closeQuietly(out);
    }

    @GetMapping("/userInfo")
    @Log("获取用户信息")
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    public R getLoginInfo(HttpServletRequest request){
        return loginService.getLoginInfo(request);
    }

    @GetMapping("/loginOut")
    @Log("退出登录")
    @ApiOperation(value = "退出登录", notes = "退出登录")
    public R loginOut(HttpServletResponse response){
        return loginService.loginOut(response);
    }


    @GetMapping("/getAllMenu")
    public R getAllMenu(HttpServletRequest request){
       return functionmodelService.getAllMenu(request);
    }

    /**
     * 根据用户权限，获取地图工具栏菜单
     */
    @GetMapping("/getMapToolMenu")
    public R getMapToolMenu(HttpServletRequest request){
        R loginInfo = loginService.getLoginInfo(request);

        UserinfoEntity user = (UserinfoEntity) loginInfo.get("user");
        List<FunctionmodelEntity> funcModes = (List<FunctionmodelEntity>) loginInfo.get("func");

        List<MapToolMenuVo> mapToolMenu = functionmodelService.getMapToolMenu(funcModes);
        return R.ok().put("mapToolMenu",mapToolMenu);
    }

    /**
     * 根据用户权限，获取系统顶部的主菜单
     */
    @GetMapping("/getWebMenu")
    public R getWebMenu(HttpServletRequest request){
        R loginInfo = loginService.getLoginInfo(request);

        UserinfoEntity user = (UserinfoEntity) loginInfo.get("user");
        List<FunctionmodelEntity> funcModes = (List<FunctionmodelEntity>) loginInfo.get("func");

        List<WebMenuVo> webMenu = functionmodelService.getWebMenu(funcModes);
        System.out.println(webMenu);
        return R.ok().put("webMenu",webMenu);
    }

    /**
     * 根据用户权限，获取终端命令菜单
     */
    @GetMapping("/getTerminalCommandMenu")
    public R getTerminalCommandMenu(HttpServletRequest request){
        R loginInfo = loginService.getLoginInfo(request);

        UserinfoEntity user = (UserinfoEntity) loginInfo.get("user");
        List<FunctionmodelEntity> funcModes = (List<FunctionmodelEntity>) loginInfo.get("func");

        List<TerminalCommandMenuVo> terminalCommandMenu = functionmodelService.getTerminalCommandMenu(funcModes);
        return R.ok().put("terminalCommandMenu",terminalCommandMenu);
    }


}
