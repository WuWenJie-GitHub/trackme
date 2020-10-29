package com.trackme.webgis.mapper;

import com.trackme.webgis.entity.FunctionmodelEntity;
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
public interface FunctionmodelMapper extends BaseMapper<FunctionmodelEntity> {

    List<FunctionmodelEntity> selectRoleFunc(@Param("roleid") Integer roleid);
}
