package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: EventsManageEo
 * @Description: (猪只事件管理单)
 * @Author XIAN
 * @Date 2018-04-07
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */

@Table(name = "bc_center_event")
public class EventsManageEo extends BaseEo{


    /**胎次*/
    private String bitthparity;


    /**租户ID*/
//    @Column(name = "tenant_id")
//    private long tenantid;

    /**主组织ID*/
    @Column(name = "master_org_id")
    private long masterorgid;

    /**档案ID*/
    @Column(name = "herd_id")
    private long herdid;

    /**事件类型*/
    @Column(name = "evtype")
    private String evtype;
    /**事件时间*/
    @Column(name = "evdate")
    private Date evdate;
    /**对应事件ID*/
    @Column(name = "pk_pointer")
    private long pkpointer;
    /**序列号*/
    @Column(name = "fserial")
    private String fserial;
    /**备注*/
    @Column(name = "fcomment")
    private String fcomment;


    @Column(name = "fieldtext0")
    private long fieldtext0;

    @Column(name = "fieldtext1")
    private long fieldtext1;

    @Column(name = "fieldtext2")
    private long fieldtext2;

    @Column(name = "fieldnum0")
    private BigDecimal fieldnum0;

    @Column(name = "fieldnum1")
    private BigDecimal fieldnum1;

    @Column(name = "fieldubi0")
    private String fieldubi0;

    @Column(name = "fieldubi1")
    private String fieldubi1;

    @Column(name = "fieldint0")
    private int fieldint0;

    @Column(name = "fieldint1")
    private int fieldint1;

    @Column(name = "fieldint2")
    private int fieldint2;

    @Column(name = "fieldint3")
    private int fieldint3;

    @Column(name = "fieldint4")
    private int fieldint4;

    @Column(name = "fieldint5")
    private int fieldint5;

    @Column(name = "fieldint6")
    private int fieldint6;



//    public long getTenantid() {
//        return tenantid;
//    }
//    public void setTenantid(long tenantid) {
//        this.tenantid = tenantid;
//    }

    public long getMasterorgid() {
        return masterorgid;
    }
    public void setMasterorgid(long masterorgid) {
        this.masterorgid = masterorgid;
    }


    public Date getEvdate() {
        return evdate;
    }

    public void setEvdate(Date evdate) {
        this.evdate = evdate;
    }

    public String getBitthparity() {
        return bitthparity;
    }

    public void setBitthparity(String bitthparity) {
        this.bitthparity = bitthparity;
    }

    public long getHerdid() {
        return herdid;
    }
    public void setHerdid(long herdid) {
        this.herdid = herdid;
    }

    public String getEvtype() {
        return evtype;
    }

    public void setEvtype(String evtype) {
        this.evtype = evtype;
    }

    public long getPointer() {
        return pkpointer;
    }

    public void setPointer(long pkpointer) {
        this.pkpointer = pkpointer;
    }

    public String getFcomment() {
        return fcomment;
    }
    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }

    public String getFserial() {
        return fserial;
    }
    public void setFserial(String fserial) {
        this.fserial = fserial;
    }

    public long getFieldtext0() {
        return fieldtext0;
    }
    public void setFieldtext0(long fieldtext0) {
        this.fieldtext0 = fieldtext0;
    }

    public long getFieldtext1() {
        return fieldtext1;
    }
    public void setFieldtext1(long fieldtext1) {
        this.fieldtext1 = fieldtext1;
    }

    public long getFieldtext2() {
        return fieldtext2;
    }
    public void setFieldtext2(long fieldtext2) {
        this.fieldtext2 = fieldtext2;
    }

    public BigDecimal getFieldnum0() {
        return fieldnum0;
    }
    public void setFieldnum0(BigDecimal fieldnum0) {
        this.fieldnum0 = fieldnum0;
    }

    public BigDecimal getFieldnum1() {
        return fieldnum1;
    }
    public void setFieldnum1(BigDecimal fieldnum1) {
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

    public int getFieldint0() {
        return fieldint0;
    }
    public void setFieldint0(int fieldint0) {
        this.fieldint0 = fieldint0;
    }

    public int getFieldint1() {
        return fieldint1;
    }
    public void setFieldint1(int fieldint1) {
        this.fieldint1 = fieldint1;
    }

    public int getFieldint2() {
        return fieldint2;
    }
    public void setFieldint2(int fieldint2) {
        this.fieldint2 = fieldint2;
    }

    public int getFieldint3() {
        return fieldint3;
    }
    public void setFieldint3(int fieldint3) {
        this.fieldint3 = fieldint3;
    }

    public int getFieldint4() {
        return fieldint4;
    }
    public void setFieldint4(int fieldint4) {
        this.fieldint4 = fieldint4;
    }

    public int getFieldint5() {
        return fieldint5;
    }
    public void setFieldint5(int fieldint5) {
        this.fieldint5 = fieldint5;
    }

    public int getFieldint6() {
        return fieldint6;
    }
    public void setFieldint6(int fieldint6) {
        this.fieldint6 = fieldint6;
    }




}


