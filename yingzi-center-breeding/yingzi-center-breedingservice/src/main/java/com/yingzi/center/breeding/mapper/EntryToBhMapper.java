package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.EntryToBhRequestDto;
import com.yingzi.center.breeding.eo.EntryToBhEo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author hpx
 * @Date 2018/4/24
 */
public interface EntryToBhMapper extends BaseMapper<EntryToBhEo> {
    /**
     * 根据id删除
     * @param entryToBhId
     * @return
     */
    @Delete("update bc_herd_entry set dr = 1 where id = #{entryToBhId}")
    void deleteByEntryToBhId(@Param("entryToBhId") long entryToBhId);

    /**
     * 修改记录
     * @param entryToBhEo
     * @return
     */
    @Update({"<script>" +
            "update bc_herd_entry set entrydate = #{entryDate},herd_id = #{herdId}, " +
            "weight = #{weight},deslocation = #{desLocation},fcomment = #{fcomment} " +
            "where id = #{id}" +
            "</script>"})
    void updateEntryToBhById(EntryToBhEo entryToBhEo);

    /**
     * 分页查询
     * @param request
     * @return
     */
    @Select({"<script>" +
            "select * from bc_herd_entry " +
            "where dr = 0" +
//            "<if test=\"\">" +
//            "=#{}" +
//            "</if>" +
            "</script>"})
    List<EntryToBhEo> pageQuery(EntryToBhRequestDto request);

    /**
     * 根据id查询
     * @param entryToBhId
     * @return
     */
    @Select({"<script>" +
            "select id,tenant_id,dr,create_person,create_time,update_person,update_time," +
            "master_org_id,entrydate,herd_id,event_id,weight,deslocation,fcomment " +
            "from bc_herd_entry where dr = 0 and id = #{entryToBhId}" +
            "</script>"})
    EntryToBhEo queryById(@Param("entryToBhId") Long entryToBhId);
}
