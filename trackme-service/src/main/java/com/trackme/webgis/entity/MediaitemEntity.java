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
@TableName("mediaitem")
public class MediaitemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer mediaitemid;
	/**
	 * $column.comments
	 */
	private Integer commandid;
	/**
	 * $column.comments
	 */
	private String commandtype;
	/**
	 * $column.comments
	 */
	private String plateno;
	/**
	 * $column.comments
	 */
	private String simno;
	/**
	 * $column.comments
	 */
	private Date sendtime;
	/**
	 * $column.comments
	 */
	private Integer mediadataid;
	/**
	 * $column.comments
	 */
	private Integer mediatype;
	/**
	 * $column.comments
	 */
	private Integer codeformat;
	/**
	 * $column.comments
	 */
	private Integer channelid;
	/**
	 * $column.comments
	 */
	private Integer eventcode;
	/**
	 * $column.comments
	 */
	private String filename;
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
	private Double latitude;
	/**
	 * $column.comments
	 */
	private Double longitude;
	/**
	 * $column.comments
	 */
	private Double speed;
	/**
	 * $column.comments
	 */
	private Integer deleted;
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
	private String location;

}
