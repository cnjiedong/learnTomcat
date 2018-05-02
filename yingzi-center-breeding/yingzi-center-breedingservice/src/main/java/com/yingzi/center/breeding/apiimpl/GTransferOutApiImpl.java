package com.yingzi.center.breeding.apiimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IGTransferOutApi;
import com.yingzi.center.breeding.eo.GTransferOutEo;
import com.yingzi.center.breeding.service.IGTransferOutService;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
@Service("gTransferOutApi")
public class GTransferOutApiImpl implements IGTransferOutApi {

	@Resource
	private IGTransferOutService gTransferOutService;
	
	public ResponseDto<Long> addGTransferOut(GTransferOutEo gTransferOutEo) {
        return new ResponseDto<Long>(gTransferOutService.addGTransferOut(gTransferOutEo));
    }
    
    public ResponseDto<Void> updateGTransferOut(GTransferOutEo gTransferOutEo) {
         gTransferOutService.updateGTransferOut(gTransferOutEo);
         return ResponseDto.VOID;
    }

    public ResponseDto<Void> deleteGTransferOut(Long gTransferOutId) {
        gTransferOutService.deleteGTransferOut(gTransferOutId);
        return ResponseDto.VOID;
    }
}
