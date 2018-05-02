package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author hpx
 * @Date 2018/4/24
 */
@Table(name = "bc_herd_entry")
public class EntryToBhEo extends BaseEo{
    /**主组织id*/
    @Column(name = "master_org_id")
    private Long masterOrgId;

    /**转入日期*/
    @Column(name = "entrydate")
    private Date entryDate;

    /**档案id*/
    @Column(name = "herd_id")
    private Long herdId;

    /**事件id*/
    @Column(name = "event_id")
    private Long eventId;

    /**断奶总重*/
    @Column(name = "weight")
    private Double weight;

    /**新位置*/
    @Column(name = "deslocation")
    private String desLocation;

    /**备注*/
    @Column(name = "fcomment")
    private String fcomment;

    public Long getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(Long masterOrgId) {
        this.masterOrgId = masterOrgId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDesLocation() {
        return desLocation;
    }

    public void setDesLocation(String desLocation) {
        this.desLocation = desLocation;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
