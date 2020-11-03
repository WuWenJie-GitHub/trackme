package com.trackme.webgis.service.impl;

import com.trackme.common.utils.MyStringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.ContractMapper;
import com.trackme.webgis.entity.ContractEntity;
import com.trackme.webgis.service.ContractService;


@Service
public class ContractServiceImpl extends ServiceImpl<ContractMapper, ContractEntity> implements ContractService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper<ContractEntity> wrapper = new QueryWrapper<>();
        if (MyStringUtils.isNotNull(params.get("vehicleOwner"))) {
            wrapper.like("vehicle_owner",params.get("vehicleOwner"));
        }
        if (MyStringUtils.isNotNull(params.get("phone"))) {
            wrapper.eq("phone",params.get("phone"));
        }
        if (MyStringUtils.isNotNull(params.get("vin"))) {
            wrapper.eq("vin",params.get("vin"));
        }
        if (MyStringUtils.isNotNull(params.get("deviceNumber"))) {
            wrapper.eq("device_number",params.get("deviceNumber"));
        }
        if (MyStringUtils.isNotNull(params.get("plateno"))) {
            wrapper.eq("plateno",params.get("plateno"));
        }
        if (MyStringUtils.isNotNull(params.get("endDate"))&&MyStringUtils.isNotNull(params.get("startDate"))) {
            wrapper.between("createDate",new java.sql.Date(Long.parseLong(params.get("startDate").toString()) ),new java.sql.Date(Long.parseLong(params.get("endDate").toString())));
        }

        IPage ipage = this.page(
                new Query<ContractEntity>().getPage(params),
                wrapper
        );

        return new PageUtils(ipage);
    }
}
