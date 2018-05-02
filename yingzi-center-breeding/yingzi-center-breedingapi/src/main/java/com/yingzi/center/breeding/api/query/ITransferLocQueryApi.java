package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.TransferLocDto;
import com.yingzi.center.breeding.dto.TransferLocRequestDto;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
public interface ITransferLocQueryApi {

    public ResponseDto<PageInfo<TransferLocDto>> queryPageUser(TransferLocRequestDto transferLocRequestDto);
    public ResponseDto<TransferLocDto> queryDetailById(Long transferLocId);
}
