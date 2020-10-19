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
@TableName("terminal")
public class TerminalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer termid;
	/**
	 * $column.comments
	 */
	private String devno;
	/**
	 * $column.comments
	 */
	private String termno;
	/**
	 * $column.comments
	 */
	private Integer versoftware;
	/**
	 * $column.comments
	 */
	private Integer verhardware;
	/**
	 * $column.comments
	 */
	private Integer verprotocol;
	/**
	 * $column.comments
	 */
	private String makefactory;
	/**
	 * $column.comments
	 */
	private Date maketime;
	/**
	 * $column.comments
	 */
	private String makeno;
	/**
	 * $column.comments
	 */
	private String state;
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
	private Date installtime;
	/**
	 * $column.comments
	 */
	private String waitor;
	/**
	 * $column.comments
	 */
	private String installaddress;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * $column.comments
	 */
	private String termtype;
	/**
	 * $column.comments
	 */
	private String simno;
	/**
	 * $column.comments
	 */
	private Integer bind;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private String owner;
	/**
	 * $column.comments
	 */
	private Integer deleted;
	/**
	 * $column.comments
	 */
	private String seqno;
	/**
	 * $column.comments
	 */
	private String depid;

}
