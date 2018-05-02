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
import com.yingzi.center.breeding.api.query.ISemencollQueryApi;
import com.yingzi.center.breeding.dto.SemencollDto;
import com.yingzi.center.breeding.dto.SemencollRequestDto;
import com.yingzi.center.breeding.eo.SemencollEo;
import com.yingzi.center.breeding.mapper.SemenCollectionMapper;
import com.yingzi.center.breeding.service.IDemoService;
import com.yingzi.center.breeding.service.query.ISemencollQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("semencollQueryService")
public class SemencollQueryServiceImpl implements ISemencollQueryService {
    @Resource
    SemenCollectionMapper semenCollectionMapper;

    @Override
    public PageInfo<SemencollDto> queryPageUser(SemencollRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<SemencollEo> list = (Page<SemencollEo>)semenCollectionMapper.queryPageUser(request.getParam());

        Page<SemencollDto> newList = new Page<SemencollDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (SemencollEo eo : list) {
            SemencollDto dto = new SemencollDto();

            BeanUtils.copyProperties(eo,dto);
            dto.setId(String.valueOf(eo.getId()));
            dto.setHerdId(String.valueOf(eo.getHerdId()));
            dto.setMaleId(String.valueOf(eo.getMaleId()));
            dto.setSemenId(String.valueOf(eo.getSemenId()));
            dto.setFarmId(String.valueOf(eo.getFarmId()));
            dto.setMasterOrgId(String.valueOf(eo.getMasterOrgId()));

            newList.add(dto);
        }
        PageInfo<SemencollDto> pageInfo = new PageInfo<SemencollDto>(newList);

        return pageInfo;
       // return semenCollectionMapper.queryPageUser(semencollDto);
    }

    @Override
    public ResponseDto<SemencollDto> queryDetailById(Long semencollId) {
        SemencollEo eo = semenCollectionMapper.findById(SemencollEo.class,semencollId);
        SemencollDto dto = new SemencollDto();

        BeanUtils.copyProperties(eo,dto);
        dto.setId(String.valueOf(eo.getId()));
        dto.setHerdId(String.valueOf(eo.getHerdId()));
        dto.setMaleId(String.valueOf(eo.getMaleId()));
        dto.setSemenId(String.valueOf(eo.getSemenId()));
        dto.setFarmId(String.valueOf(eo.getFarmId()));
        dto.setMasterOrgId(String.valueOf(eo.getMasterOrgId()));

        return new ResponseDto<>(dto);
    }
}
