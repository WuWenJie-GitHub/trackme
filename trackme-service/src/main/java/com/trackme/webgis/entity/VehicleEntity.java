package com.trackme.webgis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("vehicle")
public class VehicleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String vehicletype;
	/**
	 * $column.comments
	 */
	private String platecolor;
	/**
	 * $column.comments
	 */
	private String monitor;
	/**
	 * $column.comments
	 */
	private String driver;
	/**
	 * $column.comments
	 */
	private String status;
	/**
	 * $column.comments
	 */
	private String runstatus;
	/**
	 * $column.comments
	 */
	private Double total;
	/**
	 * $column.comments
	 */
	private Double remain;
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
	private String gpsid;
	/**
	 * $column.comments
	 */
	private String videodeviceid;
	/**
	 * $column.comments
	 */
	private Integer sortid;
	/**
	 * $column.comments
	 */
	private String vehicledevicetype;
	/**
	 * $column.comments
	 */
	private Integer dvronline;
	/**
	 * $column.comments
	 */
	private String motorid;
	/**
	 * $column.comments
	 */
	private Date installdate;
	/**
	 * $column.comments
	 */
	private String simno;
	/**
	 * $column.comments
	 */
	private String dvrcard;
	/**
	 * $column.comments
	 */
	private String drivermobile;
	/**
	 * $column.comments
	 */
	private String monitormobile;
	/**
	 * $column.comments
	 */
	private String vehcolor;
	/**
	 * $column.comments
	 */
	private String operpermit;
	/**
	 * $column.comments
	 */
	private Date lastchecktime;
	/**
	 * $column.comments
	 */
	private Date buydate;
	/**
	 * $column.comments
	 */
	private Date onlinetime;
	/**
	 * $column.comments
	 */
	private Date offlinetime;
	/**
	 * $column.comments
	 */
	private String vendor;
	/**
	 * $column.comments
	 */
	private String factoryno;
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
	private Integer depid;
	/**
	 * $column.comments
	 */
	private String depname;
	/**
	 * $column.comments
	 */
	private String gpsterminaltype;
	/**
	 * $column.comments
	 */
	private String usetype;
	/**
	 * $column.comments
	 */
	private String industry;
	/**
	 * $column.comments
	 */
	private String routes;
	/**
	 * $column.comments
	 */
	private String region;
	/**
	 * $column.comments
	 */
	private Integer termid;
	/**
	 * $column.comments
	 */
	private Date buytime;
	/**
	 * $column.comments
	 */
	private Integer memberid;
	/**
	 * $column.comments
	 */
	private Date enddate;
	/**
	 * $column.comments
	 */
	private Date startdate;
	/**
	 * $column.comments
	 */
	private Date insuredate;
	/**
	 * $column.comments
	 */
	private Integer insureid;
	/**
	 * $column.comments
	 */
	private Date warrantydate;
	/**
	 * $column.comments
	 */
	private Date maintaindate;
	/**
	 * $column.comments
	 */
	private Date mortgagedate;
	/**
	 * $column.comments
	 */
	private Integer mortgagelife;
	/**
	 * $column.comments
	 */
	private Integer mortgagebank;
	/**
	 * $column.comments
	 */
	private Double paymonthly;
	/**
	 * $column.comments
	 */
	private String vin;
	/**
	 * $column.comments
	 */
	private String carcolor;
	/**
	 * $column.comments
	 */
	private BigDecimal maintainmileage;
	/**
	 * $column.comments
	 */
	private Integer iswarrantyml;
	/**
	 * $column.comments
	 */
	private Double scopewarrantyml;
	/**
	 * $column.comments
	 */
	private Double warrantymileage;

}
