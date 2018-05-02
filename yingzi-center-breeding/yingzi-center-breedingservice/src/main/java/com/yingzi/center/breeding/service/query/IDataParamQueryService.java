/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.dto.DataParamRequestDto;
import com.yingzi.center.breeding.eo.DataParamEo;

import java.util.List;

/**
 * Demo 内部Service接口
 *
 * @author 无名
 * @since 1.0.0
 */
public interface IDataParamQueryService {
    //分页数据验证参数列表
    PageInfo<DataParamDto> queryPageUser(DataParamRequestDto request);
    //根据ID查询数据验证参数详情
    ResponseDto<DataParamDto> queryDetailById(Long DataParamId);
}
