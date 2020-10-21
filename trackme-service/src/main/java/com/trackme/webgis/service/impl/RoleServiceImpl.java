package com.trackme.webgis.service.impl;

import com.trackme.common.vo.OptionVo;
import org.springframework.stereotype.Service;

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


@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {


    @Override
    public List<OptionVo> getRoleOptions() {
        List<RoleEntity> roles = this.list(new QueryWrapper<RoleEntity>().eq("deleted", 0));
        if (roles!=null && roles.size()>0) {
            List<OptionVo> options = roles.stream().map(role -> {
                OptionVo option = new OptionVo();
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
        IPage<RoleEntity> page = this.page(
                new Query<RoleEntity>().getPage(params),
                new QueryWrapper<RoleEntity>()
        );

        return new PageUtils(page);
    }
}
