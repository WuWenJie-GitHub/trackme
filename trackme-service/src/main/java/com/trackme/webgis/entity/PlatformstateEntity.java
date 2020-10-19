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
@TableName("platformstate")
public class PlatformstateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer stateid;
	/**
	 * $column.comments
	 */
	private String mainlinkstate;
	/**
	 * $column.comments
	 */
	private Date mainlinkdate;
	/**
	 * $column.comments
	 */
	private String sublinkstate;
	/**
	 * $column.comments
	 */
	private Date sublinkdate;
	/**
	 * $column.comments
	 */
	private String gpsserverstate;
	/**
	 * $column.comments
	 */
	private Date gpsserverdate;

}
