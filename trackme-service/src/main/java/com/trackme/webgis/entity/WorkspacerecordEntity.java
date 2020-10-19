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
@TableName("workspacerecord")
public class WorkspacerecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer userid;
	/**
	 * $column.comments
	 */
	private Integer bloccount;
	/**
	 * $column.comments
	 */
	private Integer carcount;
	/**
	 * $column.comments
	 */
	private Integer onlinecar;
	/**
	 * $column.comments
	 */
	private Integer unonlinecar;
	/**
	 * $column.comments
	 */
	private Integer maintaindatecount;
	/**
	 * $column.comments
	 */
	private Integer warrandatecount;
	/**
	 * $column.comments
	 */
	private Integer insuredatecount;
	/**
	 * $column.comments
	 */
	private Integer crosscount;
	/**
	 * $column.comments
	 */
	private Integer stopcount;
	/**
	 * $column.comments
	 */
	private Integer cartwheelcount;
	/**
	 * $column.comments
	 */
	private Integer collisioncount;

}
