package com.trackme.webgis.service.impl;

import com.trackme.common.utils.R;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.DepartmentMapper;
import com.trackme.webgis.entity.DepartmentEntity;
import com.trackme.webgis.service.DepartmentService;


@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, DepartmentEntity> implements DepartmentService {


    @Override
    public List<DepartmentEntity> getUserDeps(Integer userid) {
        return baseMapper.selectUserDeps(userid);
    }


}
