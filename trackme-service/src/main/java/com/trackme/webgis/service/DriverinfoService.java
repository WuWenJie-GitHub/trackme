package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.webgis.entity.DriverinfoEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:10
 */
public interface DriverinfoService extends IService<DriverinfoEntity> {

    PageUtils getUserDriPages(Map<String,Object> params, HttpServletRequest request);

    List<DriverinfoEntity> getUserDris(Integer userid);
}



