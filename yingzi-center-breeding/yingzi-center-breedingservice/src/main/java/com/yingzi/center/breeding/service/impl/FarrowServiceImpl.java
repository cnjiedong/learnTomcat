/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.impl;

import com.yingzi.center.breeding.service.IDemoService;
import com.yingzi.center.breeding.service.IFarrowService;
import org.springframework.stereotype.Service;


/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("farrowService")
public class FarrowServiceImpl implements IFarrowService {
    @Override
    public void farrow() {
        System.out.println("hello,item");
    }
}
