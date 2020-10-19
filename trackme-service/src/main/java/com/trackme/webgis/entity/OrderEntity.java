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
@TableName("order")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String 序号;
	/**
	 * $column.comments
	 */
	private String 设备号;
	/**
	 * $column.comments
	 */
	private String 唯一终端id号;
	/**
	 * $column.comments
	 */
	private String 供应商sim卡号;
	/**
	 * $column.comments
	 */
	private String 系统sim号;
	/**
	 * $column.comments
	 */
	private String 临时牌号;
	/**
	 * $column.comments
	 */
	private String fs店;
	/**
	 * $column.comments
	 */
	private String 经销商;

}
