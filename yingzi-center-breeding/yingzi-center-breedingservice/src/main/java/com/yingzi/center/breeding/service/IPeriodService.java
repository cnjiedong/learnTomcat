package com.yingzi.center.breeding.service;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.PeriodDto;
import com.yingzi.center.breeding.dto.PeriodRequestDto;
import com.yingzi.center.breeding.eo.PeriodEo;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
public interface IPeriodService {

	public long addPeriod(PeriodEo periodEo);
	public void updatePeriod(PeriodEo periodEo);
	public void deletePeriod(Long periodId);
	public PageInfo<PeriodDto> queryPageUser(PeriodRequestDto periodRequestDto);
	public PeriodDto queryDetailById(Long periodId);
	public PageInfo<PeriodDto> queryByPeriodYear(PeriodRequestDto periodRequestDto);
}
