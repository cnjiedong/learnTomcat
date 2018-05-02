package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
* @ClassName: CheckInfoDto
* @Description: (孕检)
* @Author JIEDONG
* @Date 2018-04-019
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

public class CheckInfoDto extends BaseVo {

    /**ID*/
    private  String id;
    /**孕检时间*/
    private Date checkDate;
    /**档案ID*/
    private  Long herdId;
    /**事件ID*/
    private Long eventId;
    /**孕检结果*/
    private  String checkResult;
    /**位置*/
    private  String deslocation;
    /**技术员*/
    private  String technician;
    /**备注*/
    private  String fcomment;

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+08:00"
    )
    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
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

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getDeslocation() {
        return deslocation;
    }

    public void setDeslocation(String deslocation) {
        this.deslocation = deslocation;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
