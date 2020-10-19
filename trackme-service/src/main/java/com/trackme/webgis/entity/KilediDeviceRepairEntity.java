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
@TableName("kiledi_device_repair")
public class KilediDeviceRepairEntity implements Serializable {
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
	private String repairContacts;
	/**
	 * $column.comments
	 */
	private String repairPhone;
	/**
	 * $column.comments
	 */
	private String repairLocation;
	/**
	 * $column.comments
	 */
	private String repairProblem;
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

}
