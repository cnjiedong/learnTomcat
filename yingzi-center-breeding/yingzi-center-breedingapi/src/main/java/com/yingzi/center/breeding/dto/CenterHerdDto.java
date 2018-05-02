package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.util.Date;

/**
* @ClassName: SetEventEo
* @Description: (种猪档案EO)
* @Author JIEDONG
* @Date 2018-04-019
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

public class CenterHerdDto extends BaseVo {

    /***/
    Long  farmId;
    /**编码*/
    String  fnumber;
    /**耳号*/
    String  earno;
    /**场内编码*/
    String  onsitnum;
    /**国外编码*/
    String  externalnum;
    /**RFID编码*/
    String  rfidCode;
    /**条码号*/
    String  barCode;
    /**二维码*/
    String  qrCode;
    /**塔图编码*/
    String  tatuCode;
    /**猪脸识别号*/
    String  faiCode;
    /**全身识别号*/
    String  bodyCode;
    /**性别*/
    String  sex;
    /**品种*/
    String  breeding;
    /**品系*/
    String  strain;
    /**出生日期*/
    Date  birthdate;
    /**出生重*/
    Double  birthWeight;
    /**出生母猪胎次*/
    Long  bitthparity;
    /**出生同窝头数*/
    Long  birthqty;
    /**左乳*/
    Long  leftnipple;
    /**右乳*/
    Long  rightnipple;
    /**来源类型*/
    String  sourceType;
    /**出生地*/
    String  birthsite;
    /**母亲*/
    Long  motherId;
    /**父亲*/
    Long  fatherId;
    /**代孕母*/
    Long  surmoterId;
    /**可用标识*/
    Long  archive;
    /**初始胎次*/
    Long  iniparity;

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
