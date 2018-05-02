/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;

/**
 * Demo 内部Service接口
 *
 * @author 无名
 * @since 1.0.0
 */
public interface IBreadSetQueryService {

    //分页查询
    public PageInfo<BreedingSetDto> pageQuery(PageInfoDto<BreedingSetDto> request);

    //测试分页查询的返回对象，Page对象从中心服务返回到应用服务，对象内部数据出现异常
    public Page<BreedingSetEo> testPageQuery(PageInfoDto<BreedingSetDto> request);
}
