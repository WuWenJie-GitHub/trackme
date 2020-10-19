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
@TableName("kiledi_device_20200221")
public class KilediDevice20200221Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String id;
	/**
	 * $column.comments
	 */
	private String userId;
	/**
	 * $column.comments
	 */
	private String deviceNumber;
	/**
	 * $column.comments
	 */
	private String fourStores;
	/**
	 * $column.comments
	 */
	private String frameNumber;
	/**
	 * $column.comments
	 */
	private String drivingLicenseNumber;
	/**
	 * $column.comments
	 */
	private String carNumber;
	/**
	 * $column.comments
	 */
	private Date pickDate;
	/**
	 * $column.comments
	 */
	private Date insuranceDate;
	/**
	 * $column.comments
	 */
	private Date cardDate;
	/**
	 * $column.comments
	 */
	private String deviceUse;
	/**
	 * $column.comments
	 */
	private String createBy;
	/**
	 * $column.comments
	 */
	private String createName;
	/**
	 * $column.comments
	 */
	private Date createDate;
	/**
	 * $column.comments
	 */
	private String updateBy;
	/**
	 * $column.comments
	 */
	private String updateName;
	/**
	 * $column.comments
	 */
	private Date updateDate;
	/**
	 * $column.comments
	 */
	private String remarks;
	/**
	 * $column.comments
	 */
	private String useType;
	/**
	 * $column.comments
	 */
	private Date maintainDate;
	/**
	 * $column.comments
	 */
	private String termid;
	/**
	 * $column.comments
	 */
	private String vehicleid;
	/**
	 * $column.comments
	 */
	private String tempCarNumber;

}
