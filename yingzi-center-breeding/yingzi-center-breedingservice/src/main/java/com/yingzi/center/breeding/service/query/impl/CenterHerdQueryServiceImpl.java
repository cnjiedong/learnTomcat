/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.CenterHerdDto;
import com.yingzi.center.breeding.dto.CenterHerdRequestDto;
import com.yingzi.center.breeding.eo.CenterHerdEo;
import com.yingzi.center.breeding.mapper.CenterHerdMapper;
import com.yingzi.center.breeding.service.query.ICenterHerdQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: CenterHerdQueryServiceImpl
 * @Description: (种猪档案服务类)
 * @Author JIEDONG
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Service("centerHerdQueryService")
public class CenterHerdQueryServiceImpl implements ICenterHerdQueryService {

    /**种猪档案Mapper类*/
    @Resource
    private CenterHerdMapper centerHerdMapper;

    public int addHerd(CenterHerdDto centerHerdDto){
        CenterHerdEo centerHerdEo = new CenterHerdEo();
        BeanUtils.copyProperties(centerHerdDto, centerHerdEo);
        int result = centerHerdMapper.insert(centerHerdEo);
        return result;
    }

    //分页查询孕检列表
    @Override
    public PageInfo<CenterHerdEo> queryPage(CenterHerdRequestDto centerHerdRequestDto){
        int pageNum = centerHerdRequestDto.getPageNum();
        int pageSize = centerHerdRequestDto.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        Page<CenterHerdEo> page = (Page<CenterHerdEo>)centerHerdMapper.findAll(CenterHerdEo.class);
        PageInfo<CenterHerdEo> pageInfo = new PageInfo<>(page);
        return pageInfo;
    }
}
