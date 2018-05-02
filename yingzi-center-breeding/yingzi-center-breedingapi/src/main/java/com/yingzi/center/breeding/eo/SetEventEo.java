package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;
import com.dtyunxi.vo.BaseVo;

import javax.persistence.Column;

/**
* @ClassName: SetEventDto
* @Description: (事件输入页面绘制)
* @Author JIEDONG
* @Date 2018-04-019
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

public class SetEventEo extends BaseEo {
    /**事件编号*/
    @Column(name = "event_number")
    private  String eventNumber;
    /**事件名称*/
    @Column(name = "event_name")
    private  String eventName;
    /**事件参数*/
    @Column(name = "event_param")
    private String eventParam	;
    /**事件参数值*/
    @Column(name = "event_param_value")
    private String eventParamValue	;
    /**查询地址*/
    @Column(name = "event_query")
    private String eventQuery;
    /**新增地址*/
    @Column(name = "event_add")
    private String eventAdd;
    /**编辑地址*/
    @Column(name = "event_edit")
    private String eventEdit;
    /**删除地址*/
    @Column(name = "event_delete")
    private String eventDelete;

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
}
