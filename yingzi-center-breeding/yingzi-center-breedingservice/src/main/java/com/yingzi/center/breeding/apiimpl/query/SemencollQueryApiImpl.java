package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.ISemencollQueryApi;

import com.yingzi.center.breeding.dto.SemencollDto;
import com.yingzi.center.breeding.dto.SemencollRequestDto;

import com.yingzi.center.breeding.eo.SemencollEo;
import com.yingzi.center.breeding.service.query.ISemencollQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  hcp
 * Created by user22 on 2018/4/21.
 */
@Service("semencollQueryApi")
public class SemencollQueryApiImpl implements ISemencollQueryApi {
    @Autowired
    ISemencollQueryService semencollQueryService;
    @Override
    public ResponseDto<PageInfo<SemencollDto>> queryPageUser(SemencollRequestDto request) {
        PageInfo<SemencollDto> pageInfo = semencollQueryService.queryPageUser(request);
        return new ResponseDto<>(pageInfo);


//        int pageNum = request.getPageNum();
//        int pageSize = request.getPageSize();
//        pageNum = pageNum<=0 ? 1 : pageNum;
//        pageSize = pageSize<=0 ? 20 : pageSize;
//
//        PageHelper.startPage(pageNum, pageSize);
//        Page<SemencollEo> list = (Page<SemencollEo>)semencollQueryService.queryPageUser(request.getParam());
//
//        Page<SemencollDto> newList = new Page<SemencollDto>();
//        newList.setPageNum(list.getPageNum());
//        newList.setPageSize(list.getPageSize());
//        newList.setStartRow(list.getStartRow());
//        newList.setEndRow(list.getEndRow());
//        newList.setTotal(list.getTotal());
//        newList.setPages(list.getPages());
//        newList.setCount(list.isCount());
//
//        for (SemencollEo eo : list) {
//            SemencollDto dto = new SemencollDto();
//
//            dto.setId(String.valueOf(eo.getId()));
//            dto.setAssess(eo.getAssess());
//            dto.setAttenuationActivity(eo.getAttenuationActivity());
//            dto.setCollectionDate(eo.getCollectionDate());
//            dto.setDosage(eo.getDosage());
//            dto.setExpDosage(eo.getExpDosage());
//            dto.setFcolour(eo.getFcolour());
//            dto.setFcomment(eo.getFcomment());
//            dto.setGelatineous(eo.getGelatineous());
//            dto.setHerdId(String.valueOf(eo.getHerdId()));
//            dto.setMaleId(String.valueOf(eo.getMaleId()));
//            dto.setSemenId(String.valueOf(eo.getSemenId()));
//            dto.setSpermActivity(eo.getSpermActivity());
//            dto.setTechnician(eo.getTechnician());
//            dto.setUnitActivity(eo.getUnitActivity());
//            dto.setSuitable(eo.getSuitable());
//            dto.setFarmId(String.valueOf(eo.getFarmId()));
//            dto.setMasterOrgId(String.valueOf(eo.getMasterOrgId()));
//
//            newList.add(dto);
//        }
//        PageInfo<SemencollDto> pageInfo = new PageInfo<SemencollDto>(newList);
//
//        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<SemencollDto> queryDetailById(Long semencollId) {
        return semencollQueryService.queryDetailById(semencollId);
    }
}
