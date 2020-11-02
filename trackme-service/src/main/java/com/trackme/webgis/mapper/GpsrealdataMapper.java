package com.trackme.webgis.mapper;

import com.trackme.webgis.entity.GpsrealdataEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

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
public interface GpsrealdataMapper extends BaseMapper<GpsrealdataEntity> {
	 List<Map> selectGpsRealData(List<Integer>depIds);
	 List<Map> selectGpsRealData(List<Integer>depIds, Double maxLatitude, Double maxLongitude, Double minLatitude, Double minLongitude, Integer currentPage, Integer pageSize);

}
