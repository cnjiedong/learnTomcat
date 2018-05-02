package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.MatingRuleDto;
import com.yingzi.center.breeding.dto.MatingRuleRequestDto;

/**
 * Created by user08 on 2018/4/20.
 */
public interface IMatingRuleQueryApi {
    //分页数据验证参数列表
    ResponseDto<PageInfo<MatingRuleDto>> queryPageUser(MatingRuleRequestDto request);
    //根据ID查询数据验证参数详情
    ResponseDto<MatingRuleDto>	queryDetailById(Long mrId);


}
