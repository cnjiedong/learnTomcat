package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.NurseOnRequestDto;
import com.yingzi.center.breeding.eo.NurseOnEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface NurseOnMapper extends BaseMapper<NurseOnEo> {

    /**
     * 根据id删除
     * @param nurseOnId
     * @return
     */
    @Delete("update bc_female_nurseon set dr = 1 where id = #{nurseOnId}")
    void deleteByNurseOnId(@Param("nurseOnId") Long nurseOnId);

    /**
     * 修改记录
     * @param nurseOnEo
     * @return
     */
    @Update({"<script>" +
            "update bc_female_nurseon set nurseondate = #{nurseOnDate},herd_id = #{herdId},prewean = #{preWean}," +
            "age = #{age},forsteroff = #{forsterOff},fcomment = #{fcomment} " +
            "where id = #{id}" +
            "</script>"})
    void updateNurseOnById(NurseOnEo nurseOnEo);

    /**
     * 分页查询
     * @param request
     * @return
     */
    @Select({"<script>" +
            "select * from bc_female_nurseon " +
            "where dr = 0" +
//            "<if test=\"\">" +
//            "=#{}" +
//            "</if>" +
            "</script>"})
    List<NurseOnEo> pageQuery(NurseOnRequestDto request);

    /**
     * 根据id查询
     * @param nurseOnId
     * @return
     */
    @Select({"<script>" +
//            "select id,tenant_id,dr,create_person,create_time,update_person,update_time," +
//            "master_org_id,nurseondate,herd_id,event_id,prewean,age,forsteroff,fcomment" +
            "select * from bc_female_nurseon where dr = 0 and id = #{nurseOnId}" +
            "</script>"})
    NurseOnEo queryById(@Param("nurseOnId") Long nurseOnId);
}
