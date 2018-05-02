package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
* @ClassName: DataParamEo
* @Description: (数据验证参数设置单)
* @Author hcp
* @Date 2018-04-19
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/


public class DataParamDto extends BaseVo{

    /**ID**/
    @Id
    protected String id;

    /**参数编码*/
    private  String fcode;
    /**参数描述*/
    private  String paramDesc;
    /**参数值*/
    private BigDecimal paramValue;
    /**启用状态 0-启用,1-禁用*/
    private Integer fenable;

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

    public BigDecimal getParamValue() {
        return paramValue;
    }

    public void setParamValue(BigDecimal paramValue) {
        this.paramValue = paramValue;
    }

    public Integer getFenable() {
        return fenable;
    }

    public void setFenable(Integer fenable) {
        this.fenable = fenable;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
