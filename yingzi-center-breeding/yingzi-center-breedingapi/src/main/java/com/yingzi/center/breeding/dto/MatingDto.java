package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import java.util.Date;

/**
 * @author hpx
 * @Date 2018/4/25
 */
public class MatingDto extends BaseVo{
    /**主键id*/
    @javax.persistence.Id
    private String id;

    /**配种日期*/
    private Date servDate;

    /**母猪档案id*/
    private Long herdId;

    /**精液*/
    private Long semen;

    /**技术人员*/
    private String technician;

    /**剂量*/
    private Integer dosage;

    /**小时*/
    private Integer fhour;

    /**后裔品种*/
    private String offspringBreeding;

    /**备注*/
    private String fcomment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getServDate() {
        return servDate;
    }

    public void setServDate(Date servDate) {
        this.servDate = servDate;
    }

    public Long getHerdId() {
        return herdId;
    }

    public void setHerdId(Long herdId) {
        this.herdId = herdId;
    }

    public Long getSemen() {
        return semen;
    }

    public void setSemen(Long semen) {
        this.semen = semen;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    public Integer getFhour() {
        return fhour;
    }

    public void setFhour(Integer fhour) {
        this.fhour = fhour;
    }

    public String getOffspringBreeding() {
        return offspringBreeding;
    }

    public void setOffspringBreeding(String offspringBreeding) {
        this.offspringBreeding = offspringBreeding;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
