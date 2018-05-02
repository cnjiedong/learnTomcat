package com.yingzi.center.breeding.eo;

import javax.persistence.Column;
import javax.persistence.Table;

import com.dtyunxi.eo.BaseEo;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
@SuppressWarnings("serial")
@Table(name = "bc_group_remove")
public class GTransferOutEo extends BaseEo {

	@Column(name = "eventdate")
	private String eventDate;
	
	@Column(name = "ftype")
	private String ftype;
	
	@Column(name = "whichgroup_id")
	private String whichgroupId;
	
	@Column(name = "fnumber")
	private String fnumber;
	
	@Column(name = "groupweight")
	private String groupweight;
	
	@Column(name = "aveage")
	private String aveage;
	
	@Column(name = "desgroup_id")
	private String desgroupId;
	
	@Column(name = "fcomment")
	private String fComment;

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public String getWhichgroupId() {
		return whichgroupId;
	}

	public void setWhichgroupId(String whichgroupId) {
		this.whichgroupId = whichgroupId;
	}

	public String getFnumber() {
		return fnumber;
	}

	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}

	public String getGroupweight() {
		return groupweight;
	}

	public void setGroupweight(String groupweight) {
		this.groupweight = groupweight;
	}

	public String getAveage() {
		return aveage;
	}

	public void setAveage(String aveage) {
		this.aveage = aveage;
	}

	public String getDesgroupId() {
		return desgroupId;
	}

	public void setDesgroupId(String desgroupId) {
		this.desgroupId = desgroupId;
	}

	public String getfComment() {
		return fComment;
	}

	public void setfComment(String fComment) {
		this.fComment = fComment;
	}
}
