package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.CenterHerdDto;
import com.yingzi.center.breeding.dto.CenterHerdRequestDto;
import com.yingzi.center.breeding.eo.CenterHerdEo;

public interface ICenterHerdQueryApi {

    //分页查询种猪档案列表
    ResponseDto<PageInfo<CenterHerdEo>> queryPageUser(CenterHerdRequestDto centerHerdRequestDto);

    int addHerd(CenterHerdDto centerHerdDto);

}
