package com.trackme.webgis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
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
@TableName("onlinestatic")
public class OnlinestaticEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private Integer depid;
	/**
	 * $column.comments
	 */
	private String depname;
	/**
	 * $column.comments
	 */
	private Integer onlinenum;
	/**
	 * $column.comments
	 */
	private Integer vehiclenum;
	/**
	 * $column.comments
	 */
	private BigDecimal onlinerate;
	/**
	 * $column.comments
	 */
	private Date statisticdate;
	/**
	 * $column.comments
	 */
	private Integer intervaltype;
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
	private String remark;
	/**
	 * $column.comments
	 */
	private String owner;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer parentdepid;

}
