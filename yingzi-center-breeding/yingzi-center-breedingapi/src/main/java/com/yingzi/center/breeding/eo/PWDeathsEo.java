package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * 断奶前死亡
 * Created by user38 on 2018/4/25.
 */
@Table(name = "bc_female_preweandeath")
public class PWDeathsEo extends BaseEo {

    /**
     * 死亡日期
     */
    @Column(name = "deathdate")
    private Date deathDate;

    /**
     * 档案ID
     */
    @Column(name = "herd_id")
    private long herdId;

    /**
     * 死亡头数
     */
    @Column(name = "deaths")
    private int deaths;

    /**
     * 死亡原因
     */
    @Column(name = "deathreason")
    private String deathReason;

    /**
     * 备注
     */
    @Column(name = "fcomment")
    private String fcomment;

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public long getHerdId() {
        return herdId;
    }

    public void setHerdId(long herdId) {
        this.herdId = herdId;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public String getDeathReason() {
        return deathReason;
    }

    public void setDeathReason(String deathReason) {
        this.deathReason = deathReason;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}
