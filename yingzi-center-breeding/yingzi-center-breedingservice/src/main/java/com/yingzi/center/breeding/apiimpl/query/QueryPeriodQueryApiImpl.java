package com.yingzi.center.breeding.apiimpl.query;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IPeriodQueryApi;
import com.yingzi.center.breeding.dto.PeriodDto;
import com.yingzi.center.breeding.dto.PeriodRequestDto;
import com.yingzi.center.breeding.service.IPeriodService;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
@Service("periodQueryApi")
public class QueryPeriodQueryApiImpl implements IPeriodQueryApi {
	
	@Resource
	private IPeriodService periodService;
	 
	public ResponseDto<PageInfo<PeriodDto>> queryPageUser(PeriodRequestDto periodRequestDto) {
        PageInfo<PeriodDto> pageInfo = periodService.queryPageUser(periodRequestDto);
        return new ResponseDto<PageInfo<PeriodDto>>(pageInfo);
    }
	
	public ResponseDto<PeriodDto> queryDetailById(Long periodId) {
		PeriodDto periodDto = periodService.queryDetailById(periodId);
        return new ResponseDto<PeriodDto>(periodDto);
    }
	
	public ResponseDto<PageInfo<PeriodDto>> queryByPeriodYear(PeriodRequestDto periodRequestDto) {
		PageInfo<PeriodDto> pageInfo = periodService.queryByPeriodYear(periodRequestDto);
        return new ResponseDto<PageInfo<PeriodDto>>(pageInfo);
    }
}
