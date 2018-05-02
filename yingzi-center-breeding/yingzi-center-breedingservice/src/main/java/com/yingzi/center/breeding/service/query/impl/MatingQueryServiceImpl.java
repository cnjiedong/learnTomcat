package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.MatingDto;
import com.yingzi.center.breeding.dto.MatingRequestDto;
import com.yingzi.center.breeding.eo.MatingEo;
import com.yingzi.center.breeding.mapper.MatingMapper;
import com.yingzi.center.breeding.service.query.IMatingQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/25
 */
@Service("matingQueryService")
public class MatingQueryServiceImpl implements IMatingQueryService {
    @Resource
    private MatingMapper matingMapper;
    @Override
    public ResponseDto<PageInfo<MatingDto>> queryPageUser(MatingRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<MatingEo> list = (Page<MatingEo>)matingMapper.pageQuery(request);

        Page<MatingDto> newList = new Page<>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (MatingEo eo : list) {
            MatingDto dto = new MatingDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFcomment(eo.getFcomment());
            dto.setDosage(eo.getDosage());
            dto.setFhour(eo.getFhour());
            dto.setHerdId(eo.getHerdId());
            dto.setOffspringBreeding(eo.getOffspringBreeding());
            dto.setSemen(eo.getSemen());
            dto.setServDate(eo.getServDate());
            dto.setTechnician(eo.getTechnician());
            newList.add(dto);
        }
        PageInfo<MatingDto> pageInfo = new PageInfo<>(newList);
        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<MatingDto> queryDetailById(Long matingId) {
        MatingEo matingEo = matingMapper.queryById(matingId);
        MatingDto matingDto = new MatingDto();
        if(matingEo == null) {
            return new ResponseDto<>(matingDto);
        }
        BeanUtils.copyProperties(matingEo, matingDto);
        matingDto.setId(String.valueOf(matingEo.getId()));
        return new ResponseDto<>(matingDto);
    }
}
