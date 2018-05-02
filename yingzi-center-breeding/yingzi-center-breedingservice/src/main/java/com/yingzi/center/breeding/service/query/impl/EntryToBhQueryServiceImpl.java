package com.yingzi.center.breeding.service.query.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.EntryToBhDto;
import com.yingzi.center.breeding.dto.EntryToBhRequestDto;
import com.yingzi.center.breeding.eo.EntryToBhEo;
import com.yingzi.center.breeding.mapper.EntryToBhMapper;
import com.yingzi.center.breeding.service.query.IEntryToBhQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/24
 */
@Service("entryToBhQueryService")
public class EntryToBhQueryServiceImpl implements IEntryToBhQueryService{
    @Resource
    private EntryToBhMapper entryToBhMapper;
    @Override
    public ResponseDto<PageInfo<EntryToBhDto>> queryPageUser(EntryToBhRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<EntryToBhEo> list = (Page<EntryToBhEo>)entryToBhMapper.pageQuery(request);

        Page<EntryToBhDto> newList = new Page<>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (EntryToBhEo eo : list) {
            EntryToBhDto dto = new EntryToBhDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFcomment(eo.getFcomment());
            dto.setDesLocation(eo.getDesLocation());
            dto.setHerdId(eo.getHerdId());
            dto.setWeight(eo.getWeight());
            dto.setEntryDate(eo.getEntryDate());
            newList.add(dto);
        }
        PageInfo<EntryToBhDto> pageInfo = new PageInfo<>(newList);
        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<EntryToBhDto> queryDetailById(Long entryToBhId) {
        EntryToBhEo entryToBhEo = entryToBhMapper.queryById(entryToBhId);
        EntryToBhDto entryToBhDto = new EntryToBhDto();
        if(entryToBhEo == null) {
            return new ResponseDto<>(entryToBhDto);
        }
        BeanUtils.copyProperties(entryToBhEo, entryToBhDto);
        entryToBhDto.setId(String.valueOf(entryToBhEo.getId()));
        return new ResponseDto<>(entryToBhDto);
    }
}
