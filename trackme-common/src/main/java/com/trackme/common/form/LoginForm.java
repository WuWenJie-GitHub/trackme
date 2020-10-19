package com.trackme.common.form;

import lombok.Data;

/**
 * @description 登录表单
 * @author: wuwenjie
 * @data: 2020/10/9 17:27
 */
@Data
public class LoginForm {
    private String username;
    private String password;
    private String imageCode;
    private String uuid;
}
