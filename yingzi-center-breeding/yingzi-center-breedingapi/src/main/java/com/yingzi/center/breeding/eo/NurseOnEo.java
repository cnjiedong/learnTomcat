package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
@Table(name = "bc_female_nurseon")
public class NurseOnEo extends BaseEo {

    /**主组织id*/
    @Column(name = "master_org_id")
    private Long masterOrgId;

    /**断奶日期*/
    @Column(name = "nurseondate")
    private Date nurseOnDate;

    /**档案id*/
    @Column(name = "herd_id")
    private Long herdId;

    /**事件id*/
    @Column(name = "event_id")
    private Long eventId;

    /**断奶头数*/
    @Column(name = "prewean")
    private Integer preWean;

    /**日龄*/
    @Column(name = "age")
    private Integer age;

    /**寄出母猪*/
    @Column(name = "forsteroff")
    private Integer forsterOff;

    /**备注*/
    @Column(name = "fcomment")
    private String fcomment;

    public Long getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(Long masterOrgId) {
        masterOrgId = masterOrgId;
    }

    public Date getNurseOnDate() {
        return nurseOnDate;
    }

    public void setNurseOnDate(Date nurseOnDate) {
        this.nurseOnDate = nurseOnDate;
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

    public Integer getPreWean() {
        return preWean;
    }

    public void setPreWean(Integer preWean) {
        this.preWean = preWean;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getForsterOff() {
        return forsterOff;
    }

    public void setForsterOff(Integer forsterOff) {
        this.forsterOff = forsterOff;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
