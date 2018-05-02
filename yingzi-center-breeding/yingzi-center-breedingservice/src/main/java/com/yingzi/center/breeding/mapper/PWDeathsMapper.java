package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.PWDeathsDto;
import com.yingzi.center.breeding.dto.PWDeathsRequestDto;
import com.yingzi.center.breeding.eo.PWDeathsEo;
import org.apache.ibatis.annotations.Select;

/**
 * Created by user38 on 2018/4/25.
 */
public interface PWDeathsMapper extends BaseMapper<PWDeathsEo> {

    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id,farm_id,deathdate,herd_id,event_id,deaths,deathreason,fcomment" +
            " from bc_female_preweandeath" +
            " where dr = 0  " +
            "</script>"})
    public Page<PWDeathsDto> queryPageUser(PWDeathsRequestDto pwDeathsRequestDto);
}
