package com.trackme.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @description 角色vo
 * @author: wuwenjie
 * @data: 2020/10/29 15:04
 */
@Data
public class RoleVo {
    private String roleName;
    private int roleId;
    private String remark;
    private List<Integer> menuIdList;

    public RoleVo() {
    }

    public RoleVo(String roleName, int roleId, String remark, List<Integer> menuIdList) {
        this.roleName = roleName;
        this.roleId = roleId;
        this.remark = remark;
        this.menuIdList = menuIdList;
    }
}
