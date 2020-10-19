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
@TableName("configinfo")
public class ConfiginfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private Integer vehicleid;
	/**
	 * $column.comments
	 */
	private Integer mask;
	/**
	 * $column.comments
	 */
	private String term;
	/**
	 * $column.comments
	 */
	private Integer connumber;
	/**
	 * $column.comments
	 */
	private String console1;
	/**
	 * $column.comments
	 */
	private String console2;
	/**
	 * $column.comments
	 */
	private String console3;
	/**
	 * $column.comments
	 */
	private String console4;
	/**
	 * $column.comments
	 */
	private String console5;
	/**
	 * $column.comments
	 */
	private String smsc;
	/**
	 * $column.comments
	 */
	private Integer flagscfgsmsc;
	/**
	 * $column.comments
	 */
	private Integer agent;
	/**
	 * $column.comments
	 */
	private Integer answercnl;
	/**
	 * $column.comments
	 */
	private Integer alarmcnl;
	/**
	 * $column.comments
	 */
	private Integer gpscnl;
	/**
	 * $column.comments
	 */
	private Integer mode;
	/**
	 * $column.comments
	 */
	private Integer pulse;
	/**
	 * $column.comments
	 */
	private String apnname1;
	/**
	 * $column.comments
	 */
	private Integer ip1;
	/**
	 * $column.comments
	 */
	private Integer port1;
	/**
	 * $column.comments
	 */
	private Integer flags1;
	/**
	 * $column.comments
	 */
	private Integer status1;
	/**
	 * $column.comments
	 */
	private String apnname2;
	/**
	 * $column.comments
	 */
	private Integer ip2;
	/**
	 * $column.comments
	 */
	private Integer port2;
	/**
	 * $column.comments
	 */
	private Integer flags2;
	/**
	 * $column.comments
	 */
	private Integer status2;
	/**
	 * $column.comments
	 */
	private Integer flagsfun;
	/**
	 * $column.comments
	 */
	private Integer code;
	/**
	 * $column.comments
	 */
	private Integer alarmbit;
	/**
	 * $column.comments
	 */
	private Integer failurebit;
	/**
	 * $column.comments
	 */
	private Integer registerbit;
	/**
	 * $column.comments
	 */
	private Integer registerspan1;
	/**
	 * $column.comments
	 */
	private Integer registerspan2;
	/**
	 * $column.comments
	 */
	private Integer autoarm;
	/**
	 * $column.comments
	 */
	private Integer eventmask;
	/**
	 * $column.comments
	 */
	private Integer eventbit;
	/**
	 * $column.comments
	 */
	private Integer popedombit;
	/**
	 * $column.comments
	 */
	private Integer resettime;
	/**
	 * $column.comments
	 */
	private Integer ltastart;
	/**
	 * $column.comments
	 */
	private Integer ltaend;
	/**
	 * $column.comments
	 */
	private Integer osavalue;
	/**
	 * $column.comments
	 */
	private Integer osatime;
	/**
	 * $column.comments
	 */
	private Integer otavalue;
	/**
	 * $column.comments
	 */
	private Integer resttime;
	/**
	 * $column.comments
	 */
	private Integer kind;
	/**
	 * $column.comments
	 */
	private Integer countphone;
	/**
	 * $column.comments
	 */
	private String phone1;
	/**
	 * $column.comments
	 */
	private String phone2;
	/**
	 * $column.comments
	 */
	private String phone3;
	/**
	 * $column.comments
	 */
	private String phone4;
	/**
	 * $column.comments
	 */
	private Integer flagsphone;
	/**
	 * $column.comments
	 */
	private Integer flagsmone;
	/**
	 * $column.comments
	 */
	private Integer modemone;
	/**
	 * $column.comments
	 */
	private Integer rtncnl;
	/**
	 * $column.comments
	 */
	private Integer rtnencode;
	/**
	 * $column.comments
	 */
	private Integer rtntotalpacket;
	/**
	 * $column.comments
	 */
	private Integer countofpacket;
	/**
	 * $column.comments
	 */
	private Integer distanceofpacket;
	/**
	 * $column.comments
	 */
	private Integer timeofpacket;
	/**
	 * $column.comments
	 */
	private Integer moncount;
	/**
	 * $column.comments
	 */
	private Integer mondistance;
	/**
	 * $column.comments
	 */
	private Integer montime;
	/**
	 * $column.comments
	 */
	private Integer monflags;
	/**
	 * $column.comments
	 */
	private Integer montracks;
	/**
	 * $column.comments
	 */
	private Integer countpolygon;
	/**
	 * $column.comments
	 */
	private Integer polygonid1;
	/**
	 * $column.comments
	 */
	private Integer polygonid2;
	/**
	 * $column.comments
	 */
	private Integer polygonid3;
	/**
	 * $column.comments
	 */
	private Integer polygonid4;
	/**
	 * $column.comments
	 */
	private Integer paramLength;
	/**
	 * $column.comments
	 */
	private String paramBuffer;

}
