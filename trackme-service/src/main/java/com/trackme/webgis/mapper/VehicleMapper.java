package com.trackme.webgis.mapper;

import com.trackme.webgis.entity.VehicleEntity;
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
public interface VehicleMapper extends BaseMapper<VehicleEntity> {

    List<Map<String,Object>> selectVehicleTree(@Param("depid") int depid);

    List<Map<String,Object>> selectVehicleInfos(@Param("vehicleIds") Integer[] vehicleIds);

    List<Map> selectStaticVehicleInfo(@Param("vehicleId") String vehicleId,@Param("depIds") Integer[] depIds);
}
