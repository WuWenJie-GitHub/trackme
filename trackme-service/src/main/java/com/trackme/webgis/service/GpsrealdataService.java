package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.webgis.entity.GpsrealdataEntity;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:10
 */
public interface GpsrealdataService extends IService<GpsrealdataEntity> {
   //矩形查车 strRoutePoints: 5,6:2,3;4.5;...
    public List<Map> selectGpsRealData(List<Integer>depIds, String strRoutePoints,Integer currentPage, Integer pageSize);

    public List<Map> selectGpsRealData(List<Integer>depIds);
}



