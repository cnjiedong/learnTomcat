/**
 * @(#) DemoApiImpl.java 1.0 2018-01-25
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IDataParamApi;
import com.yingzi.center.breeding.api.IDemoApi;
import com.yingzi.center.breeding.eo.DataParamEo;
import com.yingzi.center.breeding.mapper.DataParamMapper;
import com.yingzi.center.breeding.service.IDataParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;





/**
 * IDataParamApi 实现类
 *2018-4-19
 * @author hcp
 * @since 1.0.0
 */
@Service("dataParamApi")
public class DataParamApiImpl implements IDataParamApi {

    @Autowired
    private IDataParamService dataParamService;
    /*
    @Resource
    private DataParamMapper dataParamMapper;*/


    @Override
    public ResponseDto<Long> addDataParam(DataParamEo dataParamEo) {

        return dataParamService.addDataParam(dataParamEo);
    }

    @Override
    public ResponseDto<Void> updateDataParam(DataParamEo dataParamEo) {
        return dataParamService.updateDataParam(dataParamEo);
    }

    @Override
    public ResponseDto<Void> deleteDataParam(Long dataParamId) {
        return dataParamService.deleteDataParam(dataParamId);
    }
}
