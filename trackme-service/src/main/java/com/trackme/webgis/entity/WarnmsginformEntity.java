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
@TableName("warnmsginform")
public class WarnmsginformEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private BigDecimal id;
	/**
	 * $column.comments
	 */
	private String addiinfo;
	/**
	 * $column.comments
	 */
	private Integer angle;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private Integer dataType;
	/**
	 * $column.comments
	 */
	private String dealResult;
	/**
	 * $column.comments
	 */
	private Date dealTime;
	/**
	 * $column.comments
	 */
	private String extInfo;
	/**
	 * $column.comments
	 */
	private Integer height;
	/**
	 * $column.comments
	 */
	private Integer infoId;
	/**
	 * $column.comments
	 */
	private Double lat;
	/**
	 * $column.comments
	 */
	private Integer loading;
	/**
	 * $column.comments
	 */
	private Double lon;
	/**
	 * $column.comments
	 */
	private Integer orgWarnId;
	/**
	 * $column.comments
	 */
	private Integer origin;
	/**
	 * $column.comments
	 */
	private Date redoEndTime;
	/**
	 * $column.comments
	 */
	private Integer redoFlag;
	/**
	 * $column.comments
	 */
	private BigDecimal redoId;
	/**
	 * $column.comments
	 */
	private Date redoTime;
	/**
	 * $column.comments
	 */
	private Integer result;
	/**
	 * $column.comments
	 */
	private Integer speed;
	/**
	 * $column.comments
	 */
	private Integer status1;
	/**
	 * $column.comments
	 */
	private Integer status2;
	/**
	 * $column.comments
	 */
	private Integer status3;
	/**
	 * $column.comments
	 */
	private Integer subType;
	/**
	 * $column.comments
	 */
	private String text;
	/**
	 * $column.comments
	 */
	private Date updateTime;
	/**
	 * $column.comments
	 */
	private Integer valid;
	/**
	 * $column.comments
	 */
	private Integer vehicleId;
	/**
	 * $column.comments
	 */
	private String warnContent;
	/**
	 * $column.comments
	 */
	private Integer warnSrc;
	/**
	 * $column.comments
	 */
	private Date warnTime;
	/**
	 * $column.comments
	 */
	private Integer warnType;
	/**
	 * $column.comments
	 */
	private String dealUser;
	/**
	 * $column.comments
	 */
	private Integer mask;
	/**
	 * $column.comments
	 */
	private Integer extId;

}
