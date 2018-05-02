package com.yingzi.center.breeding.apiimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.ITransferLocApi;
import com.yingzi.center.breeding.eo.TransferLocEo;
import com.yingzi.center.breeding.service.ITransferLocService;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
@Service("transferLocApi")
public class TransferLocApiImpl implements ITransferLocApi {

	@Resource
	private ITransferLocService transferLocService;
	
	public ResponseDto<Long> addTransferLoc(TransferLocEo transferLocEo) {
        return new ResponseDto<Long>(transferLocService.addTransferLoc(transferLocEo));
    }
    
    public ResponseDto<Void> updateTransferLoc(TransferLocEo transferLocEo) {
         transferLocService.updateTransferLoc(transferLocEo);
         return ResponseDto.VOID;
    }

    public ResponseDto<Void> deleteTransferLoc(Long transferLocId) {
        transferLocService.deleteTransferLoc(transferLocId);
        return ResponseDto.VOID;
    }
}
