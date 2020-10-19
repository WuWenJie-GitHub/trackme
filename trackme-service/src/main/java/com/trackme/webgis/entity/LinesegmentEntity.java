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
@TableName("linesegment")
public class LinesegmentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer segid;
	/**
	 * $column.comments
	 */
	private Integer enclosureid;
	/**
	 * $column.comments
	 */
	private Integer pointid;
	/**
	 * $column.comments
	 */
	private Double latitude;
	/**
	 * $column.comments
	 */
	private Double longitude;
	/**
	 * $column.comments
	 */
	private Integer linewidth;
	/**
	 * $column.comments
	 */
	private Integer isstation;
	/**
	 * $column.comments
	 */
	private Integer limitspeed;
	/**
	 * $column.comments
	 */
	private Integer bytime;
	/**
	 * $column.comments
	 */
	private Integer maxspeed;
	/**
	 * $column.comments
	 */
	private Integer overspeedtime;
	/**
	 * $column.comments
	 */
	private Integer maxtimelimit;
	/**
	 * $column.comments
	 */
	private Integer mintimelimit;
	/**
	 * $column.comments
	 */
	private String alarmtype;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer deleted;
	/**
	 * $column.comments
	 */
	private Double latitude1;
	/**
	 * $column.comments
	 */
	private Double longitude1;
	/**
	 * $column.comments
	 */
	private Double latitude2;
	/**
	 * $column.comments
	 */
	private Double longitude2;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private String owner;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private Integer station;

}
