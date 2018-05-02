package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.RemoveInfoEo;
import com.yingzi.center.breeding.mapper.RemoveInfoMapper;
import com.yingzi.center.breeding.service.IRemoveInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *离场service接口IRemoveInfoService实现类
 * @author user18
 * @date 2018/4/20
 */
@Service("removeInfoService")
public class RemoveInfoServiceImpl implements IRemoveInfoService {

    @Resource
    private RemoveInfoMapper removeInfoMapper;

    @Override
    public ResponseDto<Long> addRemove(RemoveInfoEo removeInfoEo) {
        long result = removeInfoMapper.insert(removeInfoEo);
        return new ResponseDto<>(result);
    }

    @Override
    public ResponseDto<Void> updateRemoveInfo(RemoveInfoEo removeInfoEo) {
        removeInfoMapper.updateSelective(removeInfoEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> deleteRemoveInfo(Long removeInfoId) {
        removeInfoMapper.deleteLogicById(RemoveInfoEo.class,removeInfoId,false);
        return ResponseDto.VOID;
    }

}
