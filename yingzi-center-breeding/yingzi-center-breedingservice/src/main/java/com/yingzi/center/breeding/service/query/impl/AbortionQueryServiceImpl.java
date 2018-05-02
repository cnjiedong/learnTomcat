package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.AbortionDto;
import com.yingzi.center.breeding.dto.AbortionRequestDto;
import com.yingzi.center.breeding.eo.AbortionEo;
import com.yingzi.center.breeding.mapper.AbortionMapper;
import com.yingzi.center.breeding.service.query.IAbortionQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user26 on 2018/4/24.
 */
@Service("abortionQueryService")
public class AbortionQueryServiceImpl implements IAbortionQueryService {

    @Resource
    private AbortionMapper abortionMapper;

    @Override
    public ResponseDto<PageInfo<AbortionDto>> queryPageUser(AbortionRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<AbortionEo> list = (Page<AbortionEo>)abortionMapper.pageQuery(request);

        Page<AbortionDto> newList = new Page<>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (AbortionEo eo : list) {
            AbortionDto dto = new AbortionDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFcomment(eo.getFcomment());
            dto.setDesLocation(eo.getDesLocation());
            dto.setHerdId(eo.getHerdId());
            dto.setAbortionDate(eo.getAbortionDate());
            newList.add(dto);
        }
        PageInfo<AbortionDto> pageInfo = new PageInfo<>(newList);
        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<AbortionDto> queryDetailById(Long abortionId) {
        AbortionEo abortionEo = abortionMapper.queryById(abortionId);
        AbortionDto abortionDto = new AbortionDto();
        if(abortionEo == null) {
            return new ResponseDto<>(abortionDto);
        }
        BeanUtils.copyProperties(abortionEo, abortionDto);
        abortionDto.setId(String.valueOf(abortionEo.getId()));
        return new ResponseDto<>(abortionDto);
    }
}
