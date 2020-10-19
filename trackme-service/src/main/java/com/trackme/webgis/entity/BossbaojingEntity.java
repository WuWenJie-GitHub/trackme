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
@TableName("bossbaojing")
public class BossbaojingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String chepai;
	/**
	 * $column.comments
	 */
	private String yanse;
	/**
	 * $column.comments
	 */
	private String fs;
	/**
	 * $column.comments
	 */
	private String baojing1;
	/**
	 * $column.comments
	 */
	private String baojing2;
	/**
	 * $column.comments
	 */
	private String vin;
	/**
	 * $column.comments
	 */
	private String chezhu;
	/**
	 * $column.comments
	 */
	private String shouji;
	/**
	 * $column.comments
	 */
	private Integer vid;

}
