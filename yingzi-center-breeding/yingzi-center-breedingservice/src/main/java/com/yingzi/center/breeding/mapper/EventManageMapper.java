package com.yingzi.center.breeding.mapper;
import com.dtyunxi.huieryun.ds.BaseMapper;

import com.yingzi.center.breeding.dto.EventsManageDto;
import com.yingzi.center.breeding.eo.EventsManageEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface EventManageMapper extends BaseMapper<EventsManageEo> {


    @Select({"<script>" +
            " id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id,herd_id,evtype,evdate,"+
            " fieldtext0,fieldtext1,fieldtext2,fieldnum0,fieldnum1,fieldubi0,fieldubi1,fieldint0,fieldint1,fieldint2,"+
            " fieldint3,fieldint4,fieldint5,fieldint6,pk_pointer,fserial,fcomment " +
            " from bc_center_event" +
            " where dr = 0  " +
            " <if test=\"herdid != null and herdid != '' \"> " +
            " and herd_id = #{herdid}" +
            " </if>" +
            " <if test=\"id != null and id != '' \"> " +
            " and id = #{id}" +
            " </if>" +
            " <if test=\"masterorgid != null and masterorgid != '' \"> " +
            " and master_org_id = #{masterorgid}" +
            " </if>" +
            " <if test=\"tenantid != null and tenantid != '' \"> " +
            " and tenant_id = #{tenantid}" +
            " </if>" +
            " <if test=\"pkpointer != null and pkpointer != '' \"> " +
            " and pk_pointer = #{pkpointer}" +
            " </if>" +
            "</script>"})
    public List<EventsManageEo> pageQuery(EventsManageDto request);


    @Delete({"<script>" +
            " delete " +
            " from bc_center_event" +
            " where id = #{id}  " +
            "</script>"})
    public int deleteByCenterEventId(@Param("id") long id);


}