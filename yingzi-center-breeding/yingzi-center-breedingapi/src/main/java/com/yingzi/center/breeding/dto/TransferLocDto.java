package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
@SuppressWarnings("serial")
public class TransferLocDto extends BaseVo {

	protected String id;
	private String transferDate;
	private String herdId;
	private String desLocation;
	private String fComment;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTransferDate() {
		return transferDate;
	}
	
	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}
	
	public String getHerdId() {
		return herdId;
	}
	
	public void setHerdId(String herdId) {
		this.herdId = herdId;
	}
	
	public String getDesLocation() {
		return desLocation;
	}
	
	public void setDesLocation(String desLocation) {
		this.desLocation = desLocation;
	}
	
	public String getfComment() {
		return fComment;
	}
	
	public void setfComment(String fComment) {
		this.fComment = fComment;
	}
}
