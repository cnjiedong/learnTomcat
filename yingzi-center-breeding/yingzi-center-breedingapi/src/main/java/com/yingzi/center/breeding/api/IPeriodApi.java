package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.PeriodEo;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
public interface IPeriodApi {
	
	public ResponseDto<Long> addPeriod(PeriodEo periodEo);
    public ResponseDto<Void> updatePeriod(PeriodEo periodEo);
    public ResponseDto<Void> deletePeriod(Long  eriodId);
}
