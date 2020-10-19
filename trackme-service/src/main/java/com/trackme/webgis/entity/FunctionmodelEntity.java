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
@TableName("functionmodel")
public class FunctionmodelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer funcid;
	/**
	 * $column.comments
	 */
	private String descr;
	/**
	 * $column.comments
	 */
	private Integer functype;
	/**
	 * $column.comments
	 */
	private Integer level;
	/**
	 * $column.comments
	 */
	private Integer parentid;
	/**
	 * $column.comments
	 */
	private String url;
	/**
	 * $column.comments
	 */
	private Integer flag;
	/**
	 * $column.comments
	 */
	private String icon;
	/**
	 * $column.comments
	 */
	private Integer reportflag;
	/**
	 * $column.comments
	 */
	private Integer menusort;
	/**
	 * $column.comments
	 */
	private Integer mask;
	/**
	 * $column.comments
	 */
	private String name;
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
	private String owner;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private String remark;

}
