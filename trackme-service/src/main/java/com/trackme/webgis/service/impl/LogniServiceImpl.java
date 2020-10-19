package com.trackme.webgis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trackme.common.constant.SecretConstant;
import com.trackme.common.form.LoginForm;
import com.trackme.common.jwt.AESSecretUtil;
import com.trackme.common.jwt.JwtHelper;
import com.trackme.common.constant.Constant;
import com.trackme.common.utils.R;
import com.trackme.common.vo.MapToolMenuVo;
import com.trackme.common.vo.TerminalCommandMenuVo;
import com.trackme.common.vo.WebMenuVo;
import com.trackme.webgis.entity.FunctionmodelEntity;
import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.service.*;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @description
 * @author: wuwenjie
 * @data: 2020/10/10 9:19
 */
@Slf4j
@Service
public class LogniServiceImpl implements LoginService {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RoleService roleService;

    @Autowired
    UserinfoService userinfoService;

    @Autowired
    OperationlogService operationlogService;

    @Autowired
    FunctionmodelService functionmodelService;

    @Override
    public R login(LoginForm loginForm,HttpServletRequest request) {
        String uuid = loginForm.getUuid();
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        String imageCode = loginForm.getImageCode();

        String key = Constant.IMAGECODE + uuid;
        String redisRandomCode = redisTemplate.opsForValue().get(key).toString();

        if (StringUtils.isEmpty(username)) {
            return R.error("用户名不能为空");
        }
        if (password == null) {
            return R.error("密码不能为空");
        }
        if (StringUtils.isEmpty(imageCode)) {
            return R.error("验证码不能为空");
        }
        if (!imageCode.equals(redisRandomCode)) {
            return R.error("验证码不正确");
        }

        try {
            UserinfoEntity user = userinfoService.getOne(new QueryWrapper<UserinfoEntity>().eq("loginName", username).eq("password", password));

            if (user == null) {
                log.info(username + " login fail");
                return R.error("用户名或密码错误");
            }
            if (!user.getPassword().equalsIgnoreCase(password)) {
                return R.error("用户名或密码不正确");
            }

            //生成token令牌
            String jwt = JwtHelper.generateJWT(user.getUserid().toString(), user.getName(), request.getHeader("User-Agent"));

            //用户权限
            List<FunctionmodelEntity> funcModes = null;
            if (user.getUserflag() == Constant.USER_FLAG_SUPER_ADMIN ) {
                //超级用户，将加所有权限,可以分配所有管理部门
                funcModes = functionmodelService.list(null);
            } else {
                //根据用户角色获取权限
                funcModes = functionmodelService.getFuncModeByUserID(user.getUserid());
            }

            //根据用户权限，获取地图工具栏菜单
            List<MapToolMenuVo> mapToolMenu = functionmodelService.getMapToolMenu(funcModes);

            //根据用户权限，获取系统顶部的主菜单
            List<WebMenuVo> webMenu = functionmodelService.getWebMenu(funcModes);

            //根据用户权限，获取终端命令菜单
            List<TerminalCommandMenuVo> terminalCommandMenu = functionmodelService.getTerminalCommandMenu(funcModes);

            //日志记录
            operationlogService.saveLoginInfo(user,request);

            return R.ok("登录成功").
                    put("token",jwt).
                    put("mapToolMenu",mapToolMenu).
                    put("webMenu",webMenu).
                    put("terminalCommandMenu",terminalCommandMenu);
        } catch (Exception e) {
            log.error("", e);
            return R.error("程序异常！");
        }
    }

    @Override
    public BufferedImage getCaptcha(HttpServletResponse response, String uuid) {
        int width = 60;
        int height = 20;
        BufferedImage image = new BufferedImage(width, height, 1);

        Graphics g = image.getGraphics();

        Random random = new Random();

        g.setColor(getRandColor(200, 250));
        g.fillRect(0, 0, width, height);

        g.setFont(new Font("Times New Roman", 0, 18));

        g.setColor(getRandColor(160, 200));
        for (int i = 0; i < 155; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }
        String sRand = "";
        for (int i = 0; i < 4; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand = sRand + rand;
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            g.drawString(rand, 13 * i + 6, 16);
        }

        uuid = Constant.IMAGECODE + uuid;
        redisTemplate.opsForValue().set(uuid, sRand, 2, TimeUnit.MINUTES);

        g.dispose();

        return image;
    }

    @Override
    public R getLoginInfo(HttpServletRequest request) {
        String token = getRequestToken(request);
        Claims claims = JwtHelper.parseJWT(token);
        //解密客户编号
        String decryptUserId = AESSecretUtil.decryptToStr((String)claims.get("userId"), SecretConstant.DATAKEY);
        int id = Integer.parseInt(decryptUserId);
        UserinfoEntity user = userinfoService.getById(id);
        return R.ok().put("user",user);
    }

    @Override
    public R loginOut(HttpServletResponse response) {
        response.setHeader("token","null");
        return R.ok("退出登录！");
    }

    private Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

    /**
     * 获取请求的token
     */
    private String getRequestToken(HttpServletRequest httpRequest){
        //从header中获取token
        String token = httpRequest.getHeader("token");

        //如果header中不存在token，则从参数中获取token
        if(StringUtils.isBlank(token)){
            token = httpRequest.getParameter("token");
        }

        return token;
    }
}
