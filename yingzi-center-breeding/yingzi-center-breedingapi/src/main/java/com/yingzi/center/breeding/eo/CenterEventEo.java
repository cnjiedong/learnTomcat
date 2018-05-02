/**
 * @(#) DemoEo.java 1.0 2018-01-25
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Demo Eo
 *
 * @author 无名
 * @since 1.0.0
 */
@Table(name = "bc_center_event")
public class CenterEventEo extends BaseEo {
    /**主组织ID*/
    @Column(name = "master_org_id")
    Long  masterOrgId;
    /***/
    @Column(name = "farm_id")
    Long  farmId;
    /**档案ID*/
    @Column(name = "herd_id")
    Long  herdId;
    /**事件类型*/
    @Column(name = "evtype")
    String  evType;
    /**事件时间*/
    @Column(name = "evdate")
    Date evdate;
    /**文本字段0*/
    @Column(name = "fieldtext0")
    Long  fieldtext0;
    /**文本字段1*/
    @Column(name = "fieldtext1")
    Long  fieldtext1;
    /**文本字段3*/
    @Column(name = "fieldtext2")
    Integer  fieldtext2;
    /**数值字段0*/
    @Column(name = "fieldnum0")
    Double  fieldnum0;
    /**数值字段1*/
    @Column(name = "fieldnum1")
    Double  fieldnum1;
    /**模糊字段0*/
    @Column(name = "fieldubi0")
    String  fieldubi0;
    /**模糊字段1*/
    @Column(name = "fieldubi1")
    String  fieldubi1;
    /**整型字段0*/
    @Column(name = "fieldint0")
    Long  fieldint0;
    /**整型字段1*/
    @Column(name = "fieldint1")
    Long  fieldint1;
    /**整型字段2*/
    @Column(name = "fieldint2")
    Long  fieldint2;
    /**整型字段3*/
    @Column(name = "fieldint3")
    Long  fieldint3;
    /**整型字段4*/
    @Column(name = "fieldint4")
    Long  fieldint4;
    /**整型字段5*/
    @Column(name = "fieldint5")
    Long  fieldint5;
    /**整型字段6*/
    @Column(name = "fieldint6")
    Long  fieldint6;
    /**对应事件ID*/
    @Column(name = "pk_pointer")
    String  pkPointer;
    /**序列号*/
    @Column(name = "fserial")
    String  fserial;
    /**备注*/
    @Column(name = "fcomment")
    String  fcomment;

    public Long getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(Long masterOrgId) {
        this.masterOrgId = masterOrgId;
    }

    public Long getFarmId() {
        return farmId;
    }

    public void setFarmId(Long farmId) {
        this.farmId = farmId;
    }

    public Long getHerdId() {
        return herdId;
    }

    public void setHerdId(Long herdId) {
        this.herdId = herdId;
    }

    public String getEvType() {
        return evType;
    }

    public void setEvType(String evType) {
        this.evType = evType;
    }

    public Date getEvdate() {
        return evdate;
    }

    public void setEvdate(Date evdate) {
        this.evdate = evdate;
    }

    public Long getFieldtext0() {
        return fieldtext0;
    }

    public void setFieldtext0(Long fieldtext0) {
        this.fieldtext0 = fieldtext0;
    }

    public Long getFieldtext1() {
        return fieldtext1;
    }

    public void setFieldtext1(Long fieldtext1) {
        this.fieldtext1 = fieldtext1;
    }

    public Integer getFieldtext2() {
        return fieldtext2;
    }

    public void setFieldtext2(Integer fieldtext2) {
        this.fieldtext2 = fieldtext2;
    }

    public Double getFieldnum0() {
        return fieldnum0;
    }

    public void setFieldnum0(Double fieldnum0) {
        this.fieldnum0 = fieldnum0;
    }

    public Double getFieldnum1() {
        return fieldnum1;
    }

    public void setFieldnum1(Double fieldnum1) {
        this.fieldnum1 = fieldnum1;
    }

    public String getFieldubi0() {
        return fieldubi0;
    }

    public void setFieldubi0(String fieldubi0) {
        this.fieldubi0 = fieldubi0;
    }

    public String getFieldubi1() {
        return fieldubi1;
    }

    public void setFieldubi1(String fieldubi1) {
        this.fieldubi1 = fieldubi1;
    }

    public Long getFieldint0() {
        return fieldint0;
    }

    public void setFieldint0(Long fieldint0) {
        this.fieldint0 = fieldint0;
    }

    public Long getFieldint1() {
        return fieldint1;
    }

    public void setFieldint1(Long fieldint1) {
        this.fieldint1 = fieldint1;
    }

    public Long getFieldint2() {
        return fieldint2;
    }

    public void setFieldint2(Long fieldint2) {
        this.fieldint2 = fieldint2;
    }

    public Long getFieldint3() {
        return fieldint3;
    }

    public void setFieldint3(Long fieldint3) {
        this.fieldint3 = fieldint3;
    }

    public Long getFieldint4() {
        return fieldint4;
    }

    public void setFieldint4(Long fieldint4) {
        this.fieldint4 = fieldint4;
    }

    public Long getFieldint5() {
        return fieldint5;
    }

    public void setFieldint5(Long fieldint5) {
        this.fieldint5 = fieldint5;
    }

    public Long getFieldint6() {
        return fieldint6;
    }

    public void setFieldint6(Long fieldint6) {
        this.fieldint6 = fieldint6;
    }

    public String getPkPointer() {
        return pkPointer;
    }

    public void setPkPointer(String pkPointer) {
        this.pkPointer = pkPointer;
    }

    public String getFserial() {
        return fserial;
    }

    public void setFserial(String fserial) {
        this.fserial = fserial;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
