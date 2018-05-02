package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.PeriodDto;
import com.yingzi.center.breeding.dto.PeriodRequestDto;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
public interface IPeriodQueryApi {

    public ResponseDto<PageInfo<PeriodDto>> queryPageUser(PeriodRequestDto periodRequestDto);
    public ResponseDto<PeriodDto> queryDetailById(Long periodId);
    public ResponseDto<PageInfo<PeriodDto>> queryByPeriodYear(PeriodRequestDto periodRequestDto);
}
