package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.dto.MatingRuleDto;
import com.yingzi.center.breeding.dto.MatingRuleRequestDto;
import com.yingzi.center.breeding.eo.MatingRuleEo;
import com.yingzi.center.breeding.mapper.MatingRuleMapper;
import com.yingzi.center.breeding.service.IMatingRuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user08 on 2018/4/20.
 */
@Service("matingRuleService")
public class MatingRuleServiceImpl implements IMatingRuleService {

    @Resource
    private MatingRuleMapper matingRuleMapper;

    @Override
    public ResponseDto<Long> addMatingRule(MatingRuleEo matingRuleEo) {
        long ret = matingRuleMapper.insert(matingRuleEo);
        return new ResponseDto<>(ret);
    }

    @Override
    public ResponseDto<Void> updateMatingRule(MatingRuleEo matingRuleEo) {
        matingRuleMapper.updateSelective(matingRuleEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> deleteMatingRule(Long mrID) {
        matingRuleMapper.deleteByMatingRuleId(mrID);
        return ResponseDto.VOID;
    }

    @Override
    public List<MatingRuleDto> queryPageUser(MatingRuleRequestDto matingRuleRequestDto) {

        return matingRuleMapper.queryPageUser(matingRuleRequestDto);
    }

    @Override
    public ResponseDto<MatingRuleDto> queryDetailById(Long mrID) {
        MatingRuleDto matingRuleDto = matingRuleMapper.queryDetailById(mrID);
        return new ResponseDto<>(matingRuleDto);
    }



}
