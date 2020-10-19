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
@TableName("speedrecorder")
public class SpeedrecorderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private Integer recorderid;
	/**
	 * $column.comments
	 */
	private Double speed;
	/**
	 * $column.comments
	 */
	private Integer signal;
	/**
	 * $column.comments
	 */
	private Integer sn;
	/**
	 * $column.comments
	 */
	private Date recorderdate;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer signals;

}
