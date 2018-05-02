package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;

public interface IBreadSetApi {

    public ResponseDto<Long> insert(BreedingSetEo breedingSetEo);

    public ResponseDto<Void> update(BreedingSetEo breedingSetEo);

    public ResponseDto<Void> delete(BreedingSetDto breedingSetDto);

    public ResponseDto<Void> deleteBatch(BatchDelDto batchDelDto);
}
