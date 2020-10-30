package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;
import com.trackme.common.vo.DepartTreeeVo;
import com.trackme.webgis.entity.DepartmentEntity;

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
public interface DepartmentService extends IService<DepartmentEntity> {

    List<DepartmentEntity> getUserDeps(Integer userid);

    PageUtils userDepPages(Map<String,Object> params, HttpServletRequest request);

    List<DepartTreeeVo>  getDepTree();
}



