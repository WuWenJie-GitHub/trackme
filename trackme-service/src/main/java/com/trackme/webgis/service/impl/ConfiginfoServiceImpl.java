package com.trackme.webgis.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.ConfiginfoMapper;
import com.trackme.webgis.entity.ConfiginfoEntity;
import com.trackme.webgis.service.ConfiginfoService;


@Service
public class ConfiginfoServiceImpl extends ServiceImpl<ConfiginfoMapper, ConfiginfoEntity> implements ConfiginfoService {


}
