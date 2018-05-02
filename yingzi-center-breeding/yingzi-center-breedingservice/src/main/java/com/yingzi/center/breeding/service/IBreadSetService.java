/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.mapper.BreedSetMapper;

import javax.annotation.Resource;

/**
 * Demo 内部Service接口
 *
 * @author 无名
 * @since 1.0.0
 */
public interface IBreadSetService {

    public long insert(BreedingSetEo breedingSetEo);

    public int update(BreedingSetEo breedingSetEo);

    public int delete(BreedingSetDto breedingSetDto);

    public int deleteBatch(BatchDelDto batchDelDto);
}
