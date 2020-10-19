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
@TableName("kiledi_user_statistics")
public class KilediUserStatisticsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String id;
	/**
	 * $column.comments
	 */
	private String userId;
	/**
	 * $column.comments
	 */
	private BigDecimal mileage;
	/**
	 * $column.comments
	 */
	private BigDecimal velocity;
	/**
	 * $column.comments
	 */
	private Date statisticsDate;
	/**
	 * $column.comments
	 */
	private String statisticsYear;
	/**
	 * $column.comments
	 */
	private String statisticsMonth;
	/**
	 * $column.comments
	 */
	private String deviceNumber;

}
