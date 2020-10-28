package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.webgis.entity.TerminalEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:10
 */
public interface TerminalService extends IService<TerminalEntity> {

    PageUtils getUserTerPages(Map<String,Object> params, HttpServletRequest request);
}



