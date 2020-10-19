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
@TableName("memberinfo")
public class MemberinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String memno;
	/**
	 * $column.comments
	 */
	private Integer memtype;
	/**
	 * $column.comments
	 */
	private String memFormNo;
	/**
	 * $column.comments
	 */
	private Date memTime;
	/**
	 * $column.comments
	 */
	private String address;
	/**
	 * $column.comments
	 */
	private String licenseno;
	/**
	 * $column.comments
	 */
	private String orgno;
	/**
	 * $column.comments
	 */
	private String contactphone;
	/**
	 * $column.comments
	 */
	private String contact;
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
	private Integer deleted;
	/**
	 * $column.comments
	 */
	private String bankCode;
	/**
	 * $column.comments
	 */
	private String businessscope;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private String bankName;
	/**
	 * $column.comments
	 */
	private String accountName;
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
	private String depid;

}
