/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;
import com.yingzi.center.breeding.dto.SetEventDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.CheckInfoEo;
import com.yingzi.center.breeding.mapper.CheckInfoMapper;
import com.yingzi.center.breeding.mapper.SetEventMapper;
import com.yingzi.center.breeding.service.query.ICheckInfoQueryService;
import com.yingzi.center.breeding.service.query.ISetEventQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("checkInfoQueryService")
public class CheckInfoQueryServiceImpl implements ICheckInfoQueryService {

    /**品种Mapper类*/
    @Resource
    private CheckInfoMapper checkInfoMapper;


    //分页查询孕检列表
    // @Override
   public  PageInfo<CheckInfoDto> queryPageUser(CheckInfoRequestDto checkInfoRequestDto){
       int pageNum = checkInfoRequestDto.getPageNum();
       int pageSize = checkInfoRequestDto.getPageSize();
       pageNum = pageNum<=0 ? 1 : pageNum;
       pageSize = pageSize<=0 ? 20 : pageSize;

       PageHelper.startPage(pageNum, pageSize);
       Page<CheckInfoDto> page = checkInfoMapper.pageQuery(checkInfoRequestDto);
       PageInfo<CheckInfoDto> pageInfo = new PageInfo<CheckInfoDto>(page);
       return pageInfo;
    }

    //根据ID查询孕检详情
    @Override
    public CheckInfoDto  queryDetailById(Long checkInfoId){
        CheckInfoEo checkInfoEo = checkInfoMapper.findById(CheckInfoEo.class, checkInfoId);
        if(checkInfoEo == null){
            return null;
        }
        CheckInfoDto checkInfoDto = new CheckInfoDto();
        BeanUtils.copyProperties(checkInfoEo, checkInfoDto);
        checkInfoDto.setId(String.valueOf(checkInfoEo.getId()));
        return checkInfoDto;
    }
}
