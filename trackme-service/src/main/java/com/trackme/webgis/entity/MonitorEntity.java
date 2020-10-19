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
@TableName("monitor")
public class MonitorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private Integer f1;
	/**
	 * $column.comments
	 */
	private Integer f2;
	/**
	 * $column.comments
	 */
	private Integer f3;
	/**
	 * $column.comments
	 */
	private Integer f4;
	/**
	 * $column.comments
	 */
	private Integer f5;
	/**
	 * $column.comments
	 */
	private Integer f6;
	/**
	 * $column.comments
	 */
	private Integer f7;
	/**
	 * $column.comments
	 */
	private Integer f8;
	/**
	 * $column.comments
	 */
	private Integer vehicle;
	/**
	 * $column.comments
	 */
	private Integer operator;
	/**
	 * $column.comments
	 */
	private Integer appstation;
	/**
	 * $column.comments
	 */
	private Integer apptype;
	/**
	 * $column.comments
	 */
	private Integer flags;
	/**
	 * $column.comments
	 */
	private Date montiortime;
	/**
	 * $column.comments
	 */
	private String ipaddr;
	/**
	 * $column.comments
	 */
	private String reserve;

}
