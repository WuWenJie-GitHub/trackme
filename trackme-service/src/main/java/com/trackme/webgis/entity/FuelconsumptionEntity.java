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
@TableName("fuelconsumption")
public class FuelconsumptionEntity implements Serializable {
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
	private Double fuel;
	/**
	 * $column.comments
	 */
	private Integer intervaltype;
	/**
	 * $column.comments
	 */
	private Double mileage;
	/**
	 * $column.comments
	 */
	private Double gas1;
	/**
	 * $column.comments
	 */
	private Double mileage1;
	/**
	 * $column.comments
	 */
	private Double gas2;
	/**
	 * $column.comments
	 */
	private Double mileage2;
	/**
	 * $column.comments
	 */
	private Double gas;
	/**
	 * $column.comments
	 */
	private String deleted;
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
	private String owner;
	/**
	 * $column.comments
	 */
	private Date createdate;

}
