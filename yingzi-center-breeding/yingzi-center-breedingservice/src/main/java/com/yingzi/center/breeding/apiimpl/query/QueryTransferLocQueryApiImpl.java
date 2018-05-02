package com.yingzi.center.breeding.apiimpl.query;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.ITransferLocQueryApi;
import com.yingzi.center.breeding.dto.TransferLocDto;
import com.yingzi.center.breeding.dto.TransferLocRequestDto;
import com.yingzi.center.breeding.service.ITransferLocService;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
@Service("transferLocQueryApi")
public class QueryTransferLocQueryApiImpl implements ITransferLocQueryApi {

	@Resource
	private ITransferLocService transferLocService;
	
    public ResponseDto<PageInfo<TransferLocDto>> queryPageUser(TransferLocRequestDto transferLocRequestDto) {
    	PageInfo<TransferLocDto> pageInfo = transferLocService.queryPageUser(transferLocRequestDto);
        return new ResponseDto<PageInfo<TransferLocDto>>(pageInfo);
	}
    
    public ResponseDto<TransferLocDto>  queryDetailById(Long transferLocId) {
    	TransferLocDto transferLocDto = transferLocService.queryDetailById(transferLocId);
        return new ResponseDto<TransferLocDto>(transferLocDto);
    }
}
