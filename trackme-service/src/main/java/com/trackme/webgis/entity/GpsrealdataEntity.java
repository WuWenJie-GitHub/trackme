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
 * @date 2020-10-13 10:31:04
 */
@Data
@TableName("gpsrealdata")
public class GpsrealdataEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String simno;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String location;
	/**
	 * $column.comments
	 */
	private Date sendtime;
	/**
	 * $column.comments
	 */
	private BigDecimal longitude;
	/**
	 * $column.comments
	 */
	private BigDecimal latitude;
	/**
	 * $column.comments
	 */
	private BigDecimal velocity;
	/**
	 * $column.comments
	 */
	private Integer direction;
	/**
	 * $column.comments
	 */
	private String status;
	/**
	 * $column.comments
	 */
	private BigDecimal gas;
	/**
	 * $column.comments
	 */
	private BigDecimal mileage;
	/**
	 * $column.comments
	 */
	private BigDecimal recordvelocity;
	/**
	 * $column.comments
	 */
	private Double remain;
	/**
	 * $column.comments
	 */
	private Integer online;
	/**
	 * $column.comments
	 */
	private Integer signals;
	/**
	 * $column.comments
	 */
	private String alarmstate;
	/**
	 * $column.comments
	 */
	private String dvrstatus;
	/**
	 * $column.comments
	 */
	private Double altitude;
	/**
	 * $column.comments
	 */
	private Integer valid;
	/**
	 * $column.comments
	 */
	private Integer depid;
	/**
	 * $column.comments
	 */
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private Date updatedate;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer enclosureid;
	/**
	 * $column.comments
	 */
	private Integer enclosuretype;
	/**
	 * $column.comments
	 */
	private Integer enclosurealarm;
	/**
	 * $column.comments
	 */
	private Integer overspeedareatype;
	/**
	 * $column.comments
	 */
	private Integer overspeedareaid;
	/**
	 * $column.comments
	 */
	private Integer routesegmentid;
	/**
	 * $column.comments
	 */
	private Integer runtimeonroute;
	/**
	 * $column.comments
	 */
	private Integer routealarmtype;
	/**
	 * $column.comments
	 */
	private String cellid;
	/**
	 * $column.comments
	 */
	private String lac;
	/**
	 * $column.comments
	 */
	private String mnc;

}
