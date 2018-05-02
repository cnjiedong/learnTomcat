package com.yingzi.center.breeding.mapper;
import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;
import com.yingzi.center.breeding.eo.CheckInfoEo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface CheckInfoMapper extends BaseMapper<CheckInfoEo> {

    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id masterOrgId,checkdate checkdate,herd_id herdId,event_id eventId,checkresult checkResult, " +
            " deslocation,technician,fcomment " +
            " from bc_female_check where 1 = 1 " +
            " <if test=\"herdId != null  \"> " +
            " and herd_id = #{herdId}" +
            " </if>" +
            " <if test=\"startTime != null  \"> " +
            " <![CDATA[and checkdate > #{startTime}]]>" +
            " </if>" +
            " <if test=\"endTime != null  \"> " +
            " <![CDATA[and checkdate < #{endTime}]]>" +
            " </if>" +
            "</script>"})
    public Page<CheckInfoDto> pageQuery(CheckInfoRequestDto checkInfoRequestDto);
}