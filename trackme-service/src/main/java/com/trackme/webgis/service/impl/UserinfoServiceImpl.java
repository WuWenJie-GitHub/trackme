package com.trackme.webgis.service.impl;

import com.trackme.common.jwt.JwtHelper;
import com.trackme.common.utils.R;
import com.trackme.common.vo.UserInfoVo;
import com.trackme.webgis.entity.DepartmentEntity;
import com.trackme.webgis.entity.UserdepartmentEntity;
import com.trackme.webgis.entity.UserroleEntity;
import com.trackme.webgis.service.LoginService;
import com.trackme.webgis.service.UserdepartmentService;
import com.trackme.webgis.service.UserroleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.UserinfoMapper;
import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.service.UserinfoService;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;


@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, UserinfoEntity> implements UserinfoService {

    @Autowired
    UserdepartmentService userdepartmentService;

    @Autowired
    UserroleService userroleService;

    @Autowired
    LoginService loginService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        int page = Integer.parseInt(params.get("page").toString());
        int limit = Integer.parseInt(params.get("limit").toString());
        page = limit * page - limit;
        List<UserInfoVo> userInfoVos =  baseMapper.selectUserInfo(page,limit);
        Integer count = baseMapper.selectCount(null);
        PageUtils pageUtils = new PageUtils(userInfoVos, count, page, limit);
        return pageUtils;
    }

    @Override
    @Transactional
    public void updateUserInfoVo(UserInfoVo userInfoVo) {
        UserinfoEntity user = new UserinfoEntity();
        BeanUtils.copyProperties(userInfoVo,user);
        baseMapper.updateById(user);

        userdepartmentService.remove(new QueryWrapper<UserdepartmentEntity>().eq("userId",user.getUserid()));

        List<Integer> depids = userInfoVo.getDepids();
        if (null != depids && depids.size()>0) {
            List<UserdepartmentEntity> userdepartmentEntityList = depids.stream().map(d -> {
                UserdepartmentEntity userDep = new UserdepartmentEntity();
                userDep.setUserid(user.getUserid());
                userDep.setDepid(d);
                return userDep;
            }).collect(Collectors.toList());

            userdepartmentService.saveBatch(userdepartmentEntityList);
        }
        userroleService.remove(new QueryWrapper<UserroleEntity>().eq("userId",user.getUserid()));

        UserroleEntity ur = new UserroleEntity();
        BeanUtils.copyProperties(userInfoVo,ur);
        userroleService.save(ur);

    }

    @Override
    @Transactional
    public void saveUserInfoVo(UserInfoVo userInfoVo,HttpServletRequest request) {
        String requestToken = loginService.getRequestToken(request);
        JwtHelper.parseJWT(requestToken);
        R r = loginService.getLoginInfo(JwtHelper.parseJWT(requestToken).get("userId").toString());
        UserinfoEntity login = (UserinfoEntity) r.get("user");

        UserinfoEntity user = new UserinfoEntity();
        BeanUtils.copyProperties(userInfoVo,user);
        user.setCreatedate(new Date());
        user.setOwnerid(login.getUserid().toString());
        user.setOwner(login.getName());
        baseMapper.insert(user);

        List<Integer> depids = userInfoVo.getDepids();
        if (null != depids && depids.size()>0) {
            List<UserdepartmentEntity> userdepartmentEntityList = depids.stream().map(d -> {
                UserdepartmentEntity userDep = new UserdepartmentEntity();
                userDep.setUserid(user.getUserid());
                userDep.setDepid(d);
                return userDep;
            }).collect(Collectors.toList());

            userdepartmentService.saveBatch(userdepartmentEntityList);
        }

        UserroleEntity ur = new UserroleEntity();
        ur.setUserid(user.getUserid());
        ur.setRoleid(userInfoVo.getRoleid());
        userroleService.save(ur);

    }

    @Override
    public UserInfoVo getUserInfoVo(Integer userid) {
        UserinfoEntity user = baseMapper.selectById(userid);
        UserInfoVo userInfoVo = new UserInfoVo();

        BeanUtils.copyProperties(user,userInfoVo);

        List<UserdepartmentEntity> uds = userdepartmentService.list(new QueryWrapper<UserdepartmentEntity>().eq("userId", user.getUserid()));
        List<Integer> depids = uds.stream().map(ud -> {
            return ud.getDepid();
        }).collect(Collectors.toList());
        userInfoVo.setDepids(depids);

        List<UserroleEntity> ur = userroleService.list(new QueryWrapper<UserroleEntity>().eq("userId", user.getUserid()));
        userInfoVo.setRoleid(ur.get(0).getRoleid());
        return userInfoVo;
    }

}
