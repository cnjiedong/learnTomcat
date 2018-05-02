package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IAbortionQueryApi;
import com.yingzi.center.breeding.dto.AbortionDto;
import com.yingzi.center.breeding.dto.AbortionRequestDto;
import com.yingzi.center.breeding.service.query.IAbortionQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user26 on 2018/4/24.
 */
@Service("abortionQueryApi")
public class AbortionQueryApiImpl implements IAbortionQueryApi {

    @Resource
    private IAbortionQueryService abortionQueryService;
    @Override
    public ResponseDto<PageInfo<AbortionDto>> queryPageUser(AbortionRequestDto request) {
        return abortionQueryService.queryPageUser(request);
    }

    @Override
    public ResponseDto<AbortionDto> queryDetailById(Long abortionId) {
        return abortionQueryService.queryDetailById(abortionId);
    }
}
