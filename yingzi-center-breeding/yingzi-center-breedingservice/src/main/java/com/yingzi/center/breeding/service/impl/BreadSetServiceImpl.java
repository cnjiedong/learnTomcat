/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.impl;

import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.CheckInfoEo;
import com.yingzi.center.breeding.mapper.BreedSetMapper;
import com.yingzi.center.breeding.mapper.CheckInfoMapper;
import com.yingzi.center.breeding.service.IBreadSetService;
import com.yingzi.center.breeding.service.ICheckInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("breadSetService")
public class BreadSetServiceImpl implements IBreadSetService {



    /**品种Mapper类*/
    @Resource
    private BreedSetMapper breedSetMapper;

    @Override
    public long insert(BreedingSetEo breedingSetEo) {
        long ret = breedSetMapper.insert(breedingSetEo);
        return ret;
    }

    @Override
    public int update( BreedingSetEo breedingSetEo){
        return breedSetMapper.updateSelective( breedingSetEo);
    }

    public int delete( BreedingSetDto breedingSetDto){
        return breedSetMapper.deleteLogicById(BreedingSetEo.class, Long.valueOf(breedingSetDto.getId()), true);
    }

    @Override
    public int deleteBatch(BatchDelDto batchDelDto){
        int size = batchDelDto.getList().size();
        Long[] ids = batchDelDto.toArray();
        return breedSetMapper.deleteLogicBatchIds(  BreedingSetEo.class, ids,true);
    }
}
