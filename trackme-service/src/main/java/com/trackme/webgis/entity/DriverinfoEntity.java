package com.trackme.webgis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("driverinfo")
public class DriverinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer driverid;
	/**
	 * $column.comments
	 */
	private String companyno;
	/**
	 * $column.comments
	 */
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private String drivercode;
	/**
	 * $column.comments
	 */
	private String drivername;
	/**
	 * $column.comments
	 */
	private String sex;
	/**
	 * $column.comments
	 */
	private String driverlicence;
	/**
	 * $column.comments
	 */
	private String identitycard;
	/**
	 * $column.comments
	 */
	private String nativeplace;
	/**
	 * $column.comments
	 */
	private String address;
	/**
	 * $column.comments
	 */
	private String telephone;
	/**
	 * $column.comments
	 */
	private String mobilephone;
	/**
	 * $column.comments
	 */
	private Date birthday;
	/**
	 * $column.comments
	 */
	private String drivingtype;
	/**
	 * $column.comments
	 */
	private Date examineyear;
	/**
	 * $column.comments
	 */
	private Integer harnessesage;
	/**
	 * $column.comments
	 */
	private Integer status;
	/**
	 * $column.comments
	 */
	private Date appointment;
	/**
	 * $column.comments
	 */
	private Double basesalary;
	/**
	 * $column.comments
	 */
	private Double royaltiesscale;
	/**
	 * $column.comments
	 */
	private Double appraisalintegral;
	/**
	 * $column.comments
	 */
	private String driverrfid;
	/**
	 * $column.comments
	 */
	private String password;
	/**
	 * $column.comments
	 */
	private Integer operatorid;
	/**
	 * $column.comments
	 */
	private Date register;
	/**
	 * $column.comments
	 */
	private String remark;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * $column.comments
	 */
	private String licenseagency;
	/**
	 * $column.comments
	 */
	private Date certificationdate;
	/**
	 * $column.comments
	 */
	private Date invaliddate;
	/**
	 * $column.comments
	 */
	private String corp;
	/**
	 * $column.comments
	 */
	private String monitororg;
	/**
	 * $column.comments
	 */
	private String monitorphone;
	/**
	 * $column.comments
	 */
	private Integer servicelevel;
	/**
	 * $column.comments
	 */
	private String bgtitle;
	/**
	 * $column.comments
	 */
	private String location;
	/**
	 * $column.comments
	 */
	private String photoformat;
	/**
	 * $column.comments
	 */
	private Integer photolength;
	/**
	 * $column.comments
	 */
	private String owner;
	/**
	 * $column.comments
	 */
	private String jobcard;
	/**
	 * $column.comments
	 */
	@TableLogic
	private Integer deleted;
	/**
	 * $column.comments
	 */
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
	/**
	 * $column.comments
	 */
	private Integer maindriver;

}
