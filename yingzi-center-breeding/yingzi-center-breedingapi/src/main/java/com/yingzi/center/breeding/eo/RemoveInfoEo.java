package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.text.DecimalFormat;
import java.util.Date;

/**
 *离场Eo单
 * @author user18
 * @date 2018/4/20
 */
@Table(name="bc_female_remove")
public class RemoveInfoEo extends BaseEo {

    /**
     * 离场日期
     */
    @Column(name = "removedate")
    private Date removedate;

    /**
     * 离场类型（枚举）
     */
    @Column(name = "removetype")
    private String removetype;

    /**
     * 离场原因
     */
    @Column(name = "removereason")
    private String removereason;

    /**
     * 档案ID
     * 母猪耳号
     */
    @Column(name = "herd_id")
    private String herdId;

    /**
     * 体重
     */
    @Column(name = "weight")
    private double weight;

    /**
     * 备注
     */
    @Column(name = "fcomment")
    private String fcomment;

    public Date getRemovedate() {
        return removedate;
    }

    public void setRemovedate(Date removedate) {
        this.removedate = removedate;
    }

    public String getRemovetype() {
        return removetype;
    }

    public void setRemovetype(String removetype) {
        this.removetype = removetype;
    }

    public String getRemovereason() {
        return removereason;
    }

    public void setRemovereason(String removereason) {
        this.removereason = removereason;
    }

    public String getHerdId() {
        return herdId;
    }

    public void setHerdId(String herdId) {
        this.herdId = herdId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
