package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IRemoveInfoQueryApi;
import com.yingzi.center.breeding.dto.RemoveInfoDto;
import com.yingzi.center.breeding.dto.RemoveInfoRequestDto;
import com.yingzi.center.breeding.service.IRemoveInfoService;
import com.yingzi.center.breeding.service.query.IRemoveInfoQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *离场接口IRemoveInfoQueryApi实现类
 * @author user18
 * @date 2018/4/20
 */
@Service("removeInfoQueryApiimpl")
public class RemoveInfoQueryApiImpl implements IRemoveInfoQueryApi {

    @Resource
    private IRemoveInfoQueryService removeInfoQueryService;

    @Override
    public ResponseDto<PageInfo<RemoveInfoDto>> queryPageUser(RemoveInfoRequestDto removeInfoRequestDto) {
        return removeInfoQueryService.queryPageUser(removeInfoRequestDto);
    }

    @Override
    public ResponseDto<RemoveInfoDto> queryDetailById(Long removeInfoId) {
        return removeInfoQueryService.queryDetailById(removeInfoId);
    }
}
