package com.yingzi.center.breeding.apiimpl.query;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.yingzi.center.breeding.api.query.IQueryEventsManageApi;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.EventsManageDto;
import com.yingzi.center.breeding.dto.PageInfoDto;

import com.yingzi.center.breeding.eo.EventsManageEo;
import com.yingzi.center.breeding.mapper.EventManageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("eventManageService")
public class QueryEventManageApiImp implements IQueryEventsManageApi {

    /**事件中心表Mapper类*/
    @Resource
    private EventManageMapper eventManageMapper;

    public long insert(EventsManageEo eventsManageEo) {
        long ret = eventManageMapper.insert(eventsManageEo);
        return ret;
    }


    public PageInfo<EventsManageDto> pageQuery(PageInfoDto<EventsManageDto> request) {

        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<EventsManageEo> list = (Page<EventsManageEo>)eventManageMapper.pageQuery(request.getParam());

        Page<EventsManageDto> newList = new Page<EventsManageDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (EventsManageEo eo : list) {
            EventsManageDto dto = new EventsManageDto();
            dto.setId(eo.getId());
            dto.setEvdate(eo.getEvdate());
            dto.setEvtype(eo.getEvtype());
            dto.setHerdid(eo.getHerdid());
            dto.setFserial(eo.getFserial());
            dto.setFieldtext0(eo.getFieldtext0());
            dto.setFieldtext1(eo.getFieldtext1());
            dto.setFieldtext2(eo.getFieldtext2());
            dto.setFieldnum0(eo.getFieldnum0());
            dto.setFieldnum1(eo.getFieldnum1());
            dto.setFieldubi0(eo.getFieldubi0());
            dto.setFieldubi1(eo.getFieldubi1());
            dto.setFieldint0(eo.getFieldint0());
            dto.setFieldint1(eo.getFieldint1());
            dto.setFieldint2(eo.getFieldint2());
            dto.setFieldint3(eo.getFieldint3());
            dto.setFieldint4(eo.getFieldint4());
            dto.setFieldint5(eo.getFieldint5());
            dto.setFieldint6(eo.getFieldint6());
            dto.setBitthparity(eo.getBitthparity());
            dto.setFcomment(eo.getFcomment());
            dto.setPointer(eo.getPointer());
            newList.add(dto);
        }
        PageInfo<EventsManageDto> pageInfo = new PageInfo<EventsManageDto>(newList);
        return pageInfo;
    }

    public int update( EventsManageEo breedingSetEo){
        return eventManageMapper.update( breedingSetEo);
    }

    public int delete( EventsManageDto breedingSetDto){
        long id = breedingSetDto.getId();
        return eventManageMapper.deleteByCenterEventId(id);
    }


    public int deleteBatch(BatchDelDto batchDelDto){
        int size = batchDelDto.getList().size();
        Long[] ids = batchDelDto.toArray();
        return eventManageMapper.deleteLogicBatchIds(  EventsManageEo.class, ids,true);
    }



    public Page<EventsManageEo> testPageQuery(PageInfoDto<EventsManageDto> request){
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<EventsManageEo> list = (Page<EventsManageEo>)eventManageMapper.pageQuery(request.getParam());

        long total = list.getTotal();
        System.out.println(total);
        Page<EventsManageDto> newList = new Page<EventsManageDto>();
        newList.setPageNum(list.getPageNum());
        newList.setPageSize(list.getPageSize());
        newList.setStartRow(list.getStartRow());
        newList.setEndRow(list.getEndRow());
        newList.setTotal(list.getTotal());
        newList.setPages(list.getPages());
        newList.setCount(list.isCount());

        for (EventsManageEo eo : list) {
            EventsManageDto dto = new EventsManageDto();
            dto.setId(eo.getId());
            dto.setEvdate(eo.getEvdate());
            dto.setEvtype(eo.getEvtype());
            dto.setHerdid(eo.getHerdid());
            dto.setFserial(eo.getFserial());
            dto.setFieldtext0(eo.getFieldtext0());
            dto.setFieldtext1(eo.getFieldtext1());
            dto.setFieldtext2(eo.getFieldtext2());
            dto.setFieldnum0(eo.getFieldnum0());
            dto.setFieldnum1(eo.getFieldnum1());
            dto.setFieldubi0(eo.getFieldubi0());
            dto.setFieldubi1(eo.getFieldubi1());
            dto.setFieldint0(eo.getFieldint0());
            dto.setFieldint1(eo.getFieldint1());
            dto.setFieldint2(eo.getFieldint2());
            dto.setFieldint3(eo.getFieldint3());
            dto.setFieldint4(eo.getFieldint4());
            dto.setFieldint5(eo.getFieldint5());
            dto.setFieldint6(eo.getFieldint6());
            dto.setBitthparity(eo.getBitthparity());
            dto.setFcomment(eo.getFcomment());
            dto.setPointer(eo.getPointer());
            newList.add(dto);
        }
        PageInfo<EventsManageDto> pageInfo = new PageInfo<EventsManageDto>(newList);
        return list;
    }
}
