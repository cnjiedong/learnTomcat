package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.GTransferOutDto;
import com.yingzi.center.breeding.dto.GTransferOutRequestDto;
import com.yingzi.center.breeding.dto.GroupIdDto;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
public interface IGTransferOutQueryApi {

	public ResponseDto<PageInfo<GTransferOutDto>> queryPageUser(GTransferOutRequestDto gTransferOutRequestDto);
    public ResponseDto<GTransferOutDto> queryDetailById(Long gTransferOutLocId);
    public ResponseDto<PageInfo<GroupIdDto>> queryGroupId(GTransferOutRequestDto gTransferOutRequestDto);
}
