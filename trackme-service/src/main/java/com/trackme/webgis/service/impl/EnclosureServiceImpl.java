package com.trackme.webgis.service.impl;

import com.trackme.common.constant.Constant;
import com.trackme.common.utils.R;
import com.trackme.common.vo.MapEnclosureTreeVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.EnclosureMapper;
import com.trackme.webgis.entity.EnclosureEntity;
import com.trackme.webgis.service.EnclosureService;


@Service
public class EnclosureServiceImpl extends ServiceImpl<EnclosureMapper, EnclosureEntity> implements EnclosureService {


    @Override
    public List<MapEnclosureTreeVo> getEnclosureTree() {
        List<EnclosureEntity> enclosures = baseMapper.selectList(new QueryWrapper<EnclosureEntity>().eq("deleted", 0).orderByDesc("name"));
        List<MapEnclosureTreeVo> all = new ArrayList<>();
        if (null != enclosures && enclosures.size()>0) {
            //多边形电子围栏
            MapEnclosureTreeVo polygon = new MapEnclosureTreeVo("多边形电子围栏");
            //矩形电子围栏
            MapEnclosureTreeVo rect = new MapEnclosureTreeVo("矩形电子围栏");
            //圆形电子围栏
            MapEnclosureTreeVo circle = new MapEnclosureTreeVo("圆形电子围栏");
            //关键点
            MapEnclosureTreeVo keyPoint = new MapEnclosureTreeVo("关键点");
            //路线
            MapEnclosureTreeVo route = new MapEnclosureTreeVo("路线");
            //地图标注
            MapEnclosureTreeVo marker = new MapEnclosureTreeVo("地图标注");

            List<MapEnclosureTreeVo> polygonList = new ArrayList<>();
            List<MapEnclosureTreeVo> rectList = new ArrayList<>();
            List<MapEnclosureTreeVo> circleList= new ArrayList<>();
            List<MapEnclosureTreeVo> keyPointList = new ArrayList<>();
            List<MapEnclosureTreeVo> routeList = new ArrayList<>();
            List<MapEnclosureTreeVo> markerList = new ArrayList<>();

            for (EnclosureEntity enc : enclosures) {
                if (enc.getKeypoint()==1) {
                    MapEnclosureTreeVo r = new MapEnclosureTreeVo();
                    r.setId(enc.getEnclosureid().toString());
                    r.setName(enc.getName());
                    keyPointList.add(r);
                }else{
                    if (enc.getEnclosuretype().equals(Constant.MapEnclosure.POLYGON.getValue())) {
                        MapEnclosureTreeVo p = new MapEnclosureTreeVo();
                        p.setId(enc.getEnclosureid().toString());
                        p.setName(enc.getName());
                        polygonList.add(p);
                    }
                    if (enc.getEnclosuretype().equals(Constant.MapEnclosure.RECT.getValue())) {
                        MapEnclosureTreeVo r = new MapEnclosureTreeVo();
                        r.setId(enc.getEnclosureid().toString());
                        r.setName(enc.getName());
                        rectList.add(r);
                    }
                    if (enc.getEnclosuretype().equals(Constant.MapEnclosure.CIRCLE.getValue())) {
                        MapEnclosureTreeVo p = new MapEnclosureTreeVo();
                        p.setId(enc.getEnclosureid().toString());
                        p.setName(enc.getName());
                        circleList.add(p);
                    }
                    if (enc.getEnclosuretype().equals(Constant.MapEnclosure.ROUTE.getValue())) {
                        MapEnclosureTreeVo r = new MapEnclosureTreeVo();
                        r.setId(enc.getEnclosureid().toString());
                        r.setName(enc.getName());
                        routeList.add(r);
                    }
                    if (enc.getEnclosuretype().equals(Constant.MapEnclosure.MARKER.getValue())) {
                        MapEnclosureTreeVo p = new MapEnclosureTreeVo();
                        p.setId(enc.getEnclosureid().toString());
                        p.setName(enc.getName());
                        markerList.add(p);
                    }
                }
            }

            polygon.setChildren(polygonList);
            rect.setChildren(rectList);
            circle.setChildren(circleList);
            route.setChildren(routeList);
            keyPoint.setChildren(keyPointList);
            marker.setChildren(markerList);

            if (polygon.getChildren()!=null&&polygon.getChildren().size()>0) {
                all.add(polygon);
            }
            if (rect.getChildren()!=null&&rect.getChildren().size()>0) {
                all.add(rect);
            }
            if (circle.getChildren()!=null&&circle.getChildren().size()>0) {
                all.add(circle);
            }
            if (route.getChildren()!=null&&route.getChildren().size()>0) {
                all.add(route);
            }
            if (keyPoint.getChildren()!=null&&keyPoint.getChildren().size()>0) {
                all.add(keyPoint);
            }
            if (marker.getChildren()!=null&&marker.getChildren().size()>0) {
                all.add(marker);
            }
        }

        return all;
    }
}
