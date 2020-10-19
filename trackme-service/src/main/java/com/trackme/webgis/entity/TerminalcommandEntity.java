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
@TableName("terminalcommand")
public class TerminalcommandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer cmdid;
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
	private String remark;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private Integer sn;
	/**
	 * $column.comments
	 */
	private String cmd;
	/**
	 * $column.comments
	 */
	private String cmddata;
	/**
	 * $column.comments
	 */
	private Integer cmdtype;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String simno;
	/**
	 * $column.comments
	 */
	private String status;
	/**
	 * $column.comments
	 */
	private Date updatedate;
	/**
	 * $column.comments
	 */
	private Integer userid;
	/**
	 * $column.comments
	 */
	private Integer vehicleid;

}
