package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;
import com.dtyunxi.vo.BaseVo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
* @ClassName: SetEventDto
* @Description: (孕检EO)
* @Author JIEDONG
* @Date 2018-04-019
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

@Table(name = "bc_female_check")
public class CheckInfoEo extends BaseEo {
    /**主组织ID*/
    @Column(name = "master_org_id")
    private  String masterOrgId;
    /**孕检时间*/
    @Column(name = "checkdate")
    private Date checkDate;
    /**档案ID*/
    @Column(name = "herd_id")
    private  Long herdId;
    /**事件ID*/
    @Column(name = "event_id")
    private Long eventId;
    /**孕检结果*/
    @Column(name = "checkresult")
    private  String checkResult;
    /**位置*/
    @Column(name = "deslocation")
    private  String deslocation;
    /**技术员*/
    @Column(name = "technician")
    private  String technician;
    /**备注*/
    @Column(name = "fcomment")
    private  String fcomment;

    public String getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(String masterOrgId) {
        this.masterOrgId = masterOrgId;
    }

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
}
