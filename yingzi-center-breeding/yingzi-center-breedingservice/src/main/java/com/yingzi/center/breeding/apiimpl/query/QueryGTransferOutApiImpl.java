package com.yingzi.center.breeding.apiimpl.query;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IGTransferOutQueryApi;
import com.yingzi.center.breeding.dto.GTransferOutDto;
import com.yingzi.center.breeding.dto.GTransferOutRequestDto;
import com.yingzi.center.breeding.dto.GroupIdDto;
import com.yingzi.center.breeding.service.IGTransferOutService;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
@Service("gTransferOutQueryApi")
public class QueryGTransferOutApiImpl implements IGTransferOutQueryApi {

	@Resource
	private IGTransferOutService gTransferOutService;
	
    public ResponseDto<PageInfo<GTransferOutDto>> queryPageUser(GTransferOutRequestDto gTransferOutRequestDto) {
    	PageInfo<GTransferOutDto> pageInfo = gTransferOutService.queryPageUser(gTransferOutRequestDto);
        return new ResponseDto<PageInfo<GTransferOutDto>>(pageInfo);
	}
    
    public ResponseDto<GTransferOutDto>  queryDetailById(Long gTransferOutId) {
    	GTransferOutDto gTransferOutDto = gTransferOutService.queryDetailById(gTransferOutId);
        return new ResponseDto<GTransferOutDto>(gTransferOutDto);
    }
    
    public ResponseDto<PageInfo<GroupIdDto>> queryGroupId(GTransferOutRequestDto gTransferOutRequestDto) {
		PageInfo<GroupIdDto> pageInfo = gTransferOutService.queryGroupId(gTransferOutRequestDto);
        return new ResponseDto<PageInfo<GroupIdDto>>(pageInfo);
    }
}
