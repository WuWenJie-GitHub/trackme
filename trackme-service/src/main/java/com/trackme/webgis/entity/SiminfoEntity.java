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
@TableName("siminfo")
public class SiminfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private Integer f1;
	/**
	 * $column.comments
	 */
	private Integer f2;
	/**
	 * $column.comments
	 */
	private Integer f3;
	/**
	 * $column.comments
	 */
	private Integer f4;
	/**
	 * $column.comments
	 */
	private Integer f5;
	/**
	 * $column.comments
	 */
	private Integer f6;
	/**
	 * $column.comments
	 */
	private Integer f7;
	/**
	 * $column.comments
	 */
	private Integer f8;
	/**
	 * $column.comments
	 */
	private String seqNo;
	/**
	 * $column.comments
	 */
	private Integer state;
	/**
	 * $column.comments
	 */
	private String code;
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
	private String desp;
	/**
	 * $column.comments
	 */
	private String region;

}
