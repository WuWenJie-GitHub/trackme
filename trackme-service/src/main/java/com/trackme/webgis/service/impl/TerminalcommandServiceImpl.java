package com.trackme.webgis.service.impl;

import com.trackme.common.utils.MyStringUtils;

import org.springframework.stereotype.Service;

import java.sql.Date;
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
        String plateno = (String) params.get("plateno");
        String simno = (String) params.get("simno");

        QueryWrapper<TerminalcommandEntity> wrapper = new QueryWrapper<>();
        if (MyStringUtils.isNotNull(plateno)) {
            wrapper.eq("plateNo",plateno);
        }
        if (MyStringUtils.isNotNull(simno)) {
            wrapper.eq("simNo",simno);
        }
        if (MyStringUtils.isNotNull(params.get("endDate"))&&MyStringUtils.isNotNull(params.get("startDate"))) {
            wrapper.between("updateDate",new Date(Long.parseLong(params.get("startDate").toString()) ),new Date(Long.parseLong(params.get("endDate").toString())));
        }

        IPage<TerminalcommandEntity> page = this.page(
                new Query<TerminalcommandEntity>().getPage(params),
                wrapper.orderByDesc("createDate")
        );

        return new PageUtils(page);
    }
}
