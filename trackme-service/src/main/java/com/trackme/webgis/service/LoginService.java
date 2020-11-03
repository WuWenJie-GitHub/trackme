package com.trackme.webgis.service;

import com.trackme.common.form.LoginForm;
import com.trackme.common.utils.R;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @description 登录
 * @author: wuwenjie
 * @data: 2020/10/10 9:18
 */
public interface LoginService {

    R login(LoginForm loginForm, HttpServletRequest request);

    BufferedImage getCaptcha(HttpServletResponse response, String uuid);

    R getLoginInfo(String userid);

    R loginOut(HttpServletResponse response);

    String getRequestToken(HttpServletRequest request);

    String getEncryptUserid();
}
