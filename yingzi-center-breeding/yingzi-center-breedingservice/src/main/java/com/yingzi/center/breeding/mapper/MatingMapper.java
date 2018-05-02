package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.MatingRequestDto;
import com.yingzi.center.breeding.eo.MatingEo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author hpx
 * @Date 2018/4/25
 */
public interface MatingMapper extends BaseMapper<MatingEo> {
    /**
     * 根据id删除
     * @param matingId
     * @return
     */
    @Delete("update bc_female_mating set dr = 1 where id = #{matingId}")
    void deleteByMatingId(@Param("matingId") long matingId);

    /**
     * 修改记录
     * @param matingEo
     * @return
     */
    @Update({"<script>" +
            "update bc_female_mating set servdate = #{servDate},herd_id = #{herdId},semen = #{semen}," +
            "technician = #{technician},dosage = #{dosage},fhour = #{fhour},offspringbreeding = #{offspringBreeding},fcomment = #{fcomment} " +
            "where id = #{id}" +
            "</script>"})
    void updateMatingById(MatingEo matingEo);

    /**
     * 分页查询
     * @param request
     * @return
     */
    @Select({"<script>" +
            "select * from bc_female_mating " +
            "where dr = 0" +
//            "<if test=\"\">" +
//            "=#{}" +
//            "</if>" +
            "</script>"})
    List<MatingEo> pageQuery(MatingRequestDto request);

    /**
     * 根据id查询
     * @param matingId
     * @return
     */
    @Select({"<script>" +
            "select id,tenant_id,dr,create_person,create_time,update_person,update_time," +
            "master_org_id,servdate,herd_id,event_id,semen,technician,dosage,fhour,offspringbreeding,fcomment " +
            "from bc_female_mating where dr = 0 and id = #{matingId}" +
            "</script>"})
    MatingEo queryById(@Param("matingId") Long matingId);
}
