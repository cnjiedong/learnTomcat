package com.yingzi.center.breeding.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.PeriodDto;
import com.yingzi.center.breeding.dto.PeriodRequestDto;
import com.yingzi.center.breeding.eo.PeriodEo;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
public interface PeriodMapper extends BaseMapper<PeriodEo> {
	
	@Select({"<script>" +
            "select * " +
            "from bc_set_period " +
            "where dr = 0" +
            "</script>"})
	public Page<PeriodDto> pageQuery(PeriodRequestDto periodRequestDto);
	
	@Select({"<script>" +
            "select * " +
            "from bc_set_period " +
            "where period_year = #{periodYear} " +
            "AND dr = 0" +
            "</script>"})
	public Page<PeriodDto> queryByPeriodYear(PeriodRequestDto periodRequestDto, @Param("periodYear") int periodYear);
}
