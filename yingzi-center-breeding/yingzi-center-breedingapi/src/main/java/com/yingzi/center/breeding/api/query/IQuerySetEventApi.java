package com.yingzi.center.breeding.api.query;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.dto.SetEventDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;

public interface IQuerySetEventApi {

    public SetEventDto queryDetail(String eventNumber);
}
