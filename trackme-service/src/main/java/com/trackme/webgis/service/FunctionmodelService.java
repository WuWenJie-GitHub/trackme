package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.R;
import com.trackme.common.vo.*;
import com.trackme.webgis.entity.FunctionmodelEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    R getAllMenu();

    List<FuncTreeVo> getFuncTrees();

    List<FunctionmodelEntity> getRoleFunc(Integer roleid);
}



