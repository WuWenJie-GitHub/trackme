package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.vo.UserInfoVo;
import com.trackme.webgis.entity.DepartmentEntity;
import com.trackme.webgis.entity.UserinfoEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:09
 */
public interface UserinfoService extends IService<UserinfoEntity> {

    PageUtils queryPage(Map<String,Object> params);

    void updateUserInfoVo(UserInfoVo userInfoVo);

    void saveUserInfoVo(UserInfoVo userInfoVo,HttpServletRequest request);

    UserInfoVo getUserInfoVo(Integer userid);
}



