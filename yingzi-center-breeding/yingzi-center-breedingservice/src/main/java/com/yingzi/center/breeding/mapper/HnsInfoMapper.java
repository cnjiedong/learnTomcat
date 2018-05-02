package com.yingzi.center.breeding.mapper;

import com.dtyunxi.dto.ResponseDto;
import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.eo.HnsInfoEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * * @ClassName: HnsInfoMapper
 * @Description: (发情未配种表Mapper)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd.
 */
public interface HnsInfoMapper extends BaseMapper<HnsInfoEo> {
    //分页查询发情未配种信息
    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,heatdate,herd_id,event_id,heatresult,technician,fcomment" +
            " from bc_female_hns" +
            " where dr = 0  " +
            "</script>"})

    public Page<HsnInfoDto> pageQuery(HsnInfoDto hsnInfoDto);


    //删除发情未配种信息

    @Update({"<script>" +
            " update " +
            " bc_female_hns" +
            " set dr = 1" +
            " where id = #{id}  " +
            "</script>"})
    public int deleteByHnsInfoId(@Param("id") Long hnsInfoId);



    //根据id查询发情未配种信息

    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,heatdate,herd_id,event_id,heatresult,technician,fcomment" +
            " from bc_female_hns" +
            " where dr = 0  " +
            " and id = #{id}" +
            "</script>"})
    HnsInfoEo queryDetailById(@Param("id") Long hnsInfoId);

}
