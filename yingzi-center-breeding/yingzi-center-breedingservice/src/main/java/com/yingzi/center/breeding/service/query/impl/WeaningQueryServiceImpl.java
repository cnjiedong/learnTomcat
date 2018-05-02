package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.WeaningDto;
import com.yingzi.center.breeding.dto.WeaningRequestDto;
import com.yingzi.center.breeding.eo.WeaningEo;
import com.yingzi.center.breeding.mapper.WeaningMapper;
import com.yingzi.center.breeding.service.query.IWeaningQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gaocheng.
 * @date 2018/4/24.
 */
@Service("weaningQueryService")
public class WeaningQueryServiceImpl implements IWeaningQueryService {

    @Resource
    private WeaningMapper weaningMapper;

    @Override
    public ResponseDto<PageInfo<WeaningDto>> queryPageUser(WeaningRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<WeaningEo> list = (Page<WeaningEo>)weaningMapper.pageQuery(request);

        Page<WeaningDto> newList = new Page<>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (WeaningEo eo : list) {
            WeaningDto dto = new WeaningDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFcomment(eo.getFcomment());
            dto.setFemaleLocation(eo.getFemaleLocation());
            dto.setGroupId(eo.getGroupId());
            dto.setHerdId(eo.getHerdId());
            dto.setTotalWeight(eo.getTotalWeight());
            dto.setWeanDate(eo.getWeanDate());
            dto.setWeans(eo.getWeans());
            newList.add(dto);
        }
        PageInfo<WeaningDto> pageInfo = new PageInfo<>(newList);
        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<WeaningDto> queryDetailById(Long weaningId) {
        WeaningEo weaningEo = weaningMapper.queryById(weaningId);
        WeaningDto weaningDto = new WeaningDto();
        if(weaningEo == null) {
            return new ResponseDto<>(weaningDto);
        }
        BeanUtils.copyProperties(weaningEo, weaningDto);
        weaningDto.setId(String.valueOf(weaningEo.getId()));
        return new ResponseDto<>(weaningDto);
    }
}
