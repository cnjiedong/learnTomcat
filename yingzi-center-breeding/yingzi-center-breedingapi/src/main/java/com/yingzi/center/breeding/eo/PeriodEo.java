package com.yingzi.center.breeding.eo;

import javax.persistence.Column;
import javax.persistence.Table;

import com.dtyunxi.eo.BaseEo;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
@SuppressWarnings("serial")
@Table(name = "bc_set_period")
public class PeriodEo extends BaseEo {
	
	@Column(name = "period_year")
	private String periodYear;
	
	@Column(name = "period_number")
	private String periodNumber;
	
	@Column(name = "sdate")
	private String sdate;
	
	@Column(name = "edate")
	private String edate;
	
	@Column(name = "period_quarter")
	private String periodQuarter;

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
