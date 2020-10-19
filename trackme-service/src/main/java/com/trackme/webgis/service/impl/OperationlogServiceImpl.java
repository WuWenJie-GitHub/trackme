package com.trackme.webgis.service.impl;

import com.trackme.common.utils.IPUtils;
import com.trackme.webgis.entity.UserinfoEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.OperationlogMapper;
import com.trackme.webgis.entity.OperationlogEntity;
import com.trackme.webgis.service.OperationlogService;

import javax.servlet.http.HttpServletRequest;


@Service
public class OperationlogServiceImpl extends ServiceImpl<OperationlogMapper, OperationlogEntity> implements OperationlogService {


    @Override
    public void saveLoginInfo(UserinfoEntity user, HttpServletRequest request) {
        OperationlogEntity log = new OperationlogEntity();
        log.setUsername(user.getName());
        log.setUserid(user.getUserid());
        log.setRemark("登录成功");
        log.setIp(IPUtils.getIpAddr(request));
        log.setUrl(request.getRequestURI());
        log.setCreatedate(new Date());
        this.baseMapper.insert(log);
    }
}
