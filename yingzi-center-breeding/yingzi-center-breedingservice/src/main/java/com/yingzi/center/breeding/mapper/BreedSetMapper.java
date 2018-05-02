package com.yingzi.center.breeding.mapper;
import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface BreedSetMapper extends BaseMapper<BreedingSetEo> {


    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,fcode,fname,fenable" +
            " from bc_set_breeding" +
            " where dr = 0  " +
            " <if test=\"fcode != null and fcode != '' \"> " +
            " and fcode = #{fcode}" +
            " </if>" +
            " <if test=\"fname != null and fname != '' \"> " +
            " and fname = #{fname}" +
            " </if>" +
            " <if test=\"fenable ==0 or fenable ==1 \"> " +
            " and fenable = #{fenable}" +
            " </if>" +
            "</script>"})
    public List<BreedingSetEo> pageQuery(BreedingSetDto request);

}