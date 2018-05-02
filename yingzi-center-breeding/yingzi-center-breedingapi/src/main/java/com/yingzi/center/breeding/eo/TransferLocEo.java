package com.yingzi.center.breeding.eo;

import javax.persistence.Column;
import javax.persistence.Table;

import com.dtyunxi.eo.BaseEo;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
@SuppressWarnings("serial")
@Table(name = "bc_female_transferloc")
public class TransferLocEo extends BaseEo {

	@Column(name = "transferdate")
	private String transferDate;
	
	@Column(name = "herd_id")
	private String herdId;
	
	@Column(name = "desLocation")
	private String desLocation;
	
	@Column(name = "fcomment")
	private String fComment;

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
