/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.mapper.BreedSetMapper;
import com.yingzi.center.breeding.service.query.IBreadSetQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("breadSetQueryService")
public class BreadSetQueryServiceImpl implements IBreadSetQueryService {

    /**品种Mapper类*/
    @Resource
    private BreedSetMapper breedSetMapper;

    //分页查询
    @Override
    public PageInfo<BreedingSetDto> pageQuery(PageInfoDto<BreedingSetDto> request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<BreedingSetEo> list = (Page<BreedingSetEo>)breedSetMapper.pageQuery(request.getParam());

        Page<BreedingSetDto> newList = new Page<BreedingSetDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (BreedingSetEo eo : list) {
            BreedingSetDto dto = new BreedingSetDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFenable(eo.getFenable());
            dto.setFname(eo.getFname());
            dto.setFcode(eo.getFcode());
            newList.add(dto);
        }
        PageInfo<BreedingSetDto> pageInfo = new PageInfo<BreedingSetDto>(newList);
        return pageInfo;
    }


    //测试分页查询的返回对象，Page对象从中心服务返回到应用服务，对象内部数据出现异常
    @Override
    public Page<BreedingSetEo> testPageQuery(PageInfoDto<BreedingSetDto> request){
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<BreedingSetEo> list = (Page<BreedingSetEo>)breedSetMapper.pageQuery(request.getParam());

        long total = list.getTotal();
        System.out.println(total);
        Page<BreedingSetDto> newList = new Page<BreedingSetDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (BreedingSetEo eo : list) {
            BreedingSetDto dto = new BreedingSetDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFenable(eo.getFenable());
            dto.setFname(eo.getFname());
            dto.setFcode(eo.getFcode());
            newList.add(dto);
        }
        PageInfo<BreedingSetDto> pageInfo = new PageInfo<BreedingSetDto>(newList);
        return list;
    }
}
