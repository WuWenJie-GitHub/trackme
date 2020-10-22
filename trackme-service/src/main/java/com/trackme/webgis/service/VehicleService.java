package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;
import com.trackme.webgis.entity.VehicleEntity;

import java.util.Map;

/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:09
 */
public interface VehicleService extends IService<VehicleEntity> {

    R getVehicleTree(int depid);
}



