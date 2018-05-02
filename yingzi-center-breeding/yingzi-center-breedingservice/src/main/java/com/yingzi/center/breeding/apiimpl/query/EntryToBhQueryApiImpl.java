package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IEntryToBhQueryApi;
import com.yingzi.center.breeding.dto.EntryToBhDto;
import com.yingzi.center.breeding.dto.EntryToBhRequestDto;
import com.yingzi.center.breeding.service.query.IEntryToBhQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/24
 */
@Service("entryToBhQueryApi")
public class EntryToBhQueryApiImpl implements IEntryToBhQueryApi {

    @Resource
    private IEntryToBhQueryService entryToBhQueryService;

    @Override
    public ResponseDto<PageInfo<EntryToBhDto>> queryPageUser(EntryToBhRequestDto request) {
        return entryToBhQueryService.queryPageUser(request);
    }

    @Override
    public ResponseDto<EntryToBhDto> queryDetailById(Long entryToBhId) {
        return entryToBhQueryService.queryDetailById(entryToBhId);
    }
}
