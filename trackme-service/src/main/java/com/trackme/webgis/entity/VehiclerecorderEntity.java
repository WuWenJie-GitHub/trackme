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
@TableName("vehiclerecorder")
public class VehiclerecorderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer recorderid;
	/**
	 * $column.comments
	 */
	private Integer commandid;
	/**
	 * $column.comments
	 */
	private Integer cmd;
	/**
	 * $column.comments
	 */
	private String cmddata;
	/**
	 * $column.comments
	 */
	private String drivercode;
	/**
	 * $column.comments
	 */
	private String driverlicense;
	/**
	 * $column.comments
	 */
	private String vinno;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String platetype;
	/**
	 * $column.comments
	 */
	private String featurefactor;
	/**
	 * $column.comments
	 */
	private Integer deleted;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private Integer platecolor;
	/**
	 * $column.comments
	 */
	private Date starttime;
	/**
	 * $column.comments
	 */
	private String owner;
	/**
	 * $column.comments
	 */
	private Double speed;
	/**
	 * $column.comments
	 */
	private Integer signals;
	/**
	 * $column.comments
	 */
	private Integer sortid;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private Date endtime;
	/**
	 * $column.comments
	 */
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private Double altitude;
	/**
	 * $column.comments
	 */
	private Double latitude;
	/**
	 * $column.comments
	 */
	private Double longitude;

}
