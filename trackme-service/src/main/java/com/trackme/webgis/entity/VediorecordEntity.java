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
@TableName("vediorecord")
public class VediorecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private Integer userid;
	/**
	 * $column.comments
	 */
	private String vehicleid;
	/**
	 * $column.comments
	 */
	private Integer type;
	/**
	 * $column.comments
	 */
	private String channel;
	/**
	 * $column.comments
	 */
	private String isopen;
	/**
	 * $column.comments
	 */
	private Date sendtime;
	/**
	 * $column.comments
	 */
	private Date createtime;

}
