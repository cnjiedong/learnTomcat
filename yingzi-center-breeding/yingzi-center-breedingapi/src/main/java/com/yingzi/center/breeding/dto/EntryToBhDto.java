package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import java.util.Date;

/**
 * @author hpx
 * @Date 2018/4/24
 */
public class EntryToBhDto extends BaseVo{
    /**主键id*/
    @javax.persistence.Id
    private String id;

    /**转入日期*/
    private Date entryDate;

    /**档案id*/
    private Long herdId;

    /**新位置*/
    private String desLocation;

    /**体重*/
    private Double weight;

    /**备注*/
    private String fcomment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDesLocation() {
        return desLocation;
    }

    public void setDesLocation(String desLocation) {
        this.desLocation = desLocation;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
