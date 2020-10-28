package com.trackme.webgis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trackme.common.utils.IPUtils;
import com.trackme.common.utils.MyStringUtils;
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

    @Override
    public PageUtils queryParams(Map<String, Object> params) {
        QueryWrapper<OperationlogEntity> wrapper = new QueryWrapper<>();
        if (MyStringUtils.isNotNull((String) params.get("name"))) {
            wrapper.eq("userName",(String) params.get("name"));
        }
        if (MyStringUtils.isNotNull(params.get("endDate"))&&MyStringUtils.isNotNull(params.get("startDate"))) {
            wrapper.between("createDate",new java.sql.Date(Long.parseLong(params.get("startDate").toString()) ),new java.sql.Date(Long.parseLong(params.get("endDate").toString())));
        }

        IPage<OperationlogEntity> iPage = this.page(
                new Query<OperationlogEntity>().getPage(params),
                wrapper.orderByDesc("createDate")
        );

        return new PageUtils(iPage);
    }
}
