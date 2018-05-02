package com.yingzi.center.breeding.mapper;
import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.SetEventDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.SetEventEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface SetEventMapper extends BaseMapper<SetEventEo> {

    @Select({"<script>" +
            "select id,tenant_id,dr,create_person,create_time,update_person,update_time,event_number,event_name,event_param,event_param_value,\n" +
            "event_query,event_add,event_edit,event_delete " +
            " from bc_set_event " +
            " where event_number = #{event_number} " +
            "</script>"})
    public SetEventDto queryDetail(@Param("event_number")String eventNumber);
}