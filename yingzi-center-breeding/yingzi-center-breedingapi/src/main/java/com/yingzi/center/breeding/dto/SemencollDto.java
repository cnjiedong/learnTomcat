/**
 * @(#) DemoDto.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Id;

/**
 * 采精 Dto
 *2018-4-21
 * @author hcp
 * @since 1.0.0
 */
public class SemencollDto extends BaseVo{
    /**ID**/
    @Id
    protected String id;

    //主组织ID
    private String masterOrgId;

    private String farmId;

    //采精日期
    private Date collectionDate;

    //档案ID
    private String herdId;

    //公猪耳号
    private String maleId;

    //精液编号
    private String semenId;

    //剂量
    private Integer dosage;

    //预期剂量
    private Integer expDosage;

    //颜色
    private String fcolour;

    //个体活力
    private Integer unitActivity;

    //稀释后活力
    private Integer attenuationActivity;

    //精子活力
    private Integer spermActivity;

    //评估
    private String assess;

    //技术员
    private String technician;

    //胶状
    private Integer gelatineous;

    //合适的
    private Integer suitable;

    //备注
    private String fcomment;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(String masterOrgId) {
        this.masterOrgId = masterOrgId;
    }

    public String getFarmId(){return this.farmId;}

    public void setFarmId(String farmId){this.farmId = farmId;}


    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public String getHerdId() {
        return herdId;
    }

    public void setHerdId(String herdId) {
        this.herdId = herdId;
    }

    public String getMaleId() {
        return maleId;
    }

    public void setMaleId(String maleId) {
        this.maleId = maleId;
    }

    public String getSemenId() {
        return semenId;
    }

    public void setSemenId(String semenId) {
        this.semenId = semenId;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public Integer getExpDosage() {
        return expDosage;
    }

    public void setExpDosage(int expDosage) {
        this.expDosage = expDosage;
    }

    public String getFcolour() {
        return fcolour;
    }

    public void setFcolour(String fcolour) {
        this.fcolour = fcolour;
    }

    public Integer getUnitActivity() {
        return unitActivity;
    }

    public void setUnitActivity(int unitActivity) {
        this.unitActivity = unitActivity;
    }

    public Integer getAttenuationActivity() {
        return attenuationActivity;
    }

    public void setAttenuationActivity(int attenuationActivity) {
        this.attenuationActivity = attenuationActivity;
    }

    public Integer getSpermActivity() {
        return spermActivity;
    }

    public void setSpermActivity(int spermActivity) {
        this.spermActivity = spermActivity;
    }

    public String getAssess() {
        return assess;
    }

    public void setAssess(String assess) {
        this.assess = assess;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public Integer getGelatineous() {
        return gelatineous;
    }

    public void setGelatineous(int gelatineous) {
        this.gelatineous = gelatineous;
    }

    public Integer getSuitable() {
        return suitable;
    }

    public void setSuitable(int suitable) {
        this.suitable = suitable;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
