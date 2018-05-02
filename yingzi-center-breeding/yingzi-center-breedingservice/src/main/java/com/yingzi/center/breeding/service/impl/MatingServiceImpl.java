package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.MatingEo;
import com.yingzi.center.breeding.mapper.MatingMapper;
import com.yingzi.center.breeding.service.IMatingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/25
 */
@Service("matingService")
public class MatingServiceImpl implements IMatingService {

    @Resource
    private MatingMapper matingMapper;

    @Override
    public ResponseDto<Long> addMating(MatingEo matingEo) {
        long id = matingMapper.insert(matingEo);
        ResponseDto<Long> result= new ResponseDto<>();
        String ret1 = id > 0 ? "SUCCESS":"FAILED";
        Long ret2 = id > 0 ? 1L:0L;
        result.setResult(ret1);
        result.setData(ret2);
        return result;
    }

    @Override
    public ResponseDto<Void> update(MatingEo matingEo) {
        matingMapper.updateMatingById(matingEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> delete(long matingId) {
        matingMapper.deleteByMatingId(matingId);
        return ResponseDto.VOID;
    }
}
