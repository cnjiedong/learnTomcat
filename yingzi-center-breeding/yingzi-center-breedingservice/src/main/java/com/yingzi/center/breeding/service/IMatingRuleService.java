package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.dto.MatingRuleDto;
import com.yingzi.center.breeding.dto.MatingRuleRequestDto;
import com.yingzi.center.breeding.eo.MatingRuleEo;

import java.util.List;

/**
 * Created by user08 on 2018/4/20.
 */
public interface IMatingRuleService {
    public ResponseDto<Long> addMatingRule(MatingRuleEo matingRuleEo) ;

    public ResponseDto<Void> updateMatingRule(MatingRuleEo matingRuleEo);

    public ResponseDto<Void> deleteMatingRule(Long mrId);

    //分页数据验证参数列表
    List<MatingRuleDto> queryPageUser(MatingRuleRequestDto matingRuleRequestDto);
    //根据ID查询数据验证参数详情
    ResponseDto<MatingRuleDto>	queryDetailById(Long mrId);

}
