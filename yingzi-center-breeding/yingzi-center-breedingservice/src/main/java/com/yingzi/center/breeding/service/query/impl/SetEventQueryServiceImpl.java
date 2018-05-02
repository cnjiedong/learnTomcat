/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query.impl;

import com.yingzi.center.breeding.dto.SetEventDto;
import com.yingzi.center.breeding.mapper.BreedSetMapper;
import com.yingzi.center.breeding.mapper.SetEventMapper;
import com.yingzi.center.breeding.service.query.ISetEventQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("setEventQueryService")
public class SetEventQueryServiceImpl implements ISetEventQueryService {

    /**品种Mapper类*/
    @Resource
    private SetEventMapper setEventMapper;

    @Override
    public SetEventDto queryDetail(String eventNumber){
        return setEventMapper.queryDetail(eventNumber);
    }
}
