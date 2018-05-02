package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.RemoveInfoDto;
import com.yingzi.center.breeding.dto.RemoveInfoRequestDto;
import com.yingzi.center.breeding.eo.RemoveInfoEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *离场Mapper接口
 * @author user18
 * @date 2018/4/20
 */
public interface RemoveInfoMapper extends BaseMapper<RemoveInfoEo> {

    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id,removedate,herd_id,event_id,removetype,removereason,buyer,weight,fcomment" +
            " from bc_female_remove" +
            " where dr = 0  " +
            "</script>"})
    public Page<RemoveInfoDto> queryPageUser(RemoveInfoDto removeInfoDto);
}
