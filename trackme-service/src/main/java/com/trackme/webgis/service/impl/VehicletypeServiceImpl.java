package com.trackme.webgis.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.VehicletypeMapper;
import com.trackme.webgis.entity.VehicletypeEntity;
import com.trackme.webgis.service.VehicletypeService;


@Service
public class VehicletypeServiceImpl extends ServiceImpl<VehicletypeMapper, VehicletypeEntity> implements VehicletypeService {


}
