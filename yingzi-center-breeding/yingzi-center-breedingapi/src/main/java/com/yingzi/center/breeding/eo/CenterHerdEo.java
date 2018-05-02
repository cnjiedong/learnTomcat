package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
* @ClassName: bc_center_herd
* @Description: (种猪档案)
* @Author JIEDONG
* @Date 2018-04-019
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

@Table(name = "bc_center_herd")
public class CenterHerdEo extends BaseEo {
    /**主组织ID*/
    @Column(name = "master_org_id")
    Long  masterOrgId;
    /***/
    @Column(name = "farm_id")
    Long  farmId;
    /**编码*/
    @Column(name = "fnumber")
    String  fnumber;
    /**耳号*/
    @Column(name = "earno")
    String  earno;
    /**场内编码*/
    @Column(name = "onsitnum")
    String  onsitnum;
    /**国外编码*/
    @Column(name = "externalnum")
    String  externalnum;
    /**RFID编码*/
    @Column(name = "rfid_code")
    String  rfidCode;
    /**条码号*/
    @Column(name = "bar_code")
    String  barCode;
    /**二维码*/
    @Column(name = "qr_code")
    String  qrCode;
    /**塔图编码*/
    @Column(name = "tatu_code")
    String  tatuCode;
    /**猪脸识别号*/
    @Column(name = "fai_code")
    String  faiCode;
    /**全身识别号*/
    @Column(name = "body_code")
    String  bodyCode;
    /**性别*/
    @Column(name = "sex")
    String  sex;
    /**品种*/
    @Column(name = "breeding")
    String  breeding;
    /**品系*/
    @Column(name = "strain")
    String  strain;
    /**出生日期*/
    @Column(name = "birthdate")
    Date  birthdate;
    /**出生重*/
    @Column(name = "birthweight")
    Double  birthWeight;
    /**出生母猪胎次*/
    @Column(name = "bitthparity")
    Long  bitthparity;
    /**出生同窝头数*/
    @Column(name = "birthqty")
    Long  birthqty;
    /**左乳*/
    @Column(name = "leftnipple")
    Long  leftnipple;
    /**右乳*/
    @Column(name = "rightnipple")
    Long  rightnipple;
    /**来源类型*/
    @Column(name = "sourcetype")
    String  sourceType;
    /**出生地*/
    @Column(name = "birthsite")
    String  birthsite;
    /**母亲*/
    @Column(name = "motherid")
    Long  motherId;
    /**父亲*/
    @Column(name = "fatherid")
    Long  fatherId;
    /**代孕母*/
    @Column(name = "surmoterid")
    Long  surmoterId;
    /**可用标识*/
    @Column(name = "archive")
    Long  archive;
    /**初始胎次*/
    @Column(name = "iniparity")
    Long  iniparity;

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

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
    }

    public String getEarno() {
        return earno;
    }

    public void setEarno(String earno) {
        this.earno = earno;
    }

    public String getOnsitnum() {
        return onsitnum;
    }

    public void setOnsitnum(String onsitnum) {
        this.onsitnum = onsitnum;
    }

    public String getExternalnum() {
        return externalnum;
    }

    public void setExternalnum(String externalnum) {
        this.externalnum = externalnum;
    }

    public String getRfidCode() {
        return rfidCode;
    }

    public void setRfidCode(String rfidCode) {
        this.rfidCode = rfidCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getTatuCode() {
        return tatuCode;
    }

    public void setTatuCode(String tatuCode) {
        this.tatuCode = tatuCode;
    }

    public String getFaiCode() {
        return faiCode;
    }

    public void setFaiCode(String faiCode) {
        this.faiCode = faiCode;
    }

    public String getBodyCode() {
        return bodyCode;
    }

    public void setBodyCode(String bodyCode) {
        this.bodyCode = bodyCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBreeding() {
        return breeding;
    }

    public void setBreeding(String breeding) {
        this.breeding = breeding;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Double getBirthWeight() {
        return birthWeight;
    }

    public void setBirthWeight(Double birthWeight) {
        this.birthWeight = birthWeight;
    }

    public Long getBitthparity() {
        return bitthparity;
    }

    public void setBitthparity(Long bitthparity) {
        this.bitthparity = bitthparity;
    }

    public Long getBirthqty() {
        return birthqty;
    }

    public void setBirthqty(Long birthqty) {
        this.birthqty = birthqty;
    }

    public Long getLeftnipple() {
        return leftnipple;
    }

    public void setLeftnipple(Long leftnipple) {
        this.leftnipple = leftnipple;
    }

    public Long getRightnipple() {
        return rightnipple;
    }

    public void setRightnipple(Long rightnipple) {
        this.rightnipple = rightnipple;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getBirthsite() {
        return birthsite;
    }

    public void setBirthsite(String birthsite) {
        this.birthsite = birthsite;
    }

    public Long getMotherId() {
        return motherId;
    }

    public void setMotherId(Long motherId) {
        this.motherId = motherId;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public Long getSurmoterId() {
        return surmoterId;
    }

    public void setSurmoterId(Long surmoterId) {
        this.surmoterId = surmoterId;
    }

    public Long getArchive() {
        return archive;
    }

    public void setArchive(Long archive) {
        this.archive = archive;
    }

    public Long getIniparity() {
        return iniparity;
    }

    public void setIniparity(Long iniparity) {
        this.iniparity = iniparity;
    }
}
