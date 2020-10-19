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
@TableName("bosstest")
public class BosstestEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String vin;
	/**
	 * $column.comments
	 */
	private String simno;
	/**
	 * $column.comments
	 */
	private String depname;
	/**
	 * $column.comments
	 */
	private String vendor;
	/**
	 * $column.comments
	 */
	private Date buytime;
	/**
	 * $column.comments
	 */
	private Date maintaindate;
	/**
	 * $column.comments
	 */
	private Date warrantydate;
	/**
	 * $column.comments
	 */
	private Date insuredate;
	/**
	 * $column.comments
	 */
	private Date mortgagedate;
	/**
	 * $column.comments
	 */
	private Integer mortgagelife;
	/**
	 * $column.comments
	 */
	private Double paymonthly;
	/**
	 * $column.comments
	 */
	private Date installdate;
	/**
	 * $column.comments
	 */
	private Date startdate;
	/**
	 * $column.comments
	 */
	private Date enddate;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private String phone;
	/**
	 * $column.comments
	 */
	private String licheng;

}
