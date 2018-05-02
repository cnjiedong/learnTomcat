package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import java.util.Date;

/**
 * Created by user26 on 2018/4/24.
 */
public class AbortionDto extends BaseVo{
    /**主键id*/
    @javax.persistence.Id
    private String id;

    /**流产日期*/
    private Date abortionDate;

    /**母猪档案id*/
    private Long herdId;

    /**新位置*/
    private String desLocation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    /**备注*/
    private String fcomment;
}
