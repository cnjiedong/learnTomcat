package com.yingzi.center.breeding.dto;
import com.dtyunxi.vo.BaseVo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: HerdRegisterDto
 * @Description: (猪只档案)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */

public class HerdRegisterDto extends BaseVo {
    /**ID*/
    private String id;


    /**猪只编号*/
    private Long herdId;

    /**事件日期*/
    private Date evDate;

    /**性别*/
    private String sex;

    /**品种*/
    private String breeding;

    /**出生日期*/
    private Date birthDate;

    /**窝号*/
    private Long litterId;

    /**来源种类*/
    private String sourceType;

    /**来源*/
    private String source;

    /**初始胎龄*/
    private int iniparity;

    /**初始位置*/
    private String inilLocation;

    /**父系*/
    private Long fatherId;

    /**母系*/
    private Long motherId;

    /**体重*/
    private BigDecimal weight;

    /**价格*/
    private BigDecimal price;

    /**备注*/
    private String fcomment;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getHerdId() {
        return herdId;
    }

    public Long getHerdId(Long herdId) {
        return this.herdId;
    }

    public void setHerdId(Long herdId) {
        this.herdId = herdId;
    }

    public Date getEvDate() {
        return evDate;
    }

    public void setEvDate(Date evDate) {
        this.evDate = evDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getLitterId() {
        return litterId;
    }

    public void setLitterId(Long litterId) {
        this.litterId = litterId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getIniparity() {
        return iniparity;
    }

    public void setIniparity(int iniparity) {
        this.iniparity = iniparity;
    }

    public String getInilLocation() {
        return inilLocation;
    }

    public void setInilLocation(String inilLocation) {
        this.inilLocation = inilLocation;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public Long getMotherId() {
        return motherId;
    }

    public void setMotherId(Long motherId) {
        this.motherId = motherId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
