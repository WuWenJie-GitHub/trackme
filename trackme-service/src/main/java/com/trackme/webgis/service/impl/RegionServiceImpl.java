package com.trackme.webgis.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.RegionMapper;
import com.trackme.webgis.entity.RegionEntity;
import com.trackme.webgis.service.RegionService;


@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, RegionEntity> implements RegionService {


}
