package com.trackme.webgis.service.impl;

import com.trackme.common.utils.MyStringUtils;
import com.trackme.common.vo.Option;
import com.trackme.common.vo.RoleVo;
import com.trackme.webgis.entity.FunctionmodelEntity;
import com.trackme.webgis.entity.RolefuncEntity;
import com.trackme.webgis.service.FunctionmodelService;
import com.trackme.webgis.service.RolefuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.RoleMapper;
import com.trackme.webgis.entity.RoleEntity;
import com.trackme.webgis.service.RoleService;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {

    @Autowired
    FunctionmodelService functionmodelService;

    @Autowired
    RolefuncService rolefuncService;

    @Override
    public List<Option> getRoleOptions() {
        List<RoleEntity> roles = this.list(new QueryWrapper<RoleEntity>().eq("deleted", 0));
        if (roles!=null && roles.size()>0) {
            List<Option> options = roles.stream().map(role -> {
                Option option = new Option();
                option.setValue(role.getRoleid().toString());
                option.setLabel(role.getName());
                return option;
            }).collect(Collectors.toList());
            return options;
        }
        return null;
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper<RoleEntity> wrapper = new QueryWrapper<>();
        if (MyStringUtils.isNotNull(params.get("roleName"))) {
            wrapper.like("name",params.get("roleName".toString()));
        }
        IPage<RoleEntity> page = this.page(
                new Query<RoleEntity>().getPage(params),
                wrapper
        );
        return new PageUtils(page);
    }

    @Override
    public RoleVo getRoleInfo(Integer roleid) {
        RoleEntity role = baseMapper.selectById(roleid);

        List<FunctionmodelEntity> list = functionmodelService.getRoleFunc(roleid);
        List<Integer> menuIdList = list.stream().map(f -> {
            return f.getFuncid();
        }).collect(Collectors.toList());

        return new RoleVo(role.getName(),roleid,role.getRemark(),menuIdList);
    }

    @Override
    @Transactional
    public void updateRoleVo(RoleVo roleVo) {
        RoleEntity role = new RoleEntity();
        role.setRemark(roleVo.getRemark());
        role.setName(roleVo.getRoleName());
        role.setRoleid(roleVo.getRoleId());
        baseMapper.updateById(role);


        //先把角色对应的数据删除
        rolefuncService.remove(new QueryWrapper<RolefuncEntity>().eq("role_id",roleVo.getRoleId()));

        //重新新增
        if (null != roleVo.getMenuIdList() && roleVo.getMenuIdList().size()>0) {
            List<RolefuncEntity> rfs = roleVo.getMenuIdList().stream().filter(f ->
                    f != -666666 && f != 1 && f != 2 // 前后端功能菜单节点的id为12 -666666为半选中节点
            ).map(f -> {
                RolefuncEntity rf = new RolefuncEntity();
                rf.setRoleId(roleVo.getRoleId());
                rf.setSysFuncId(f);
                return rf;
            }).collect(Collectors.toList());

            rolefuncService.saveBatch(rfs);
        }
    }

    @Override
    @Transactional
    public void saveRoleVo(RoleVo roleVo) {
        RoleEntity role = new RoleEntity();
        role.setRemark(roleVo.getRemark());
        role.setCreatedate(new Date());
        role.setName(roleVo.getRoleName());
        baseMapper.insert(role);

        Integer roleid = role.getRoleid();
        if (null != roleVo.getMenuIdList() && roleVo.getMenuIdList().size()>0) {
            List<RolefuncEntity> rfs = roleVo.getMenuIdList().stream().filter(f ->
                    f != -666666 && f != 1 && f != 2 // 前后端功能菜单节点的id为12 -666666为半选中节点
            ).map(f -> {
                RolefuncEntity rf = new RolefuncEntity();
                rf.setRoleId(roleid);
                rf.setSysFuncId(f);
                return rf;
            }).collect(Collectors.toList());

            rolefuncService.saveBatch(rfs);
        }

    }
}
