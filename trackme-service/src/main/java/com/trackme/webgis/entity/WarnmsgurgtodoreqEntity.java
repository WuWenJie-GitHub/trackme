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
@TableName("warnmsgurgtodoreq")
public class WarnmsgurgtodoreqEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private Integer ackflag;
	/**
	 * $column.comments
	 */
	private Date acktime;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer origin;
	/**
	 * $column.comments
	 */
	private Integer result;
	/**
	 * $column.comments
	 */
	private Integer supervicsionid;
	/**
	 * $column.comments
	 */
	private Date supervisionendtime;
	/**
	 * $column.comments
	 */
	private Integer supervisionlevel;
	/**
	 * $column.comments
	 */
	private String supervisor;
	/**
	 * $column.comments
	 */
	private String supervisoremail;
	/**
	 * $column.comments
	 */
	private String supervisortel;
	/**
	 * $column.comments
	 */
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private Integer warnsrc;
	/**
	 * $column.comments
	 */
	private Date warntime;
	/**
	 * $column.comments
	 */
	private Integer warntype;
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
	private String remark;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String platecolor;

}
