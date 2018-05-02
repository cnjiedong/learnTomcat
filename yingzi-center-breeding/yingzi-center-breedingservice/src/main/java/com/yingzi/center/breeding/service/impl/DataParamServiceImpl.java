/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.DataParamEo;
import com.yingzi.center.breeding.mapper.DataParamMapper;
import com.yingzi.center.breeding.service.IDataParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 数据验证参数设置 内部Service接口实现
 *2018-4-19
 * @author hcp
 * @since 1.0.0
 */
@Service("dataParamService")
public class DataParamServiceImpl implements IDataParamService {

    @Resource
    private DataParamMapper dataParamMapper;

    @Override
    public ResponseDto<Long> addDataParam(DataParamEo dataParamEo) {
        long ret = dataParamMapper.insert(dataParamEo);
        return new ResponseDto<>(ret);
    }

    @Override
    public ResponseDto<Void> updateDataParam(DataParamEo dataParamEo) {
        dataParamMapper.updateSelective(dataParamEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> deleteDataParam(Long dataParamId) {
        dataParamMapper.deleteLogicById(DataParamEo.class, dataParamId, false);
        return ResponseDto.VOID;
    }

//    @Override
//    public List<DataParamEo> queryPageUser(DataParamDto dataParamDto) {
//
//        return dataParamMapper.queryPageUser(dataParamDto);
//    }
//
//    @Override
//    public ResponseDto<DataParamDto> queryDetailById(Long dataParamId) {
//        DataParamDto dataParamDto = dataParamMapper.queryDetailById(dataParamId);
//        return new ResponseDto<>(dataParamDto);
//    }
}
