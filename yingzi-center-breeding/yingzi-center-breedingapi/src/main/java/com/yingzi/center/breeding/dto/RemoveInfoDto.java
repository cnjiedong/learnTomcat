package com.yingzi.center.breeding.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Id;
import java.util.Date;

/**
 *离场单
 * @author user18
 * @date 2018/4/20
 */
public class RemoveInfoDto {

    /**
     * ID
     */
    @Id
    protected String id;

    /**
     * 离场日期
     */
    private Date removedate;

    /**
     * 离场类型（枚举）
     */
    private String removetype;

    /**
     * 离场原因
     */
    private String removereason;

    /**
     * 档案ID
     * 母猪耳号
     */
    private String herdId;

    /**
     * 体重
     */
    private double weight;

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

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+08:00"
    )
    public Date getRemovedate() {
        return removedate;
    }

    public void setRemovedate(Date removedate) {
        this.removedate = removedate;
    }

    public String getRemovetype() {
        return removetype;
    }

    public void setRemovetype(String removetype) {
        this.removetype = removetype;
    }

    public String getRemovereason() {
        return removereason;
    }

    public void setRemovereason(String removereason) {
        this.removereason = removereason;
    }

    public String getHerdId() {
        return herdId;
    }

    public void setHerdId(String herdId) {
        this.herdId = herdId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
