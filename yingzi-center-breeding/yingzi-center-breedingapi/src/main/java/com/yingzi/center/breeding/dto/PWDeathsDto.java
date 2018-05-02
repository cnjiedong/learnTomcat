package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;


import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * 断奶前死亡
 * Created by user38 on 2018/4/25.
 */
public class PWDeathsDto extends BaseVo {

    /**
     * ID
     */
    @Id
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
