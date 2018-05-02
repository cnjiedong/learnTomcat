package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.PWDeathsDto;
import com.yingzi.center.breeding.dto.PWDeathsRequestDto;

/**
 * 断奶前死亡
 * Created by user38 on 2018/4/25.
 */
public interface IPWDeathsQueryApi {

    ResponseDto<PageInfo<PWDeathsDto>> queryPageUser(PWDeathsRequestDto pWDeathsRequestDto);

    ResponseDto<PWDeathsDto> queryDetailById(Long pWDeathsId);
}
