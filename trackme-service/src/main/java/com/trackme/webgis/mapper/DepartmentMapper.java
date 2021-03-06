package com.trackme.webgis.mapper;

import com.trackme.webgis.entity.DepartmentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:31:04
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<DepartmentEntity> {

    List<DepartmentEntity> selectUserDeps(@Param("userid") Integer userid);

    List<DepartmentEntity> selectUserDepPages(@Param("page") int page, @Param("limit") int limit, @Param("userid") Integer userid);
}
