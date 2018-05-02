package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import org.springframework.beans.BeanUtils;

import java.util.List;

public interface IQueryBreadSetApi {

    public long insert(BreedingSetEo breedingSetEo);


    public PageInfo<BreedingSetDto> pageQuery(PageInfoDto<BreedingSetDto> request);

    public int update( BreedingSetEo breedingSetEo);

    public int delete( BreedingSetDto breedingSetDto);

    public int deleteBatch(BatchDelDto batchDelDto);


    public Page<BreedingSetEo> testPageQuery(PageInfoDto<BreedingSetDto> request);
}
