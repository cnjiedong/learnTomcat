/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.impl;

import com.yingzi.center.breeding.eo.CheckInfoEo;
import com.yingzi.center.breeding.mapper.CheckInfoMapper;
import com.yingzi.center.breeding.service.ICheckInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("checkInfoService")
public class CheckInfoServiceImpl implements ICheckInfoService {

    /**品种Mapper类*/
    @Resource
    private CheckInfoMapper checkInfoMapper;

    //@Resource
    //CheckInfoDas checkInfoDas;

    //新增孕检信息
    public Long addCheckInfo(CheckInfoEo checkInfoEo){
        checkInfoMapper.insert(checkInfoEo);
        Long id = checkInfoEo.getId();
        return id;
    }

    //更新孕检信息
    public void updateCheckInfo(CheckInfoEo checkInfoEo){
        checkInfoMapper.updateSelective(checkInfoEo);
    }

    //删除孕检信息
    public void deleteCheckInfo(Long  checkInfoId){
        checkInfoMapper.deleteLogicById(CheckInfoEo.class, checkInfoId, true);
    }
}
