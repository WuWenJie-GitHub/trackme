package com.trackme.webgis.service.impl;

import com.trackme.webgis.entity.RoleEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.TerminalcommandMapper;
import com.trackme.webgis.entity.TerminalcommandEntity;
import com.trackme.webgis.service.TerminalcommandService;


@Service
public class TerminalcommandServiceImpl extends ServiceImpl<TerminalcommandMapper, TerminalcommandEntity> implements TerminalcommandService {


    @Override
    public PageUtils queryParams(Map<String, Object> params) {
        IPage<TerminalcommandEntity> page = this.page(
                new Query<TerminalcommandEntity>().getPage(params),
                new QueryWrapper<TerminalcommandEntity>().orderByDesc("createDate")
        );

        return new PageUtils(page);
    }
}
