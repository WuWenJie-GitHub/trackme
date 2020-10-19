package com.trackme.webgis.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
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


}
