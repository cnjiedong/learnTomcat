package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IPWDeathsQueryApi;
import com.yingzi.center.breeding.dto.PWDeathsDto;
import com.yingzi.center.breeding.dto.PWDeathsRequestDto;
import com.yingzi.center.breeding.service.query.IPWDeathsQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user38 on 2018/4/25.
 */
@Service("pWDeathsQueryApi")
public class PWDeathsQueryApiImpl implements IPWDeathsQueryApi {

    @Resource
    private IPWDeathsQueryService pWDeathsQueryService;

    @Override
    public ResponseDto<PageInfo<PWDeathsDto>> queryPageUser(PWDeathsRequestDto pWDeathsRequestDto) {
        return pWDeathsQueryService.queryPageUser(pWDeathsRequestDto);
    }

    @Override
    public ResponseDto<PWDeathsDto> queryDetailById(Long pWDeathsId) {
        return pWDeathsQueryService.queryDetailById(pWDeathsId);
    }
}
