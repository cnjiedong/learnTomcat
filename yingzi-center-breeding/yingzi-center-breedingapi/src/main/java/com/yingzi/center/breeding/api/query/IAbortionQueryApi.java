package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.AbortionDto;
import com.yingzi.center.breeding.dto.AbortionRequestDto;

/**
 * Created by user26 on 2018/4/24.
 */
public interface IAbortionQueryApi {
    /**
     * 分页查询
     * @param request
     * @return
     */
    ResponseDto<PageInfo<AbortionDto>> queryPageUser(AbortionRequestDto request);

    /**
     * 根据id查询
     * @param abortionId
     * @return
     */
    ResponseDto<AbortionDto> queryDetailById(Long abortionId);
}
