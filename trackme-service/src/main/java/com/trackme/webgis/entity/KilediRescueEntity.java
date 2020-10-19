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
@TableName("kiledi_rescue")
public class KilediRescueEntity implements Serializable {
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
	private String telephone;
	/**
	 * $column.comments
	 */
	private String carNumber;
	/**
	 * $column.comments
	 */
	private String carLongitude;
	/**
	 * $column.comments
	 */
	private String carLatitude;
	/**
	 * $column.comments
	 */
	private String address;
	/**
	 * $column.comments
	 */
	private String rescueDeviceNumber;
	/**
	 * $column.comments
	 */
	private String rescueCarTelephone;
	/**
	 * $column.comments
	 */
	private String rescueCarNumber;
	/**
	 * $column.comments
	 */
	private Date sueTime;
	/**
	 * $column.comments
	 */
	private Date rescueTime;
	/**
	 * $column.comments
	 */
	private Date finishTime;
	/**
	 * $column.comments
	 */
	private String status;
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
	private String rescueUserId;
	/**
	 * $column.comments
	 */
	private String rescueCarLongitude;
	/**
	 * $column.comments
	 */
	private String rescueCarLatitude;
	/**
	 * $column.comments
	 */
	private String rescueAddress;
	/**
	 * $column.comments
	 */
	private String vehicleid;
	/**
	 * $column.comments
	 */
	private String rescueCarVehicleid;

}
