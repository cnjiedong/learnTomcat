package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
* @ClassName: DataParamEo
* @Description: (数据验证参数设置单)
* @Author hcp
* @Date 2018-04-18
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

@Table(name = "bc_set_dataparam")
public class DataParamEo extends BaseEo{
    /**参数编码*/
    @Column(name = "fcode")
    private  String fcode;
    /**参数描述*/
    @Column(name = "param_desc")
    private  String paramDesc;
    /**参数值*/
    @Column(name = "param_value")
    private BigDecimal paramValue;
    /**启用状态 0-启用,1-禁用*/
    @Column(name = "fenable")
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

    public void setParamValue(BigDecimal paramValue) {
        this.paramValue = paramValue;
    }

    public BigDecimal getParamValue() {
        return paramValue;
    }

    public int getFenable() {
        return fenable;
    }

    public void setFenable(Integer fenable) {
        this.fenable = fenable;
    }



}
