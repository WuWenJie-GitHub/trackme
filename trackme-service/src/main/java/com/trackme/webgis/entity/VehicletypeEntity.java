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
@TableName("vehicletype")
public class VehicletypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private BigDecimal id;
	/**
	 * $column.comments
	 */
	private Integer amount;
	/**
	 * $column.comments
	 */
	private Integer code;
	/**
	 * $column.comments
	 */
	private String description;
	/**
	 * $column.comments
	 */
	private Integer parentcode;
	/**
	 * $column.comments
	 */
	private String name;

}
