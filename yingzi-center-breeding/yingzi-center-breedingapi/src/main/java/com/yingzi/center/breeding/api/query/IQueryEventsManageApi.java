package com.yingzi.center.breeding.api.query;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.EventsManageDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.EventsManageEo;

public interface IQueryEventsManageApi {

    public long insert(EventsManageEo eventsManageEo);


    public PageInfo<EventsManageDto> pageQuery(PageInfoDto<EventsManageDto> request);

    public int update(EventsManageEo eventsManageEo);

    public int delete(EventsManageDto eventsManageDto);

    public int deleteBatch(BatchDelDto batchDelDto);


    public Page<EventsManageEo> testPageQuery(PageInfoDto<EventsManageDto> request);
}
