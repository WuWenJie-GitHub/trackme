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
@TableName("alarmstatic")
public class AlarmstaticEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer staticid;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String alarmtype;
	/**
	 * $column.comments
	 */
	private Integer alarmnum;
	/**
	 * $column.comments
	 */
	private String staticdate;
	/**
	 * $column.comments
	 */
	private Integer statictype;

}
