package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.SemencollDto;
import com.yingzi.center.breeding.dto.SemencollRequestDto;

/**
 * @author hcp
 * Created by user22 on 2018/4/21.
 */
public interface ISemencollQueryApi {
    //分页查询采精列表
    ResponseDto<PageInfo<SemencollDto>> queryPageUser(SemencollRequestDto semencollRequestDto);

    //根据ID查询采精详情
    ResponseDto<SemencollDto>	queryDetailById(Long semencollId);


}
