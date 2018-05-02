package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @ClassName: HnsInfoEo
 * @Description: (发情未种单)
 * @Author XIAN
 * @Date 2018-04-07
 * @Version V1.0H
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Table(name = "bc_female_hns")
public class HnsInfoEo extends BaseEo {


    /**事件日期*/
    @Column(name = "heatdate")
    private Date heatDate;


    /**母猪编号*/
    @Column(name = "herd_id")
    private  Long herdId;

    /**事件编号*/
    @Column(name = "event_id")
    private  Long eventId;
    /**发情状态 0-发情但主动不配,1-发情但无法配种,2-发情不明显不配*/
    @Column(name = "heatresult")
    private String  heatResult;
    /**技术人员*/
    @Column(name = "technician")
    private String  technician;

    /**备注*/
    @Column(name = "fcomment")
    private String fcomment;

    @Override
    public String toString() {
        return "HnsInfoEo{" +
                "heatDate=" + heatDate +
                ", herdId=" + herdId +
                ", eventId=" + eventId +
                ", heatResult='" + heatResult + '\'' +
                ", technician='" + technician + '\'' +
                ", fcomment='" + fcomment + '\'' +
                ", id=" + id +
                '}';
    }

    public Date getHeatDate() {
        return heatDate;
    }

    public void setHeatDate(Date heatDate) {
        this.heatDate = heatDate;
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

    public String getHeatResult() {
        return heatResult;
    }

    public void setHeatResult(String heatResult) {
        this.heatResult = heatResult;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}


