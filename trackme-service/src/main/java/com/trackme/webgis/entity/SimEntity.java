package com.trackme.webgis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wwj
 * @email ${email}
 * @date 2020-10-13 10:31:03
 */
@Data
@TableName("sim")
public class SimEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer supplierSim;
	/**
	 * $column.comments
	 */
	private Integer sim;

}
