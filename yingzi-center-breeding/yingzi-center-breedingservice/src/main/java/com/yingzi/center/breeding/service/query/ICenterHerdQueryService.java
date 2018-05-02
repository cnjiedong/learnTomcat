/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.CenterHerdDto;
import com.yingzi.center.breeding.dto.CenterHerdRequestDto;
import com.yingzi.center.breeding.eo.CenterHerdEo;

/**
 * Demo 内部Service接口
 *
 * @author 无名
 * @since 1.0.0
 */
public interface ICenterHerdQueryService {

    int addHerd(CenterHerdDto centerHerdDto);
    //分页查询孕检列表
    PageInfo<CenterHerdEo> queryPage(CenterHerdRequestDto centerHerdRequestDto);

}
