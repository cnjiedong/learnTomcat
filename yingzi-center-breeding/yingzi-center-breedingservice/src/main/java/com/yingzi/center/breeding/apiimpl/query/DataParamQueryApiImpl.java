/**
 * @(#) DemoQueryApiImpl.java 1.0 2018-01-25
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IDataParamQueryApi;
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.dto.DataParamRequestDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.DataParamEo;
import com.yingzi.center.breeding.service.IDataParamService;
import com.yingzi.center.breeding.service.query.IDataParamQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IDataParamQueryApi 实现类
 *2018-4-19
 * @author hcp
 * @since 1.0.0
 */
@Service("dataParamQueryApi")
public class DataParamQueryApiImpl implements IDataParamQueryApi {
    @Autowired
    private IDataParamQueryService dataParamQueryService;

    @Override
    public ResponseDto<PageInfo<DataParamDto>> queryPageUser(DataParamRequestDto request) {
         PageInfo<DataParamDto> pageInfo = dataParamQueryService.queryPageUser(request);
        return new ResponseDto<>(pageInfo);
//        int pageNum = request.getPageNum();
//        int pageSize = request.getPageSize();
//        pageNum = pageNum<=0 ? 1 : pageNum;
//        pageSize = pageSize<=0 ? 20 : pageSize;
//
//        PageHelper.startPage(pageNum, pageSize);
//        Page<DataParamEo> list = (Page<DataParamEo>)dataParamQueryService.queryPageUser(request.getParam());
//
//        Page<DataParamDto> newList = new Page<DataParamDto>();
//        newList.setPageNum(list.getPageNum());
//        newList.setPageSize(list.getPageSize());
//        newList.setStartRow(list.getStartRow());
//        newList.setEndRow(list.getEndRow());
//        newList.setTotal(list.getTotal());
//        newList.setPages(list.getPages());
//        newList.setCount(list.isCount());
//
//        for (DataParamEo eo : list) {
//            DataParamDto dto = new DataParamDto();
//            dto.setId(String.valueOf(eo.getId()));
//            dto.setFenable(eo.getFenable());
//            dto.setParamDesc(eo.getParamDesc());
//            dto.setParamValue(eo.getParamValue());
//            dto.setFcode(eo.getFcode());
//            newList.add(dto);
//        }
//        PageInfo<DataParamDto> pageInfo = new PageInfo<DataParamDto>(newList);
//
//        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<DataParamDto> queryDetailById(Long DataParamId) {
        return dataParamQueryService.queryDetailById(DataParamId);
    }
}
