package com.yingzi.center.breeding.mapper;

import org.apache.ibatis.annotations.Select;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.GTransferOutDto;
import com.yingzi.center.breeding.dto.GTransferOutRequestDto;
import com.yingzi.center.breeding.dto.GroupIdDto;
import com.yingzi.center.breeding.eo.GTransferOutEo;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
public interface GTransferOutMapper extends BaseMapper<GTransferOutEo> {

	@Select({"<script>" +
            " select * " +
            "from bc_group_remove" +
            " where dr = 0" +
            "</script>"})
	public Page<GTransferOutDto> pageQuery(GTransferOutRequestDto gTransferOutRequestDto);
	
	@Select({"<script>" +
            "select group_id " +
            "from bc_group_create " +
            "where dr = 0" +
            "</script>"})
	public Page<GroupIdDto> queryGroupId(GTransferOutRequestDto gTransferOutRequestDto);
}
