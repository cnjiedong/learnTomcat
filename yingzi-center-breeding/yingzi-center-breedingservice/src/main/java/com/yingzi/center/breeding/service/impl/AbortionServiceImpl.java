package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.AbortionEo;
import com.yingzi.center.breeding.mapper.AbortionMapper;
import com.yingzi.center.breeding.service.IAbortionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user26 on 2018/4/24.
 */
@Service("abortionService")
public class AbortionServiceImpl implements IAbortionService{

    @Resource
    private AbortionMapper abortionMapper;

    @Override
    public ResponseDto<Long> addAbortion(AbortionEo abortionEo) {
        long id = abortionMapper.insert(abortionEo);
        ResponseDto<Long> result= new ResponseDto<>();
        String ret1 = id > 0 ? "SUCCESS":"FAILED";
        Long ret2 = id > 0 ? 1L:0L;
        result.setResult(ret1);
        result.setData(ret2);
        return result;
    }

    @Override
    public ResponseDto<Void> update(AbortionEo abortionEo) {
        abortionMapper.updateAbortionById(abortionEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> delete(long abortionId) {
        abortionMapper.deleteByAbortionId(abortionId);
        return ResponseDto.VOID;
    }
}
