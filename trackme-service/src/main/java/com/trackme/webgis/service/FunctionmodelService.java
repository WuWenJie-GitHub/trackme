package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.vo.MapToolMenuVo;
import com.trackme.common.vo.TerminalCommandMenuVo;
import com.trackme.common.vo.WebMenuVo;
import com.trackme.webgis.entity.FunctionmodelEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:10
 */
public interface FunctionmodelService extends IService<FunctionmodelEntity> {

    List<FunctionmodelEntity> getFuncModeByUserID(Integer userid);

    List<MapToolMenuVo> getMapToolMenu(List<FunctionmodelEntity> funcModes);

    List<WebMenuVo> getWebMenu(List<FunctionmodelEntity> funcModes);

    List<TerminalCommandMenuVo> getTerminalCommandMenu(List<FunctionmodelEntity> funcModes);
}



