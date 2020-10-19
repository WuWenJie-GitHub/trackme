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
@TableName("enclosure")
public class EnclosureEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer enclosureid;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String gpsid;
	/**
	 * $column.comments
	 */
	private String points;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private Integer radius;
	/**
	 * $column.comments
	 */
	private Integer delay;
	/**
	 * $column.comments
	 */
	private Integer offsetdelay;
	/**
	 * $column.comments
	 */
	private Integer sn;
	/**
	 * $column.comments
	 */
	private String enclosuretype;
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
	private Date startdate;
	/**
	 * $column.comments
	 */
	private Date enddate;
	/**
	 * $column.comments
	 */
	private Integer deleted;
	/**
	 * $column.comments
	 */
	private Integer limitspeed;
	/**
	 * $column.comments
	 */
	private Double maxspeed;
	/**
	 * $column.comments
	 */
	private Integer bytime;
	/**
	 * $column.comments
	 */
	private Integer gatherregion;
	/**
	 * $column.comments
	 */
	private Integer sensitiveregion;
	/**
	 * $column.comments
	 */
	private Integer gathernum;
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
	private String owner;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private Double linewidth;
	/**
	 * $column.comments
	 */
	private String status;
	/**
	 * $column.comments
	 */
	private Double centerlat;
	/**
	 * $column.comments
	 */
	private Double centerlng;
	/**
	 * $column.comments
	 */
	private Integer keypoint;
	/**
	 * $column.comments
	 */
	private String maptype;

}
