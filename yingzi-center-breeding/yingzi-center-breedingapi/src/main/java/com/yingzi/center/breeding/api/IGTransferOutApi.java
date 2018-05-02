package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.GTransferOutEo;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
public interface IGTransferOutApi {

	public ResponseDto<Long> addGTransferOut(GTransferOutEo gTransferOutEo);
    public ResponseDto<Void> updateGTransferOut(GTransferOutEo gTransferOutEo);
    public ResponseDto<Void> deleteGTransferOut(Long gTransferOutId);
}
