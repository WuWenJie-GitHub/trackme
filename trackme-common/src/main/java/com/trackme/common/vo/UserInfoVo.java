package com.trackme.common.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description user
 * @author: wuwenjie
 * @data: 2020/10/21 9:18
 */
@Data
public class UserInfoVo  {

    private Integer userid;

    private String name;

    private String loginname;

    private String password;

    private String remark;

    private String userstate;

    private Integer roleid;

    private String rolename;

    private Date createdate;

    private String owner;

    private List<Integer> depids;
}
