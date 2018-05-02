package com.yingzi.center.breeding.service.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.RemoveInfoDto;
import com.yingzi.center.breeding.dto.RemoveInfoRequestDto;

/**
 *
 * @author user18
 * @date 2018/4/24
 */
public interface IRemoveInfoQueryService {

    /**
     * 分页查询离场记录
     * @param removeInfoRequestDto
     * @return
     */
    public ResponseDto<PageInfo<RemoveInfoDto>> queryPageUser(RemoveInfoRequestDto removeInfoRequestDto);

    /**
     * 根据ID查询离场记录
     * @param removeInfoId
     * @return
     */
    public ResponseDto<RemoveInfoDto> queryDetailById(Long removeInfoId);
}
