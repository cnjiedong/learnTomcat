package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import java.util.Date;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public class WeaningDto extends BaseVo {

    /**主键id*/
    @javax.persistence.Id
    private String id;

    /**断奶日期*/
    private Date weanDate;

    /**母猪档案id*/
    private Long herdId;

    /**断奶头数*/
    private Integer weans;

    /**断奶总重*/
    private Double totalWeight;

    /**批次号*/
    private Integer groupId;

    /**母猪位置*/
    private String femaleLocation;

    /**备注*/
    private String fcomment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
