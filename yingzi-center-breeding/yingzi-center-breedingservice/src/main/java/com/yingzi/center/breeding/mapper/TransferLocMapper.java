package com.yingzi.center.breeding.mapper;

import org.apache.ibatis.annotations.Select;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.TransferLocDto;
import com.yingzi.center.breeding.dto.TransferLocRequestDto;
import com.yingzi.center.breeding.eo.TransferLocEo;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
public interface TransferLocMapper extends BaseMapper<TransferLocEo> {

	@Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id,transferdate,herd_id,event_id,deslocation,fcomment" +
            " from bc_female_transferloc" +
            " where dr = 0" +
            "</script>"})
	public Page<TransferLocDto> pageQuery(TransferLocRequestDto transferLocRequestDto);
}
