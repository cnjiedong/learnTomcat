package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.FarrowingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.FarrowingSetEo;

public interface IQueryFarrowSetApi {

    public long insert(FarrowingSetEo farrowingSetEo);


    public PageInfo<FarrowingSetDto> pageQuery(PageInfoDto<FarrowingSetDto> request);

    public int update(FarrowingSetEo farrowingSetEo);

    public int delete(FarrowingSetDto farrowingSetDto);

    public int deleteBatch(BatchDelDto batchDelDto);

    //根据ID查询数据验证参数详情
    ResponseDto<FarrowingSetDto> queryDetailById(Long mrId);

//
//    public Page<FarrowingSetEo> testPageQuery(PageInfoDto<FarrowingSetDto> request);
}
