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
@TableName("temp")
public class TempEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer alarmid;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private Date starttime;
	/**
	 * $column.comments
	 */
	private Date endtime;
	/**
	 * $column.comments
	 */
	private Double timespan;
	/**
	 * $column.comments
	 */
	private Double velocity;
	/**
	 * $column.comments
	 */
	private String status;
	/**
	 * $column.comments
	 */
	private String driver;
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
	private String location;
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
	private String location1;
	/**
	 * $column.comments
	 */
	private Integer processed;
	/**
	 * $column.comments
	 */
	private Date processedtime;
	/**
	 * $column.comments
	 */
	private String type;
	/**
	 * $column.comments
	 */
	private String childtype;
	/**
	 * $column.comments
	 */
	private Integer station;
	/**
	 * $column.comments
	 */
	private String valvestate;
	/**
	 * $column.comments
	 */
	private String valvestate1;
	/**
	 * $column.comments
	 */
	private Double gas1;
	/**
	 * $column.comments
	 */
	private Double gas2;
	/**
	 * $column.comments
	 */
	private Double mileage1;
	/**
	 * $column.comments
	 */
	private Double mileage2;
	/**
	 * $column.comments
	 */
	private String videofilename;
	/**
	 * $column.comments
	 */
	private String flag;
	/**
	 * $column.comments
	 */
	private String remark;
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
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private String owner;
	/**
	 * $column.comments
	 */
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private Integer responsesn;
	/**
	 * $column.comments
	 */
	private Integer processeduserid;
	/**
	 * $column.comments
	 */
	private String processedusername;

}
