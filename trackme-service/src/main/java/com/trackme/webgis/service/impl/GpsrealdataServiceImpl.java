package com.trackme.webgis.service.impl;

import com.trackme.common.utils.R;
import com.trackme.webgis.entity.PointLatLng;
import com.trackme.webgis.service.LoginService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.GpsrealdataMapper;
import com.trackme.webgis.entity.GpsrealdataEntity;
import com.trackme.webgis.service.GpsrealdataService;


@Service
public class GpsrealdataServiceImpl extends ServiceImpl<GpsrealdataMapper, GpsrealdataEntity> implements GpsrealdataService {


    public List<Map> selectGpsRealData(List<Integer>depIds,String strRoutePoints,Integer currentPage, Integer pageSize){
        double maxLatitude=0;

        double maxLongitude=0;

        double minLatitude=1000;

        double minLongitude=1000;
        //当前页索引
        currentPage = pageSize * currentPage - pageSize;
        String[] points=strRoutePoints.split(";");
        if(points.length>0){
            //获取矩形区域范围
            for (String strPt : points) {
                if (StringUtil.isNullOrEmpty(strPt))
                    continue;
                String[] pt = strPt.split(",");
                Double lng = Double.parseDouble(pt[1]);
                Double lat = Double.parseDouble(pt[0]);

                if(lat > maxLatitude)
                    maxLatitude = lat;
                if(lat < minLatitude)
                    minLatitude = lat;
                if(lng > maxLongitude)
                    maxLongitude = lng;
                if(lng < minLongitude)
                    minLongitude = lng;
            }

            PointLatLng p1 = MapFixService.gcjToWgs(maxLatitude, maxLongitude);
            PointLatLng p2 = MapFixService.gcjToWgs(minLatitude, minLongitude);
            maxLatitude = p1.getLat();
            maxLongitude = p1.getLng();
            minLatitude = p2.getLat();
            minLongitude = p2.getLng();
            return baseMapper.selectGpsRealData(depIds,maxLatitude,maxLongitude,minLatitude,minLongitude,currentPage,pageSize);
        }
        return baseMapper.selectGpsRealData(depIds,maxLatitude,maxLongitude,minLatitude,minLongitude,currentPage,pageSize);
    }

    @Override
    public List<Map> selectGpsRealData(List<Integer> depIds) {
        return baseMapper.selectGpsRealData(depIds);
    }

}
