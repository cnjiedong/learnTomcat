package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.AbortionRequestDto;
import com.yingzi.center.breeding.eo.AbortionEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by user26 on 2018/4/24.
 */
public interface AbortionMapper extends BaseMapper<AbortionEo>{
    /**
     * 根据id删除
     * @param abortionId
     * @return
     */
    @Delete("update bc_female_abortion set dr = 1 where id = #{abortionId}")
    void deleteByAbortionId(@Param("abortionId") long abortionId);

    /**
     * 修改记录
     * @param abortionEo
     * @return
     */
    @Update({"<script>" +
            "update bc_female_abortion set abortiondate = #{abortionDate},herd_id = #{herdId}," +
            "deslocation = #{desLocation},fcomment = #{fcomment} " +
            "where id = #{id}" +
            "</script>"})
    void updateAbortionById(AbortionEo abortionEo);

    /**
     * 分页查询
     * @param request
     * @return
     */
    @Select({"<script>" +
            "select * from bc_female_abortion " +
            "where dr = 0" +
//            "<if test=\"\">" +
//            "=#{}" +
//            "</if>" +
            "</script>"})
    List<AbortionEo> pageQuery(AbortionRequestDto request);

    /**
     * 根据id查询
     * @param abortionId
     * @return
     */
    @Select({"<script>" +
            "select id,tenant_id,dr,create_person,create_time,update_person,update_time," +
            "master_org_id,abortiondate,herd_id,event_id,deslocation,fcomment " +
            "from bc_female_abortion where dr = 0 and id = #{abortionId}" +
            "</script>"})
    AbortionEo queryById(@Param("abortionId") Long abortionId);
}
