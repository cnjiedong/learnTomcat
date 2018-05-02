/**
 * @(#) IDemoQueryApi.java 1.0 2018-01-25
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.dto.DataParamRequestDto;
import com.yingzi.center.breeding.dto.PageInfoDto;

/**
 * 数据验证参数设置单
 *2018-4-19
 * @author hcp
 * @since 1.0.0
 */
public interface IDataParamQueryApi {
    //分页数据验证参数列表
    ResponseDto<PageInfo<DataParamDto>> queryPageUser(DataParamRequestDto request);
    //根据ID查询数据验证参数详情
    ResponseDto<DataParamDto>	queryDetailById(Long DataParamId);


}
