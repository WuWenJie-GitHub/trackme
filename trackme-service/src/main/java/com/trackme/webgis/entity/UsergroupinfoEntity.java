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
@TableName("usergroupinfo")
public class UsergroupinfoEntity implements Serializable {
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
	private String name;
	/**
	 * $column.comments
	 */
	private Integer kind;
	/**
	 * $column.comments
	 */
	private Integer vehGroupId;
	/**
	 * $column.comments
	 */
	private String reserve;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private Integer useState;
	/**
	 * $column.comments
	 */
	private String pattern;
	/**
	 * $column.comments
	 */
	private String rasAccount;
	/**
	 * $column.comments
	 */
	private Date expireTime;

}
