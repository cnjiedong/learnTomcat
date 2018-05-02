/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.query;

import com.yingzi.center.breeding.dto.SetEventDto;

/**
 * Demo 内部Service接口
 *
 * @author 无名
 * @since 1.0.0
 */
public interface ISetEventQueryService {
    public SetEventDto queryDetail(String eventNumber);
}
