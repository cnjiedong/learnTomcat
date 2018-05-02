package com.yingzi.center.breeding.mapper;
import com.dtyunxi.huieryun.ds.BaseMapper;

import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.FarrowingSetDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.FarrowingSetEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

public interface FarrowSetMapper extends BaseMapper<FarrowingSetEo> {


    @Select({"<script>" +
            " select *" +
            " from bc_female_farrow" +
            " where dr = 0  "+
            "</script>"})
    public Page<FarrowingSetDto> pageQuery(FarrowingSetDto farrowingSetDto);


    @Delete({"<script>" +
            " delete " +
            " from bc_female_farrow" +
            " where id = #{id}  " +
            "</script>"})
    public int deleteByFarrowingId(@Param("id") long id);


    @Select({"<script>" +
            " select *" +
            " from bc_female_farrow" +
            " where dr = 0  " +
            " and id = #{id} " +
            "</script>"})
    public FarrowingSetDto queryDetailById(long id);

}