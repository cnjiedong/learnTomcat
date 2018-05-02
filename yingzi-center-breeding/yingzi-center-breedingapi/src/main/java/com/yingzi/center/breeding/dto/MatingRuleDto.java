package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;
import javax.persistence.Id;

/**
 * Created by user08 on 2018/4/20.
 */
public class MatingRuleDto extends BaseVo {

    /**ID**/
    @Id
    protected String id;

    /**后裔id*/

    private  long offsId;
    /**父亲id*/
    private  long fatherId;
    /**母亲*/
    private  long motherId;
    /**启用,禁用*/
    private Integer fenable	;

    private String fatherName;

    private String motherName;

    public void setOffsId(long offsId) {
        this.offsId = offsId;
    }

    private String offsName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getOffsName() {
        return offsName;
    }

    public void setOffsName(String offsName) {
        this.offsName = offsName;
    }
}






