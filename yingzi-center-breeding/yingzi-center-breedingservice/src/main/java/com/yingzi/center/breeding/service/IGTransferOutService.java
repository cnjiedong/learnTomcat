package com.yingzi.center.breeding.service;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.GTransferOutDto;
import com.yingzi.center.breeding.dto.GTransferOutRequestDto;
import com.yingzi.center.breeding.dto.GroupIdDto;
import com.yingzi.center.breeding.eo.GTransferOutEo;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
public interface IGTransferOutService {

	public long addGTransferOut(GTransferOutEo gTransferOutEo);
    public void updateGTransferOut(GTransferOutEo gTransferOutEo);
    public void deleteGTransferOut(Long gTransferOutId);
    public PageInfo<GTransferOutDto> queryPageUser(GTransferOutRequestDto gTransferOutRequestDto);
	public GTransferOutDto queryDetailById(Long gTransferOutId);
	public PageInfo<GroupIdDto> queryGroupId(GTransferOutRequestDto gTransferOutRequestDto);
}
