package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.ICheckInfoQueryApi;
import com.yingzi.center.breeding.api.query.IQuerySetEventApi;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;
import com.yingzi.center.breeding.dto.SetEventDto;
import com.yingzi.center.breeding.service.query.ICheckInfoQueryService;
import com.yingzi.center.breeding.service.query.ISetEventQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("checkInfoQueryApi")
public class CheckInfoQueryApiImp implements ICheckInfoQueryApi {

    /**品种Mapper类*/
    @Resource
    private ICheckInfoQueryService checkInfoQueryService;


    //分页查询孕检列表
    @Override
    public ResponseDto<PageInfo<CheckInfoDto>> queryPageUser(CheckInfoRequestDto checkInfoRequestDto){
        PageInfo<CheckInfoDto> pageInfo = checkInfoQueryService.queryPageUser(checkInfoRequestDto);
        return new ResponseDto<PageInfo<CheckInfoDto>>(pageInfo);
    }

    //根据ID查询孕检详情
    @Override
    public ResponseDto<CheckInfoDto>  queryDetailById(Long checkInfoId){
        CheckInfoDto checkInfoDto = checkInfoQueryService.queryDetailById(checkInfoId);
        return new ResponseDto<CheckInfoDto>(checkInfoDto);
    }

}
