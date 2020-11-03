package com.trackme.webgis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trackme.common.jwt.JwtHelper;
import com.trackme.common.utils.R;
import com.trackme.webgis.entity.DepartmentEntity;
import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.service.LoginService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.TerminalMapper;
import com.trackme.webgis.entity.TerminalEntity;
import com.trackme.webgis.service.TerminalService;

import javax.servlet.http.HttpServletRequest;


@Service
public class TerminalServiceImpl extends ServiceImpl<TerminalMapper, TerminalEntity> implements TerminalService {

    @Autowired
    LoginService loginService;

    @Override
    public PageUtils getUserTerPages(Map<String, Object> params) {
        int page = Integer.parseInt(params.get("page").toString());
        int limit = Integer.parseInt(params.get("limit").toString());
        page = limit * page - limit;

        R r = loginService.getLoginInfo(loginService.getEncryptUserid());

        List<DepartmentEntity> deps = (List<DepartmentEntity>) r.get("deps");
        List<Integer> depIds = deps.stream().map(dep -> {
            return dep.getDepid();
        }).collect(Collectors.toList());

        IPage<TerminalEntity> iPage = this.page(
                new Query<TerminalEntity>().getPage(params),
                new QueryWrapper<TerminalEntity>().in("DepId", depIds)
        );

        return new PageUtils(iPage);
    }
}
