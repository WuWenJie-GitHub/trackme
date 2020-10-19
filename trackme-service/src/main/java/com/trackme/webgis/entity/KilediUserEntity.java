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
@TableName("kiledi_user")
public class KilediUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String id;
	/**
	 * $column.comments
	 */
	private String telephone;
	/**
	 * $column.comments
	 */
	private String speedingRemind;
	/**
	 * $column.comments
	 */
	private String fortificationRemind;
	/**
	 * $column.comments
	 */
	private String insuranceMaturityRemind;
	/**
	 * $column.comments
	 */
	private String maintenanceMaturityRemind;
	/**
	 * $column.comments
	 */
	private String collisionRemind;
	/**
	 * $column.comments
	 */
	private String trackRecord;
	/**
	 * $column.comments
	 */
	private String openId;
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
	private Integer fortifyRang;
	/**
	 * $column.comments
	 */
	private BigDecimal fortifyLongitude;
	/**
	 * $column.comments
	 */
	private BigDecimal fortifyLatitude;
	/**
	 * $column.comments
	 */
	private String fortifyStatus;
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
	private String password;
	/**
	 * $column.comments
	 */
	private String username;

}
