package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by user26 on 2018/4/24.
 */
@Table( name = "bc_female_abortion")
public class AbortionEo extends BaseEo {
    /**主组织id*/
    @Column(name = "master_org_id")
    private Long masterOrgId;

    /**流产日期*/
    @Column(name = "abortiondate")
    private Date abortionDate;

    /**档案id*/
    @Column(name = "herd_id")
    private Long herdId;

    /**事件id*/
    @Column(name = "event_id")
    private Long eventId;

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

    public Date getAbortionDate() {
        return abortionDate;
    }

    public void setAbortionDate(Date abortionDate) {
        this.abortionDate = abortionDate;
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
