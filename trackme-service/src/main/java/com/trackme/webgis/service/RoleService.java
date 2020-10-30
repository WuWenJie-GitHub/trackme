package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.vo.Option;
import com.trackme.common.vo.RoleVo;
import com.trackme.webgis.entity.RoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:10
 */
public interface RoleService extends IService<RoleEntity> {

    List<Option> getRoleOptions();

    PageUtils queryPage(Map<String,Object> params);

    RoleVo getRoleInfo(Integer roleid);

    void updateRoleVo(RoleVo roleVo);

    void saveRoleVo(RoleVo roleVo);

}



