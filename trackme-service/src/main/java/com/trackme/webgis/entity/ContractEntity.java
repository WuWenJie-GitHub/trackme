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
@TableName("contract")
public class ContractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String vehicleOwner;
	/**
	 * $column.comments
	 */
	private String idCard;
	/**
	 * $column.comments
	 */
	private String phone;
	/**
	 * $column.comments
	 */
	private String address;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String vehicleType;
	/**
	 * $column.comments
	 */
	private String price;
	/**
	 * $column.comments
	 */
	private String vin;
	/**
	 * $column.comments
	 */
	private String engineno;
	/**
	 * $column.comments
	 */
	private String deviceNumber;
	/**
	 * $column.comments
	 */
	private String sim;
	/**
	 * $column.comments
	 */
	private String startTime;
	/**
	 * $column.comments
	 */
	private String endTime;
	/**
	 * $column.comments
	 */
	private String firstBeneficiary;
	/**
	 * $column.comments
	 */
	private String founder;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private String state;
	/**
	 * $column.comments
	 */
	private Integer isnew;
	/**
	 * $column.comments
	 */
	private String ispass;
	/**
	 * $column.comments
	 */
	private Boolean deleted;
	/**
	 * $column.comments
	 */
	private Integer num;
	/**
	 * $column.comments
	 */
	private String install4s;
	/**
	 * $column.comments
	 */
	private String owner;
	/**
	 * $column.comments
	 */
	private String remarks;
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
	private Integer limitmoney;
	/**
	 * $column.comments
	 */
	private Integer depid;

}
