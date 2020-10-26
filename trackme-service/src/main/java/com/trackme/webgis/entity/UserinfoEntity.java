package com.trackme.webgis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("userinfo")
public class UserinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer userid;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private String loginname;
	/**
	 * $column.comments
	 */
	private String password;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private String userstate;
	/**
	 * $column.comments
	 */
	private Double mapcenterlat;
	/**
	 * $column.comments
	 */
	private Double mapcenterlng;
	/**
	 * $column.comments
	 */
	private Integer maplevel;
	/**
	 * $column.comments
	 */
	private Integer maptype;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * $column.comments
	 */
	private Integer userflag;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	@TableLogic
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
	private Integer regionid;
	/**
	 * $column.comments
	 */
	private Integer superadmin;
	/**
	 * $column.comments
	 */
	private String ownerid;

}
