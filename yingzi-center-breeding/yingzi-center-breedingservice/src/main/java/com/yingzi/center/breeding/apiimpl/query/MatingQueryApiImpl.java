package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IMatingQueryApi;
import com.yingzi.center.breeding.dto.MatingDto;
import com.yingzi.center.breeding.dto.MatingRequestDto;
import com.yingzi.center.breeding.service.query.IMatingQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/25
 */
@Service("matingQueryApi")
public class MatingQueryApiImpl implements IMatingQueryApi{

    @Resource
    private IMatingQueryService matingQueryService;

    @Override
    public ResponseDto<PageInfo<MatingDto>> queryPageUser(MatingRequestDto request) {
        return matingQueryService.queryPageUser(request);
    }

    @Override
    public ResponseDto<MatingDto> queryDetailById(Long matingId) {
        return matingQueryService.queryDetailById(matingId);
    }
}
