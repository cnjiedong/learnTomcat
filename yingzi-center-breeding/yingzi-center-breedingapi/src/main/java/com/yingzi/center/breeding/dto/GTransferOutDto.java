package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
@SuppressWarnings("serial")
public class GTransferOutDto extends BaseVo {

	protected String id;
	private String eventDate;
	private String ftype;
	private String whichgroupId;
	private String fnumber;
	private String groupweight;
	private String aveage;
	private String desgroupId;
	private String fComment;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
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
