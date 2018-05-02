/**
 * @(#) DemoEo.java 1.0 2018-01-25
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 采精 Eo
 *2018-4-21
 * @author hcp
 * @since 1.0.0
 */
@Table(name="bc_semen_collection")
public class SemencollEo extends BaseEo {

    @Column(name="master_org_id")
    private Long masterOrgId;

    @Column(name="farm_id")
    private Long farmId;
    //采精日期
    @Column(name="collectiondate")
    private Date collectionDate;

    //档案ID
    @Column(name="herd_id")
    private Long herdId;

    //公猪耳号
    @Column(name="male_id")
    private Long maleId;

    //精液编号
    @Column(name="semen_id")
    private Long semenId;

    //剂量
    @Column(name="dosage")
    private Integer dosage;

    //预期剂量
    @Column(name="exp_dosage")
    private Integer expDosage;

    //颜色
    @Column(name="fcolour")
    private String fcolour;

    //个体活力
    @Column(name="unit_activity")
    private Integer unitActivity;

    //稀释后活力
    @Column(name="attenuation_activity")
    private Integer attenuationActivity;

    //精子活力
    @Column(name="sperm_activity")
    private Integer spermActivity;

    //评估
    @Column(name="assess")
    private String assess;

    //技术员
    @Column(name="technician")
    private String technician;

    //胶状
    @Column(name="gelatineous")
    private Integer gelatineous;

    //合适的
    @Column(name="suitable")
    private Integer suitable;

    //备注
    @Column(name="fcomment")
    private String fcomment;

    public Long getMasterOrgId(){return masterOrgId;}

    public void setMasterOrgId(Long masterOrgId){this.masterOrgId = masterOrgId;}

    public Long getFarmId(){return farmId;}

    public void setFarmId(Long farmId){this.farmId = farmId;}

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Long getHerdId() {
        return herdId;
    }

    public void setHerdId(Long herdId) {
        this.herdId = herdId;
    }

    public Long getMaleId() {
        return maleId;
    }

    public void setMaleId(Long maleId) {
        this.maleId = maleId;
    }

    public Long getSemenId() {
        return semenId;
    }

    public void setSemenId(Long semenId) {
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
