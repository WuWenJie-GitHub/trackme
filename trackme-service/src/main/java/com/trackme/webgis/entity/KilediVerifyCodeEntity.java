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
@TableName("kiledi_verify_code")
public class KilediVerifyCodeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String id;
	/**
	 * $column.comments
	 */
	private String telephone;
	/**
	 * $column.comments
	 */
	private String verifyCode;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private String codeType;
	/**
	 * $column.comments
	 */
	private String idertifier;

}
