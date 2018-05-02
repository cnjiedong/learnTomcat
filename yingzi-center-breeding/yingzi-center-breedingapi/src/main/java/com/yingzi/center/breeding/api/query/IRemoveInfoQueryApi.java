package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.RemoveInfoDto;
import com.yingzi.center.breeding.dto.RemoveInfoRequestDto;

/**
 *离场接口IRemoveInfoQueryApi
 * @author user18
 * @date 2018/4/20
 */
public interface IRemoveInfoQueryApi {

    /**
     * 分页查询离场列表
     * @param removeInfoRequestDto
     * @return
     */
    ResponseDto<PageInfo<RemoveInfoDto>> queryPageUser(RemoveInfoRequestDto removeInfoRequestDto);

    /**
     * 根据ID查询离场详情
     * @param removeInfoId
     * @return
     */
    ResponseDto<RemoveInfoDto> queryDetailById(Long removeInfoId);
}
