package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IBreadSetQueryApi;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.mapper.BreedSetMapper;
import com.yingzi.center.breeding.service.query.IBreadSetQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("breadSetQueryApi")
public class BreadSetQueryApiImp implements IBreadSetQueryApi {

    /**品种Mapper类*/
    @Resource
    private IBreadSetQueryService breadSetQueryService;


    @Override
    public ResponseDto<PageInfo<BreedingSetDto>> pageQuery(PageInfoDto<BreedingSetDto> request) {
        PageInfo<BreedingSetDto> pageInfo = breadSetQueryService.pageQuery(request);
        return new ResponseDto<PageInfo<BreedingSetDto>>(pageInfo);
    }

    @Override
    public ResponseDto<Page<BreedingSetEo>>  testPageQuery(PageInfoDto<BreedingSetDto> request){
        Page<BreedingSetEo> page =  breadSetQueryService.testPageQuery(request);
        return new ResponseDto<Page<BreedingSetEo>>(page);
    }
}
