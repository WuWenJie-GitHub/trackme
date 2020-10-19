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
@TableName("department")
public class DepartmentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer depid;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private String type;
	/**
	 * $column.comments
	 */
	private String memno;
	/**
	 * $column.comments
	 */
	private String assoman;
	/**
	 * $column.comments
	 */
	private String assotel;
	/**
	 * $column.comments
	 */
	private String businessscope;
	/**
	 * $column.comments
	 */
	private String region;
	/**
	 * $column.comments
	 */
	private String roadpermitno;
	/**
	 * $column.comments
	 */
	private String roadpermitword;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * $column.comments
	 */
	private Integer parentid;
	/**
	 * $column.comments
	 */
	private String name;
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
	private Date createdate;

}
