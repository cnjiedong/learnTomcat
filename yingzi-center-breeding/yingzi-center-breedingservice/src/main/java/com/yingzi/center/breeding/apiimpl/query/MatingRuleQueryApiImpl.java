package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IMatingRuleQueryApi;
import com.yingzi.center.breeding.dto.MatingRuleDto;
import com.yingzi.center.breeding.dto.MatingRuleRequestDto;
import com.yingzi.center.breeding.eo.MatingRuleEo;
import com.yingzi.center.breeding.service.IMatingRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user08 on 2018/4/20.
 */
@Service("matingRuleQueryApi")
public class MatingRuleQueryApiImpl implements IMatingRuleQueryApi {

    @Autowired
    private IMatingRuleService matingRuleService;

    @Override
    public ResponseDto<PageInfo<MatingRuleDto>> queryPageUser(MatingRuleRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<MatingRuleDto> list = (Page<MatingRuleDto>)matingRuleService.queryPageUser(request);

       /* Page<MatingRuleDto> newList = new Page<MatingRuleDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (MatingRuleEo eo : list) {
            MatingRuleDto dto = new MatingRuleDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setFenable(eo.getFenable());
            dto.setFatherId(eo.getFatherId());
            dto.setMotherId(eo.getMotherId());
            dto.setOffsId(eo.getOffsId());
            newList.add(dto);
        }*/
        PageInfo<MatingRuleDto> pageInfo = new PageInfo<MatingRuleDto>(list);

        return new ResponseDto<>(pageInfo);
    }

    @Override
    public ResponseDto<MatingRuleDto> queryDetailById(Long mrId) {
        return matingRuleService.queryDetailById(mrId);
    }
}
