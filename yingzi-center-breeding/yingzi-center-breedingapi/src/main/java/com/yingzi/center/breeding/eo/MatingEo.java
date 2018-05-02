package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author hpx
 * @Date 2018/4/25
 */
@Table(name = "bc_female_mating")
public class MatingEo extends BaseEo {

    /**主组织id*/
    @Column(name = "master_org_id")
    private Long masterOrgId;

    /**配种日期*/
    @Column(name = "servdate")
    private Date servDate;

    /**母猪耳号*/
    @Column(name = "herd_id")
    private Long herdId;

    /**事件id*/
    @Column(name = "event_id")
    private Long eventId;

    /**技术人员*/
    @Column(name = "technician")
    private String technician;

    /**精液*/
    @Column(name = "semen")
    private Long semen;

    /**小时*/
    @Column(name = "fhour")
    private Integer fhour;

    /**剂量*/
    @Column(name = "dosage")
    private Integer dosage;

    /**后裔品种*/
    @Column(name = "offspringbreeding")
    private String offspringBreeding;

    /**备注*/
    @Column(name = "fcomment")
    private String fcomment;

    public Long getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(Long masterOrgId) {
        this.masterOrgId = masterOrgId;
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

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public Long getSemen() {
        return semen;
    }

    public void setSemen(Long semen) {
        this.semen = semen;
    }

    public Integer getFhour() {
        return fhour;
    }

    public void setFhour(Integer fhour) {
        this.fhour = fhour;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
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
