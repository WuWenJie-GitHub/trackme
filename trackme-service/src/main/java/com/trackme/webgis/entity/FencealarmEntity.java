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
 * @date 2020-10-13 10:31:04
 */
@Data
@TableName("fencealarm")
public class FencealarmEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String openId;
	/**
	 * $column.comments
	 */
	private String deviceNumber;
	/**
	 * $column.comments
	 */
	private Integer rang;
	/**
	 * $column.comments
	 */
	private String longitude;
	/**
	 * $column.comments
	 */
	private String latitude;
	/**
	 * $column.comments
	 */
	private Integer alarmId;
	/**
	 * $column.comments
	 */
	private Double maintenanceMileage;
	/**
	 * $column.comments
	 */
	private String status;
	/**
	 * $column.comments
	 */
	private String insuranceStatus;
	/**
	 * $column.comments
	 */
	private String speedingStatus;
	/**
	 * $column.comments
	 */
	private String collisionStatus;
	/**
	 * $column.comments
	 */
	private String maintenanceStatus;
	/**
	 * $column.comments
	 */
	private String updatetime;

}
