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
@TableName("kiledi_mileage_statistics_summary")
public class KilediMileageStatisticsSummaryEntity implements Serializable {
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
	private String simno;
	/**
	 * $column.comments
	 */
	private BigDecimal yesterdaymileage;
	/**
	 * $column.comments
	 */
	private BigDecimal weekmileage;
	/**
	 * $column.comments
	 */
	private BigDecimal monthmileage;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * $column.comments
	 */
	private Date updatetimeweek;
	/**
	 * $column.comments
	 */
	private Date updatetimemonth;
	/**
	 * $column.comments
	 */
	private Integer isstate;

}
