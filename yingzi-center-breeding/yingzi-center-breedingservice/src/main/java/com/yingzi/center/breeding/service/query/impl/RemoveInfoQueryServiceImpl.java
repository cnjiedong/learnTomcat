package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.RemoveInfoDto;
import com.yingzi.center.breeding.dto.RemoveInfoRequestDto;
import com.yingzi.center.breeding.eo.RemoveInfoEo;
import com.yingzi.center.breeding.mapper.RemoveInfoMapper;
import com.yingzi.center.breeding.service.query.IRemoveInfoQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author user18
 * @date 2018/4/24
 */
@Service("removeInfoQueryService")
public class RemoveInfoQueryServiceImpl implements IRemoveInfoQueryService {

    @Resource
    private RemoveInfoMapper removeInfoMapper;

    @Override
    public ResponseDto<PageInfo<RemoveInfoDto>> queryPageUser(RemoveInfoRequestDto removeInfoRequestDto) {
        int pageNum = removeInfoRequestDto.getPageNum();
        int pageSize = removeInfoRequestDto.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);

        Page<RemoveInfoDto> list = removeInfoMapper.queryPageUser(removeInfoRequestDto.getParam());
        PageInfo<RemoveInfoDto> pageInfo = new PageInfo<RemoveInfoDto>(list);
        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<RemoveInfoDto> queryDetailById(Long removeInfoId) {
        RemoveInfoEo removeInfoEo = removeInfoMapper.findById(RemoveInfoEo.class,removeInfoId);
        if(removeInfoEo == null){
            return null;
        }
        RemoveInfoDto removeInfoDto = new RemoveInfoDto();
        BeanUtils.copyProperties(removeInfoEo,removeInfoDto);
        removeInfoDto.setId(String.valueOf(removeInfoEo.getId()));

        return new ResponseDto<>(removeInfoDto);
    }
}
