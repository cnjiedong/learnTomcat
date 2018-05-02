package com.yingzi.center.breeding.service;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.TransferLocDto;
import com.yingzi.center.breeding.dto.TransferLocRequestDto;
import com.yingzi.center.breeding.eo.TransferLocEo;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
public interface ITransferLocService {
    
	public long addTransferLoc(TransferLocEo transferLocEo);
    public void updateTransferLoc(TransferLocEo transferLocEo);
    public void deleteTransferLoc(Long transferLocId);
    public PageInfo<TransferLocDto> queryPageUser(TransferLocRequestDto transferLocRequestDto);
	public TransferLocDto queryDetailById(Long transferLocId);
}
