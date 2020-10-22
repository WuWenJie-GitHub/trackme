package com.trackme.webgis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.R;
import com.trackme.common.vo.MapEnclosureTreeVo;
import com.trackme.webgis.entity.EnclosureEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 11:30:10
 */
public interface EnclosureService extends IService<EnclosureEntity> {

    List<MapEnclosureTreeVo> getEnclosureTree();
}



