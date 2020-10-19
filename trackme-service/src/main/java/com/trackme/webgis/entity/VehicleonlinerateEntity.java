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
@TableName("vehicleonlinerate")
public class VehicleonlinerateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String intervaldescr;
	/**
	 * $column.comments
	 */
	private Double hour;
	/**
	 * $column.comments
	 */
	private Date staticdate;
	/**
	 * $column.comments
	 */
	private BigDecimal onlinetime;
	/**
	 * $column.comments
	 */
	private Integer intervaltype;
	/**
	 * $column.comments
	 */
	private BigDecimal offlinetime;
	/**
	 * $column.comments
	 */
	private Double totaltime;
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
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private BigDecimal onlinerate;

}
