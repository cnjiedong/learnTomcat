package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.NurseOnDto;
import com.yingzi.center.breeding.dto.NurseOnRequestDto;
import com.yingzi.center.breeding.eo.NurseOnEo;
import com.yingzi.center.breeding.mapper.NurseOnMapper;
import com.yingzi.center.breeding.service.INurseOnService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
@Service("nurseOnService")
public class NurseOnServiceImpl implements INurseOnService {

    @Resource
    private NurseOnMapper nurseOnMapper;

    @Override
    public ResponseDto<Long> addNurseOn(NurseOnEo nurseOnEo) {
        long id = nurseOnMapper.insert(nurseOnEo);
        ResponseDto<Long> result= new ResponseDto<>();
        String ret1 = id > 0 ? "SUCCESS":"FAILED";
        Long ret2 = id > 0 ? 1L:0L;
        result.setResult(ret1);
        result.setData(ret2);
        return result;
    }

    @Override
    public ResponseDto<Void> update(NurseOnEo nurseOnEo) {
        nurseOnMapper.updateNurseOnById(nurseOnEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> delete(long nurseOnId) {
        nurseOnMapper.deleteByNurseOnId(nurseOnId);
        return ResponseDto.VOID;
    }

}
