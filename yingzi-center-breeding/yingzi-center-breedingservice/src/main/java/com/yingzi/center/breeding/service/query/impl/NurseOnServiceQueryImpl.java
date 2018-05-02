package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.NurseOnDto;
import com.yingzi.center.breeding.dto.NurseOnRequestDto;
import com.yingzi.center.breeding.eo.NurseOnEo;
import com.yingzi.center.breeding.mapper.NurseOnMapper;
import com.yingzi.center.breeding.service.query.INurseOnQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author user14.
 * @date 2018/4/24.
 */
@Service("nurseOnServiceQuery")
public class NurseOnServiceQueryImpl implements INurseOnQueryService {

    @Resource
    private NurseOnMapper nurseOnMapper;

    @Override
    public ResponseDto<PageInfo<NurseOnDto>> queryPageUser(NurseOnRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<NurseOnEo> list = (Page<NurseOnEo>)nurseOnMapper.pageQuery(request);

        Page<NurseOnDto> newList = new Page<>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (NurseOnEo eo : list) {
            NurseOnDto dto = new NurseOnDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setAge(eo.getAge());
            dto.setFcomment(eo.getFcomment());
            dto.setForsterOff(eo.getForsterOff());
            dto.setHerdId(eo.getHerdId());
            dto.setNurseOnDate(eo.getNurseOnDate());
            dto.setPreWean(eo.getPreWean());
            newList.add(dto);
        }
        PageInfo<NurseOnDto> pageInfo = new PageInfo<>(newList);
        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<NurseOnDto> queryDetailById(Long nurseOnId) {
        NurseOnEo nurseOnEo = nurseOnMapper.queryById(nurseOnId);
        NurseOnDto nurseOnDto = new NurseOnDto();
        if(nurseOnEo == null) {
            return new ResponseDto<>(nurseOnDto);
        }
        BeanUtils.copyProperties(nurseOnEo, nurseOnDto);
        nurseOnDto.setId(String.valueOf(nurseOnEo.getId()));
        return new ResponseDto<>(nurseOnDto);
    }
}
