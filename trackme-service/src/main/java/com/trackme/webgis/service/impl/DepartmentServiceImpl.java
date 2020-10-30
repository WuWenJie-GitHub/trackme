package com.trackme.webgis.service.impl;

import com.trackme.common.jwt.JwtHelper;
import com.trackme.common.utils.R;
import com.trackme.common.vo.DepartTreeeVo;
import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.service.LoginService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.trackme.webgis.mapper.DepartmentMapper;
import com.trackme.webgis.entity.DepartmentEntity;
import com.trackme.webgis.service.DepartmentService;

import javax.servlet.http.HttpServletRequest;


@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, DepartmentEntity> implements DepartmentService {

    @Autowired
    LoginService loginService;

    @Override
    public List<DepartmentEntity> getUserDeps(Integer userid) {
        return baseMapper.selectUserDeps(userid);
    }

    @Override
    public PageUtils userDepPages(Map<String, Object> params, HttpServletRequest request) {
        int page = Integer.parseInt(params.get("page").toString());
        int limit = Integer.parseInt(params.get("limit").toString());
        page = limit * page - limit;

        String token = loginService.getRequestToken(request);
        Claims claims = JwtHelper.parseJWT(token);
        R r = loginService.getLoginInfo((String) claims.get("userId"));
        UserinfoEntity u = (UserinfoEntity) r.get("user");

        List<DepartmentEntity> list = baseMapper.selectUserDepPages(page,limit,u.getUserid());

        return new PageUtils(list,getUserDeps(u.getUserid()).size(),page,limit);
    }

    @Override
    @Cacheable(value = "depTree")
    public List<DepartTreeeVo> getDepTree() {
        List<DepartmentEntity> dep = baseMapper.selectList(null);
        return  dep.stream().map(d -> {
            DepartTreeeVo vo = new DepartTreeeVo();
            vo.setId(d.getDepid().toString());
            vo.setName(d.getName());
            return vo;
        }).collect(Collectors.toList());
    }


}
