package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.PWDeathsDto;
import com.yingzi.center.breeding.dto.PWDeathsRequestDto;
import com.yingzi.center.breeding.eo.PWDeathsEo;
import com.yingzi.center.breeding.mapper.PWDeathsMapper;
import com.yingzi.center.breeding.service.query.IPWDeathsQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 断奶前死亡
 * Created by user38 on 2018/4/25.
 */
@Service("pWDeathsQueryService")
public class PWDeathsQueryServiceImpl implements IPWDeathsQueryService {

    @Resource
    private PWDeathsMapper pWDeathsMapper;

    @Override
    public ResponseDto<PageInfo<PWDeathsDto>> queryPageUser(PWDeathsRequestDto pWDeathsRequestDto) {
        int pageNum = pWDeathsRequestDto.getPageNum();
        int pageSize= pWDeathsRequestDto.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);

        Page<PWDeathsDto> list = pWDeathsMapper.queryPageUser(pWDeathsRequestDto);
        PageInfo<PWDeathsDto> pageInfo = new PageInfo<PWDeathsDto>(list);
        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<PWDeathsDto> queryDetailById(Long pWDeathsId) {
        PWDeathsEo pWDeathsEo = pWDeathsMapper.findById(PWDeathsEo.class, pWDeathsId);
        if(pWDeathsEo == null){
            return null;
        }
        PWDeathsDto pwDeathsDto = new PWDeathsDto();
        BeanUtils.copyProperties(pWDeathsEo, pwDeathsDto);
        pwDeathsDto.setId(String.valueOf(pWDeathsId));
        return new ResponseDto<>(pwDeathsDto);
    }
}
