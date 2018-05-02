package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
@SuppressWarnings("serial")
public class PeriodDto extends BaseVo {
	
	protected String id;
	private String periodYear;
	private String periodNumber;
	private String sdate;
	private String edate;
	private String periodQuarter;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPeriodYear() {
		return periodYear;
	}
	
	public void setPeriodYear(String periodYear) {
		this.periodYear = periodYear;
	}
	
	public String getPeriodNumber() {
		return periodNumber;
	}
	
	public void setPeriodNumber(String periodNumber) {
		this.periodNumber = periodNumber;
	}
	
	public String getSdate() {
		return sdate;
	}
	
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
	public String getEdate() {
		return edate;
	}
	
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	public String getPeriodQuarter() {
		return periodQuarter;
	}
	
	public void setPeriodQuarter(String periodQuarter) {
		this.periodQuarter = periodQuarter;
	}
}
