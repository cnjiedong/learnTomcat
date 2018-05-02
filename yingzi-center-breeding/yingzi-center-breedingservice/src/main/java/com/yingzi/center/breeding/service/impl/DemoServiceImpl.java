/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.impl;

import com.yingzi.center.breeding.service.IDemoService;
import com.yingzi.center.breeding.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * Demo 内部Service接口实现
 *
 * @author 无名
 * @since 1.0.0
 */
@Service("demoService")
public class DemoServiceImpl implements IDemoService {
    @Override
    public void demo() {
        System.out.println("hello,item");
    }
}
