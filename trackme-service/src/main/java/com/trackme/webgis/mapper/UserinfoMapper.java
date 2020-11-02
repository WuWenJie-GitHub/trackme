package com.trackme.webgis.mapper;

import com.trackme.common.vo.UserInfoVo;
import com.trackme.webgis.entity.UserinfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:31:03
 */
@Mapper
public interface UserinfoMapper extends BaseMapper<UserinfoEntity> {

    List<UserInfoVo> selectUserInfo(@Param("page") int page, @Param("limit")int limit,@Param("loginname") Object loginname,@Param("userstate") Object userstate,@Param("roleid") Object roleid);

}
