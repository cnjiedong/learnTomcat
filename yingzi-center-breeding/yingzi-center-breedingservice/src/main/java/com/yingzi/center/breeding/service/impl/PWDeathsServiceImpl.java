package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.PWDeathsEo;
import com.yingzi.center.breeding.mapper.PWDeathsMapper;
import com.yingzi.center.breeding.service.IPWDeathsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 断奶前死亡
 * Created by user38 on 2018/4/25.
 */
@Service("pWDeathsService")
public class PWDeathsServiceImpl implements IPWDeathsService {

    @Resource
    private PWDeathsMapper pWDeathsMapper;

    @Override
    public ResponseDto<Long> addPWDeaths(PWDeathsEo pWDeathsEo) {
        long result = pWDeathsMapper.insert(pWDeathsEo);
        return new ResponseDto<>(result);
    }

    @Override
    public ResponseDto<Void> updatePWDeaths(PWDeathsEo pWDeathsEo) {
        pWDeathsMapper.updateSelective(pWDeathsEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> deletePWDeaths(Long pWDeathsId) {
        pWDeathsMapper.deleteLogicById(PWDeathsEo.class, pWDeathsId, false);
        return ResponseDto.VOID;
    }
}
