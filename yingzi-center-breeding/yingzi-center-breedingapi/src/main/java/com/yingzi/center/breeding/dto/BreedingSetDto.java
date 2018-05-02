package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import javax.persistence.Id;

/**
* @ClassName: BreedingSetEo
* @Description: (品种设置单)
* @Author XIAN
* @Date 2018-04-07
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/


public class BreedingSetDto extends BaseVo{

    /**ID**/
    @Id
    protected String id;

    /**品系编码*/
    private  String fcode;
    /**品种名称*/
    private  String fname;
    /**启用状态 0-启用,1-禁用*/
    private int fenable	;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
