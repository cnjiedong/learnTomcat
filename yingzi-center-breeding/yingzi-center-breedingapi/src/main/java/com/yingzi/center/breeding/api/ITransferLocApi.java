package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.TransferLocEo;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
public interface ITransferLocApi {

	public ResponseDto<Long> addTransferLoc(TransferLocEo transferLocEo);
    public ResponseDto<Void> updateTransferLoc(TransferLocEo transferLocEo);
    public ResponseDto<Void> deleteTransferLoc(Long transferLocId);
}
