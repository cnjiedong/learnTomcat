/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;
import com.yingzi.center.breeding.eo.CheckInfoEo;

/**
 * Demo 内部Service接口
 *
 * @author 无名
 * @since 1.0.0
 */
public interface ICheckInfoService {

    //新增孕检信息
    public Long addCheckInfo(CheckInfoEo checkInfoEo);

    //更新孕检信息
    public void updateCheckInfo(CheckInfoEo checkInfoEo);

    //删除孕检信息
    public void deleteCheckInfo(Long  checkInfoId);
}

