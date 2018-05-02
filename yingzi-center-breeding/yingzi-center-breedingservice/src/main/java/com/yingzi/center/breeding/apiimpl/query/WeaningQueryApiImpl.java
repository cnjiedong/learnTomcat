package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IWeaningQueryApi;
import com.yingzi.center.breeding.dto.WeaningDto;
import com.yingzi.center.breeding.dto.WeaningRequestDto;
import com.yingzi.center.breeding.service.query.IWeaningQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
@Service("weaningQueryApi")
public class WeaningQueryApiImpl implements IWeaningQueryApi {

    @Resource
    private IWeaningQueryService weaningQueryService;

    @Override
    public ResponseDto<PageInfo<WeaningDto>> queryPageUser(WeaningRequestDto request) {
        return weaningQueryService.queryPageUser(request);
    }

    @Override
    public ResponseDto<WeaningDto> queryDetailById(Long weaningId) {
        return weaningQueryService.queryDetailById(weaningId);
    }
}
