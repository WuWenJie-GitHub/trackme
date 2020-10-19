package com.trackme.webgis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
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
@TableName("region")
public class RegionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private BigDecimal id;
	/**
	 * $column.comments
	 */
	private String centerLatLng;
	/**
	 * $column.comments
	 */
	private String code;
	/**
	 * $column.comments
	 */
	private String latLons;
	/**
	 * $column.comments
	 */
	private Integer level;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private BigDecimal parent;
	/**
	 * $column.comments
	 */
	private String fullname;

}
