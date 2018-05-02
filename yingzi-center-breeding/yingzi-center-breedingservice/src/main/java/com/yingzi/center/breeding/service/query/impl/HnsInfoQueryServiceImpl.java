package com.yingzi.center.breeding.service.query.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IHnsInfoQueryApi;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.HnsInfoEo;
import com.yingzi.center.breeding.mapper.HnsInfoMapper;
import com.yingzi.center.breeding.service.query.IHnsInfoQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: IHnsInfoQueryService
 * @Description: (发情未配种服务类实现)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Service("hnsInfoQueryService")
public class HnsInfoQueryServiceImpl implements IHnsInfoQueryService {

    @Resource
    private HnsInfoMapper hnsInfoMapper;

    /**分页查询发情未配种信息*/
    @Override
    public PageInfo<HsnInfoDto> pageQuery(PageInfoDto<HsnInfoDto> request) {

        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<HsnInfoDto> list = (Page<HsnInfoDto>)hnsInfoMapper.pageQuery(request.getParam());

        Page<HsnInfoDto> newList = new Page<HsnInfoDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (HsnInfoDto eo : list) {
            HsnInfoDto dto = new HsnInfoDto();
            dto.setId(String.valueOf(eo.getId()));
            dto.setHeatDate(eo.getHeatDate());
            dto.setHeatResult(eo.getHeatResult());
            dto.setFcomment(eo.getFcomment());
            dto.setEventId(eo.getEventId());
            newList.add(dto);
        }
        PageInfo<HsnInfoDto> pageInfo = new PageInfo<HsnInfoDto>(newList);
        return pageInfo;
    }

    /**根据ID查询发情未配种信息*/
    @Override
    public HsnInfoDto queryDetailById(Long hsnInfoId)  {
        HnsInfoEo hnsInfoEo = hnsInfoMapper.queryDetailById(hsnInfoId);
        HsnInfoDto hsnInfoDto  = new HsnInfoDto();
        BeanUtils.copyProperties(hnsInfoEo,hsnInfoDto);
        return hsnInfoDto;
    }
}
