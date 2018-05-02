package com.yingzi.center.breeding.apiimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IPeriodApi;
import com.yingzi.center.breeding.eo.PeriodEo;
import com.yingzi.center.breeding.service.IPeriodService;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
@Service("periodApi")
public class PeriodApiImpl implements IPeriodApi {
	
	@Resource
	private IPeriodService periodService;
	
	public ResponseDto<Long> addPeriod(PeriodEo periodEo) {
        return new ResponseDto<Long>(periodService.addPeriod(periodEo));
    }
    
	public ResponseDto<Void> updatePeriod(PeriodEo periodEo) {
		periodService.updatePeriod(periodEo);
        return ResponseDto.VOID;
    }

	public ResponseDto<Void> deletePeriod(Long  periodId) {
		periodService.deletePeriod(periodId);
        return ResponseDto.VOID;
    }
}
