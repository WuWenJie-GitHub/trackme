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
@TableName("systemconfig")
public class SystemconfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private BigDecimal id;
	/**
	 * $column.comments
	 */
	private String accesspointName;
	/**
	 * $column.comments
	 */
	private Integer alaramWaveFlag;
	/**
	 * $column.comments
	 */
	private Integer alarmRedoEndTime;
	/**
	 * $column.comments
	 */
	private Integer alarmRedoTime;
	/**
	 * $column.comments
	 */
	private String alarmSupervisor;
	/**
	 * $column.comments
	 */
	private String alarmSupervisorMail;
	/**
	 * $column.comments
	 */
	private String alarmSupervisorTel;
	/**
	 * $column.comments
	 */
	private String authPassword;
	/**
	 * $column.comments
	 */
	private String authUsername;
	/**
	 * $column.comments
	 */
	private String authenticationCode;
	/**
	 * $column.comments
	 */
	private Integer autoPostQueryCmdInteval;
	/**
	 * $column.comments
	 */
	private Integer carDataDownTime;
	/**
	 * $column.comments
	 */
	private Integer crossRegionFlag;
	/**
	 * $column.comments
	 */
	private String googleKey1;
	/**
	 * $column.comments
	 */
	private String googleKey2;
	/**
	 * $column.comments
	 */
	private String googleUrl;
	/**
	 * $column.comments
	 */
	private String googleVersion;
	/**
	 * $column.comments
	 */
	private String mapabcKey1;
	/**
	 * $column.comments
	 */
	private String mapabcKey2;
	/**
	 * $column.comments
	 */
	private Integer pollingOnlineComputeTime;
	/**
	 * $column.comments
	 */
	private Integer postQueryInterval;
	/**
	 * $column.comments
	 */
	private String systemTitle;
	/**
	 * $column.comments
	 */
	private Integer updateLatlonInterval;
	/**
	 * $column.comments
	 */
	private String urgencyServerIp;
	/**
	 * $column.comments
	 */
	private Integer urgencyTcpPort;
	/**
	 * $column.comments
	 */
	private Integer urgencyUdpPort;
	/**
	 * $column.comments
	 */
	private String yzInterfaceIp;
	/**
	 * $column.comments
	 */
	private BigDecimal yzInterfacePort;
	/**
	 * $column.comments
	 */
	private String yzPassword;
	/**
	 * $column.comments
	 */
	private String yzUserId;
	/**
	 * $column.comments
	 */
	private BigDecimal regionId;
	/**
	 * $column.comments
	 */
	private String carControlPassword;
	/**
	 * $column.comments
	 */
	private Double initlat;
	/**
	 * $column.comments
	 */
	private Double initlng;
	/**
	 * $column.comments
	 */
	private Integer initzoomlevel;
	/**
	 * $column.comments
	 */
	private Integer centerServerStatus;
	/**
	 * $column.comments
	 */
	private String govSubConnectIp;
	/**
	 * $column.comments
	 */
	private Integer govSubConnectPort;
	/**
	 * $column.comments
	 */
	private Integer govSubConnectStatus;
	/**
	 * $column.comments
	 */
	private Integer govermentPort;
	/**
	 * $column.comments
	 */
	private String governmentAccount;
	/**
	 * $column.comments
	 */
	private String governmentIp;
	/**
	 * $column.comments
	 */
	private String governmentPassword;
	/**
	 * $column.comments
	 */
	private Integer govmentEncryptFlag;
	/**
	 * $column.comments
	 */
	private BigDecimal govmentIa1;
	/**
	 * $column.comments
	 */
	private BigDecimal govmentIc1;
	/**
	 * $column.comments
	 */
	private BigDecimal govmentM1;
	/**
	 * $column.comments
	 */
	private BigDecimal govmentCenterId;
	/**
	 * $column.comments
	 */
	private String maptype;
	/**
	 * $column.comments
	 */
	private Integer startGovmentConnect;
	/**
	 * $column.comments
	 */
	private Date staticDate;
	/**
	 * $column.comments
	 */
	private Integer superiorGovStatus;
	/**
	 * $column.comments
	 */
	private Integer systemFlag;
	/**
	 * $column.comments
	 */
	private Integer systemMode;
	/**
	 * $column.comments
	 */
	private Integer gpsdataDelayTime;
	/**
	 * $column.comments
	 */
	private Integer logoFlag;
	/**
	 * $column.comments
	 */
	private Integer driverschoolFlag;
	/**
	 * $column.comments
	 */
	private Integer driverTermType;
	/**
	 * $column.comments
	 */
	private Integer jsDebugFlag;
	/**
	 * $column.comments
	 */
	private Integer govConnectInfo;
	/**
	 * $column.comments
	 */
	private String smartKey;
	/**
	 * $column.comments
	 */
	private Integer popConfig;
	/**
	 * $column.comments
	 */
	private String g3MediaIp;
	/**
	 * $column.comments
	 */
	private Integer g3MediaPort;
	/**
	 * $column.comments
	 */
	private String terminalTypes;
	/**
	 * $column.comments
	 */
	private Integer driverLicenceValid;
	/**
	 * $column.comments
	 */
	private Integer logTermFlag;
	/**
	 * $column.comments
	 */
	private String logTermId;
	/**
	 * $column.comments
	 */
	private Integer bathDelayTime;
	/**
	 * $column.comments
	 */
	private Integer showCarCode;
	/**
	 * $column.comments
	 */
	private Integer packageSize;
	/**
	 * $column.comments
	 */
	private Integer isAll;
	/**
	 * $column.comments
	 */
	private Integer groupShowAll;
	/**
	 * $column.comments
	 */
	private String alarmTypes;
	/**
	 * $column.comments
	 */
	private String gpsStatusTypes;
	/**
	 * $column.comments
	 */
	private String govermentPictureFtpIp;
	/**
	 * $column.comments
	 */
	private Integer govermentPictureFtpPort;
	/**
	 * $column.comments
	 */
	private Integer taxiFlag;
	/**
	 * $column.comments
	 */
	private Integer deleted;
	/**
	 * $column.comments
	 */
	private Integer tenantid;
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
	private Date createdate;
	/**
	 * $column.comments
	 */
	private Integer maxofflinedays;
	/**
	 * $column.comments
	 */
	private Integer platformmessage;
	/**
	 * $column.comments
	 */
	private String displaystatetype;

}
