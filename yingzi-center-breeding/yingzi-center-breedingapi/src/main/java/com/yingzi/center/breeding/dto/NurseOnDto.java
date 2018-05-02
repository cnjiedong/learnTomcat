package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import java.util.Date;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public class NurseOnDto extends BaseVo {

    /**
     * 主键id
     */
    @javax.persistence.Id
    private String id;

    /**
     * 寄入日期
     */
    private Date nurseOnDate;

    /**
     * 母猪档案id
     */
    private Long herdId;

    /**
     * 数量
     */
    private Integer preWean;

    /**
     * 日龄
     */
    private Integer age;

    /**
     * 寄出母猪
     */
    private Integer forsterOff;

    /**
     * 备注
     */
    private String fcomment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
