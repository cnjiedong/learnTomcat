package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.MatingRuleDto;
import com.yingzi.center.breeding.dto.MatingRuleRequestDto;
import com.yingzi.center.breeding.eo.MatingRuleEo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by user08 on 2018/4/20.
 */
public interface MatingRuleMapper extends BaseMapper<MatingRuleEo>{


    @Select({"<script>" +
            " select t1.id,t1.tenant_id,t1.dr,t1.create_person,t1.create_time,t1.update_person,t1.update_time,t1.fenable,t1.mother_id,t1.father_id,t1.offs_id, t2.fname fatherName,t3.fname motherName,t4.fname offsName " +
            " from bc_set_matingrule t1,bc_set_breeding t2,bc_set_breeding t3 ,bc_set_breeding t4 " +
            " WHERE t1.dr = 0 AND t1.father_id = t2.fcode AND t1.mother_id = t3.fcode AND t1.offs_id = t4.fcode" +
            "</script>"})
    public List<MatingRuleDto> queryPageUser(MatingRuleRequestDto request);

    @Select({"<script>" +
            " select t1.id,t1.tenant_id,t1.dr,t1.create_person,t1.create_time,t1.update_person,t1.update_time,t1.fenable,t1.mother_id,t1.father_id,t1.offs_id, t2.fname fatherName,t3.fname motherName,t4.fname offsName " +
            " from bc_set_matingrule t1,bc_set_breeding t2,bc_set_breeding t3 ,bc_set_breeding t4 " +
            " WHERE t1.dr = 0 AND t1.father_id = t2.fcode AND t1.mother_id = t3.fcode AND t1.offs_id = t4.fcode " +
            " and t1.id = #{id} " +
            "</script>"})
    public MatingRuleDto queryDetailById(long id);


    @Update({"<script>" +
            " update " +
            "  bc_set_matingrule" +
            " set dr = 1" +
            " where id = #{id}  " +
            "</script>"})
    public int deleteByMatingRuleId(@Param("id") long id);

    /*@Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,mother_id,father_id,fenable,offs_id" +
            " from bc_set_matingrule" +
            " where dr = 0  " +
//            " <if test=\"mother_id != null and mother_id != 0 \"> " +
//            " and mother_id = #{motherId}" +
//            " </if>" +
//            " <if test=\"father_id != null and father_id != 0 \"> " +
//            " and father_id = #{fatherId}" +
//            " </if>" +
//            " <if test=\"offs_id != null and offs_id != 0 \"> " +
//            " and offs_id = #{offsId}" +
//            " </if>" +
//            " <if test=\"fenable ==0 or fenable ==1 \"> " +
//            " and fenable = #{fenable}" +
//            " </if>" +
            "</script>"})
    public List<MatingRuleEo> queryPageUser(MatingRuleRequestDto request);

    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,mother_id,father_id,fenable,offs_id" +
            " from bc_set_matingrule" +
            " where dr = 0  " +
            " and id = #{id} " +
            "</script>"})
    public MatingRuleDto queryDetailById(long id);*/

//
//
//    @Update({"<script>" +
//            " update " +
//            " bc_set_matingrule" +
//            " set dr = 1" +
//            " where id = #{id}  " +
//            "</script>"})
//    public void updateByMatingRuleId(@Param("id") long id);
}
