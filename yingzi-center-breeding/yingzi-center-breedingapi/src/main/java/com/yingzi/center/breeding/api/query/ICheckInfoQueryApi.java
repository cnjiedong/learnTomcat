package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;

public interface ICheckInfoQueryApi {

    //分页查询孕检列表
    ResponseDto<PageInfo<CheckInfoDto>> queryPageUser(CheckInfoRequestDto checkInfoRequestDto);

    //根据ID查询孕检详情
    ResponseDto<CheckInfoDto>  queryDetailById(Long checkInfoId);
}
