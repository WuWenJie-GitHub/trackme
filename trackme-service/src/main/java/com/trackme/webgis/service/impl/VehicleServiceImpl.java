package com.trackme.webgis.service.impl;

import com.trackme.common.utils.R;
import com.trackme.common.vo.VehicleTreeVo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.VehicleMapper;
import com.trackme.webgis.entity.VehicleEntity;
import com.trackme.webgis.service.VehicleService;


@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, VehicleEntity> implements VehicleService {


    @Override
    @Cacheable(value = "depVehTree", key = "#root.args[0]")
    public R getVehicleTree(int depid) {
        List<Map<String,Object>> tree = baseMapper.selectVehicleTree(depid);
        List<VehicleTreeVo> vos = tree.stream().map(tr -> {
            VehicleTreeVo vo = new VehicleTreeVo();
            vo.setId(tr.get("vehicleId").toString());
            vo.setName(tr.get("plateNo").toString());
            vo.setOnline(tr.get("online").toString());
            return vo;
        }).collect(Collectors.toList());
        return R.ok().put("vehicleTree",vos);
    }

    @Override
    public R getVehicleInfos(Integer[] vehicleIds) {
        List<Map<String,Object>> vehicleInfos =   baseMapper.selectVehicleInfos(vehicleIds);
        return R.ok().put("vehicleInfos",vehicleInfos);
    }
}
