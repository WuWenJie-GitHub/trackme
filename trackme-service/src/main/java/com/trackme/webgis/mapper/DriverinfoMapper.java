package com.trackme.webgis.mapper;

import com.trackme.webgis.entity.DriverinfoEntity;
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
 * @date 2020-10-13 10:31:04
 */
@Mapper
public interface DriverinfoMapper extends BaseMapper<DriverinfoEntity> {

    List<Map<String,Object>> selectUserDriPages(@Param("page") int page, @Param("limit") int limit, @Param("userid") Integer userid);

    List<DriverinfoEntity> selectUserDris(@Param("userid") Integer userid);
}
