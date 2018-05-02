package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by user14 on 2018/4/18.
 */
@Table(name = "bc_female_wean")
public class WeaningEo extends BaseEo {

    /**主组织id*/
    @Column(name = "master_org_id")
    private Long masterOrgId;

    /**断奶日期*/
    @Column(name = "weandate")
    private Date weanDate;

    /**档案id*/
    @Column(name = "herd_id")
    private Long herdId;

    /**事件id*/
    @Column(name = "event_id")
    private Long eventId;

    /**断奶头数*/
    @Column(name = "weans")
    private Integer weans;

    /**断奶总重*/
    @Column(name = "totalweight")
    private Double totalWeight;

    /**批次号*/
    @Column(name = "group_id")
    private Integer groupId;

    /**母猪位置*/
    @Column(name = "Femalelocation")
    private String femaleLocation;

    /**备注*/
    @Column(name = "fcomment")
    private String fcomment;

    public Long getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(Long masterOrgId) {
        masterOrgId = masterOrgId;
    }

    public Date getWeanDate() {
        return weanDate;
    }

    public void setWeanDate(Date weanDate) {
        this.weanDate = weanDate;
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

    public Integer getWeans() {
        return weans;
    }

    public void setWeans(Integer weans) {
        this.weans = weans;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getFemaleLocation() {
        return femaleLocation;
    }

    public void setFemaleLocation(String femaleLocation) {
        this.femaleLocation = femaleLocation;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
