/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.SemencollDto;
import com.yingzi.center.breeding.dto.SemencollRequestDto;
import com.yingzi.center.breeding.eo.SemencollEo;

import java.util.List;

/**
 * Demo 内部Service接口
 *
 * @author 无名
 * @since 1.0.0
 */
public interface ISemencollQueryService {
    public PageInfo<SemencollDto> queryPageUser(SemencollRequestDto request);

    public ResponseDto<SemencollDto> queryDetailById(Long semencollId);
}
