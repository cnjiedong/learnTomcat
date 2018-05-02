package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;

/**
* @ClassName: BreedingSetEo
* @Description: (品种设置单)
* @Author XIAN
* @Date 2018-04-07
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

@Table(name = "bc_set_breeding")
public class BreedingSetEo extends BaseEo{
    /**品系编码*/
    @Column(name = "fcode")
    private  String fcode;
    /**品种名称*/
    @Column(name = "fname")
    private  String fname;
    /**启用状态 0-启用,1-禁用*/
    @Column(name = "fenable")
    private int fenable	;

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getFenable() {
        return fenable;
    }

    public void setFenable(int fenable) {
        this.fenable = fenable;
    }
}
