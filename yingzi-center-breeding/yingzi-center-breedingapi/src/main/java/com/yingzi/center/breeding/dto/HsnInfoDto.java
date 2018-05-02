package com.yingzi.center.breeding.dto;


import com.dtyunxi.vo.BaseVo;

import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName: HnsInfoDto
 * @Description: (发情未配种表)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
public class HsnInfoDto  extends BaseVo {
    /**
     * ID
     **/
    @Id
    protected String id;


    /**
     * 事件日期
     */
    private Date heatDate;

    /**
     * 母猪编号
     */
    private Long herdId;
    /**
     * 事件编号
     */

    private Long eventId;
    /**
     * 发情状态 0-发情但主动不配,1-发情但无法配种,2-发情不明显不配
     */
    private String heatResult;

    /**
     * 技术人员
     */
    private String technician;

    /**备注*/
    private String fcomment;

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getHeatDate() {
        return heatDate;
    }

    public void setHeatDate(Date heatDate) {
        this.heatDate = heatDate;
    }

    public Long getHerdId() {
        return herdId;
    }

    public void setHerdId(Long herdId) {
        this.herdId = herdId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getHeatResult() {
        return heatResult;
    }

    public void setHeatResult(String heatResult) {
        this.heatResult = heatResult;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }
}


