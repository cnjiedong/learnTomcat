/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.eo.DataParamEo;

import java.util.List;

/**
 * 数据验证参数设置 内部Service接口
 *2018-4-19
 * @author hcp
 * @since 1.0.0
 */
public interface IDataParamService {

    public ResponseDto<Long> addDataParam(DataParamEo dataParamEo) ;

    public ResponseDto<Void> updateDataParam(DataParamEo dataParamEo);

    public ResponseDto<Void> deleteDataParam(Long dataParamId);

//    //分页数据验证参数列表
//    List<DataParamEo> queryPageUser(DataParamDto dataParamRequestDto);
//    //根据ID查询数据验证参数详情
//    ResponseDto<DataParamDto>	queryDetailById(Long DataParamId);
}
