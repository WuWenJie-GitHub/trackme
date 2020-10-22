package com.trackme.webgis.service.impl;

import com.trackme.webgis.entity.DepartmentEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.UserinfoMapper;
import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.service.UserinfoService;


@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, UserinfoEntity> implements UserinfoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        int page = Integer.parseInt(params.get("page").toString());
        int limit = Integer.parseInt(params.get("limit").toString());
        page = limit * page - limit;
        List<Map<String,Object>> list =  baseMapper.selectUserInfo(page,limit);
        Integer count = baseMapper.selectCount(null);
        PageUtils pageUtils = new PageUtils(list, count, page, limit);
        return pageUtils;
    }

    @Override
    public Map<String, Object> getUserStateOption() {
        return null;
    }

}
