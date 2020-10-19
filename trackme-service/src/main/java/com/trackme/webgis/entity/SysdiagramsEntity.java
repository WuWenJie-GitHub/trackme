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
@TableName("sysdiagrams")
public class SysdiagramsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private Integer principalId;
	/**
	 * $column.comments
	 */
	@TableId
	private Integer diagramId;
	/**
	 * $column.comments
	 */
	private Integer version;
	/**
	 * $column.comments
	 */
	private Long definition;

}
