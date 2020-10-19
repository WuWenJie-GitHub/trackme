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
@TableName("gpsmileage")
public class GpsmileageEntity implements Serializable {
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
	private Double gaslastcomp;
	/**
	 * $column.comments
	 */
	private Double mileagelastcomp;
	/**
	 * $column.comments
	 */
	private Date lastcomptime;
	/**
	 * $column.comments
	 */
	private Double mileagelasthour;
	/**
	 * $column.comments
	 */
	private Double gaslasthour;
	/**
	 * $column.comments
	 */
	private Double mileagelastday;
	/**
	 * $column.comments
	 */
	private Double gaslastday;
	/**
	 * $column.comments
	 */
	private Double mileagelastmonth;
	/**
	 * $column.comments
	 */
	private Double gaslastmonth;
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

}
