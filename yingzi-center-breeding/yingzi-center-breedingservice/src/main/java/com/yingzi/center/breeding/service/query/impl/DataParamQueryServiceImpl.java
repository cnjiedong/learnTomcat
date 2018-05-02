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
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.dto.DataParamRequestDto;
import com.yingzi.center.breeding.eo.DataParamEo;
import com.yingzi.center.breeding.mapper.DataParamMapper;
import com.yingzi.center.breeding.service.query.IDataParamQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("dataParamQueryService")
public class DataParamQueryServiceImpl implements IDataParamQueryService {
    @Resource
    private DataParamMapper dataParamMapper;

    @Override
    public PageInfo<DataParamDto> queryPageUser(DataParamRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<DataParamEo> list = (Page<DataParamEo>)dataParamMapper.queryPageUser(request.getParam());

        Page<DataParamDto> newList = new Page<DataParamDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (DataParamEo eo : list) {
            DataParamDto dto = new DataParamDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFenable(eo.getFenable());
            dto.setParamDesc(eo.getParamDesc());
            dto.setParamValue(eo.getParamValue());
            dto.setFcode(eo.getFcode());
            newList.add(dto);
        }
        PageInfo<DataParamDto> pageInfo = new PageInfo<DataParamDto>(newList);

        return pageInfo;
       // return  null;
        //return dataParamMapper.queryPageUser(dataParamDto);
    }

    @Override
    public ResponseDto<DataParamDto> queryDetailById(Long dataParamId) {
        DataParamEo eo= dataParamMapper.findById(DataParamEo.class,dataParamId);
        if(eo == null){
            return null;
        }

        DataParamDto dto = new DataParamDto();

        BeanUtils.copyProperties(eo,dto);
        dto.setId(String.valueOf(eo.getId()));
        return new ResponseDto<>(dto);

//        DataParamDto dataParamDto = dataParamMapper.queryDetailById(dataParamId);
//        return new ResponseDto<>(dataParamDto);
    }
}
