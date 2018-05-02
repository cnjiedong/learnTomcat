package com.yingzi.center.breeding.api.query;

import com.github.pagehelper.PageInfo;

import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.dto.PageInfoDto;


/**
 * Created by user09 on 2018/4/19.
 */
public interface IQueryHnsInfoApi {

    //分页查询发情未配种信息
    public PageInfo<HsnInfoDto> pageQuery(PageInfoDto<HsnInfoDto> request);

    //根据ID查询发情未配种信息
    public HsnInfoDto queryDetailById(Long hsnInfoId);


}
