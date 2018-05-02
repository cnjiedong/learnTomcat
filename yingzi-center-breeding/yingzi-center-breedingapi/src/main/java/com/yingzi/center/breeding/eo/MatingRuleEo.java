package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by user08 on 2018/4/20.
 */
@Table(name = "bc_set_matingrule")
public class MatingRuleEo extends BaseEo {
    /**后裔id*/
    @Column(name = "offs_id")
    private  Long offsId;
    /**父亲id*/
    @Column(name = "father_id")
    private  Long fatherId;
    /**母亲*/
    @Column(name = "mother_id")
    private  Long motherId;
    /**启用,禁用*/
    @Column(name = "fenable")
    private Integer fenable	;


    public Long getOffsId() {
        return offsId;
    }

    public void setOffsId(Long offsId) {
        this.offsId = offsId;
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

    public Integer getFenable() {
        return fenable;
    }

    public void setFenable(Integer fenable) {
        this.fenable = fenable;
    }
}
