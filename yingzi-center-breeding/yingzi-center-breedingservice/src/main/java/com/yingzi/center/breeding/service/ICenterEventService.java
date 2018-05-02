/**
 * @(#) IDemoService.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.CheckInfoRequestDto;
import com.yingzi.center.breeding.eo.CenterEventEo;

/**
 * @ClassName: ICenterEventService
 * @Description: (事件中心服务接口)
 * @Author JIEDONG
 * @Date 2018-04-19
 * @V
 @Service("checkInfoService")
 **/
public interface ICenterEventService {

    //记录事件中心表
    int insert(CenterEventEo centerEventEo);
}
