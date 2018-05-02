package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.MatingRuleEo;

/**
 * Created by user08 on 2018/4/20.
 */
public interface IMatingRuleApi {


    //新增数据验证参数信息
    ResponseDto<Long> addMatingRule(MatingRuleEo matingRuleEo);

    //更新数据验证参数信息
    ResponseDto<Void>	updateMatingRule(MatingRuleEo matingRuleEo);

    //删除数据验证参数信息
    ResponseDto<Void>	deleteMatingRule(Long mrId);

}
