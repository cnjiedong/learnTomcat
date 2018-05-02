package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.dto.SemencollDto;
import com.yingzi.center.breeding.eo.SemencollEo;
import com.yingzi.center.breeding.mapper.SemenCollectionMapper;
import com.yingzi.center.breeding.service.ISemencollService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hcp
 * Created by user22 on 2018/4/21.
 */
@Service("semencollService")
public class SemencollServiceImpl implements ISemencollService {
    @Resource
    SemenCollectionMapper semenCollectionMapper;

    @Override
    public ResponseDto<Long> addSemencoll(SemencollEo semencollEo) {
        long ret = semenCollectionMapper.insert(semencollEo);
        return new ResponseDto<Long>(ret);
    }

    @Override
    public ResponseDto<Void> updateSemencoll(SemencollEo semencollEo) {
        semenCollectionMapper.updateSelective(semencollEo);
        return ResponseDto.VOID;

    }

    @Override
    public ResponseDto<Void> deleteSemencoll(Long semencollId) {
        semenCollectionMapper.deleteLogicById(SemencollEo.class,semencollId,false);
        return ResponseDto.VOID;
    }

//    @Override
//    public List<SemencollEo> queryPageUser(SemencollDto semencollDto) {
//
//        return semenCollectionMapper.queryPageUser(semencollDto);
//    }
//
//    @Override
//    public ResponseDto<SemencollDto> queryDetailById(Long semencollId) {
//        SemencollEo eo = semenCollectionMapper.queryDetailById(semencollId);
//        SemencollDto dto = new SemencollDto();
//
//        dto.setId(String.valueOf(eo.getId()));
//        dto.setAssess(eo.getAssess());
//        dto.setAttenuationActivity(eo.getAttenuationActivity());
//        dto.setCollectionDate(eo.getCollectionDate());
//        dto.setDosage(eo.getDosage());
//        dto.setExpDosage(eo.getExpDosage());
//        dto.setFcolour(eo.getFcolour());
//        dto.setFcomment(eo.getFcomment());
//        dto.setGelatineous(eo.getGelatineous());
//        dto.setHerdId(String.valueOf(eo.getHerdId()));
//        dto.setMaleId(String.valueOf(eo.getMaleId()));
//        dto.setSemenId(String.valueOf(eo.getSemenId()));
//        dto.setSpermActivity(eo.getSpermActivity());
//        dto.setTechnician(eo.getTechnician());
//        dto.setUnitActivity(eo.getUnitActivity());
//        dto.setSuitable(eo.getSuitable());
//        dto.setFarmId(String.valueOf(eo.getFarmId()));
//        dto.setMasterOrgId(String.valueOf(eo.getMasterOrgId()));
//
//        return new ResponseDto<>(dto);
//    }
}
