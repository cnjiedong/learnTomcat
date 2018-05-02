package com.yingzi.center.breeding.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.TransferLocDto;
import com.yingzi.center.breeding.dto.TransferLocRequestDto;
import com.yingzi.center.breeding.eo.TransferLocEo;
import com.yingzi.center.breeding.mapper.TransferLocMapper;
import com.yingzi.center.breeding.service.ITransferLocService;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @Description: 位置变动
 * @author: codeMonkey_sun
 * 
 */
@Service("transferLocService")
public class TransferLocServiceImpl implements ITransferLocService {
    
	@Resource
	private TransferLocMapper transferLocMapper;
	
	public long addTransferLoc(TransferLocEo transferLocEo) {
		long ret = transferLocMapper.insert(transferLocEo);
		return ret;
    }
    
    public void updateTransferLoc(TransferLocEo transferLocEo) {
        transferLocMapper.updateSelective(transferLocEo);
    }

    public void deleteTransferLoc(Long transferLocId) {
        transferLocMapper.deleteLogicById(TransferLocEo.class, transferLocId, true);
    }
    
    public PageInfo<TransferLocDto> queryPageUser(TransferLocRequestDto transferLocRequestDto) {
		int pageNum = transferLocRequestDto.getPageNum();
	    int pageSize = transferLocRequestDto.getPageSize();
	    pageNum = pageNum<=0 ? 1 : pageNum;
	    pageSize = pageSize<=0 ? 20 : pageSize;
	    PageHelper.startPage(pageNum, pageSize);
	    Page<TransferLocDto> page = transferLocMapper.pageQuery(transferLocRequestDto);
	    PageInfo<TransferLocDto> pageInfo = new PageInfo<TransferLocDto>(page);
	    return pageInfo;
	}
	
	public TransferLocDto queryDetailById(Long transferLocId) {
		TransferLocEo transferLocEo = transferLocMapper.findById(TransferLocEo.class, transferLocId);
		TransferLocDto transferLocDto = new TransferLocDto();
        BeanUtils.copyProperties(transferLocEo, transferLocDto);
        transferLocDto.setId(String.valueOf(transferLocId));
        return transferLocDto;
    }
}
