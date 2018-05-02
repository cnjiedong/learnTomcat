package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Table;

/**
* @ClassName: SetEventEo
* @Description: (事件输入页面绘制)
* @Author JIEDONG
* @Date 2018-04-019
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

@Table(name = "bc_set_event")
public class SetEventDto extends BaseVo {
    /**事件编号*/
    private  String eventNumber;
    /**事件名称*/
    private  String eventName;
    /**事件参数*/
    private String eventParam	;
    /**事件参数值*/
    private String eventParamValue	;
    /**查询地址*/
    private String eventQuery;
    /**新增地址*/
    private String eventAdd;
    /**编辑地址*/
    private String eventEdit;
    /**删除地址*/
    private String eventDelete;

    //@JsonSerialize(using = LongJsonSerializer.class)
   // private Long id;

    public String getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventParam() {
        return eventParam;
    }

    public void setEventParam(String eventParam) {
        this.eventParam = eventParam;
    }

    public String getEventParamValue() {
        return eventParamValue;
    }

    public void setEventParamValue(String eventParamValue) {
        this.eventParamValue = eventParamValue;
    }

    public String getEventQuery() {
        return eventQuery;
    }

    public void setEventQuery(String eventQuery) {
        this.eventQuery = eventQuery;
    }

    public String getEventAdd() {
        return eventAdd;
    }

    public void setEventAdd(String eventAdd) {
        this.eventAdd = eventAdd;
    }

    public String getEventEdit() {
        return eventEdit;
    }

    public void setEventEdit(String eventEdit) {
        this.eventEdit = eventEdit;
    }

    public String getEventDelete() {
        return eventDelete;
    }

    public void setEventDelete(String eventDelete) {
        this.eventDelete = eventDelete;
    }

   /* public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/
}
