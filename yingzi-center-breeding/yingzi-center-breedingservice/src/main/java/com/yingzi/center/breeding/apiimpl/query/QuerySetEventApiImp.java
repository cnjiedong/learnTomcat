package com.yingzi.center.breeding.apiimpl.query;

import com.yingzi.center.breeding.api.query.IQuerySetEventApi;
import com.yingzi.center.breeding.dto.SetEventDto;
import com.yingzi.center.breeding.service.query.ISetEventQueryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("setEventService")
public class QuerySetEventApiImp implements IQuerySetEventApi {

    /**品种Mapper类*/
    @Resource
    private ISetEventQueryService setEventQueryService;

    @Override
    public SetEventDto queryDetail(String eventNumber){
        return setEventQueryService.queryDetail(eventNumber);
    }

}
