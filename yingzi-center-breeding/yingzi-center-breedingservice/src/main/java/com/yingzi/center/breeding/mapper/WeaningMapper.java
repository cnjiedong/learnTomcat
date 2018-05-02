package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.WeaningRequestDto;
import com.yingzi.center.breeding.eo.WeaningEo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface WeaningMapper extends BaseMapper<WeaningEo> {

    /**
     * 根据id删除
     * @param weaningId
     * @return
     */
    @Delete("update bc_female_wean set dr = 1 where id = #{weaningId}")
    void deleteByWeaningId(@Param("weaningId") long weaningId);

    /**
     * 修改记录
     * @param weaningEo
     * @return
     */
    @Update({"<script>" +
            "update bc_female_wean set weandate = #{weanDate},herd_id = #{herdId},weans = #{weans}," +
            "totalweight = #{totalWeight},group_id = #{groupId},femalelocation = #{femaleLocation},fcomment = #{fcomment} " +
            "where id = #{id}" +
            "</script>"})
    void updateWianingById(WeaningEo weaningEo);

    /**
     * 分页查询
     * @param request
     * @return
     */
    @Select({"<script>" +
            "select * from bc_female_wean " +
            "where dr = 0" +
//            "<if test=\"\">" +
//            "=#{}" +
//            "</if>" +
            "</script>"})
    List<WeaningEo> pageQuery(WeaningRequestDto request);

    /**
     * 根据id查询
     * @param weaningId
     * @return
     */
    @Select({"<script>" +
            "select id,tenant_id,dr,create_person,create_time,update_person,update_time," +
            "master_org_id,weandate,herd_id,event_id,weans,totalweight,group_id,femalelocation,fcomment " +
            "from bc_female_wean where dr = 0 and id = #{weaningId}" +
            "</script>"})
    WeaningEo queryById(@Param("weaningId") Long weaningId);
}
