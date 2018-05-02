package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.IBreadSetApi;
import com.yingzi.center.breeding.api.query.IBreadSetQueryApi;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.mapper.BreedSetMapper;
import com.yingzi.center.breeding.service.IBreadSetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("breadSetApi")
public class BreadSetApiImp implements IBreadSetApi {

    /**品种Mapper类*/
    @Resource
    private IBreadSetService breadSetService;

    @Override
    public ResponseDto<Long> insert(BreedingSetEo breedingSetEo) {
        long ret = breadSetService.insert(breedingSetEo);
        return new ResponseDto<Long>(Long.valueOf(ret));
    }

    @Override
    public ResponseDto<Void> update( BreedingSetEo breedingSetEo){
         breadSetService.update( breedingSetEo);
        return ResponseDto.VOID;
    }

    public ResponseDto<Void> delete( BreedingSetDto breedingSetDto){
       breadSetService.delete(breedingSetDto);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> deleteBatch(BatchDelDto batchDelDto){
        breadSetService.deleteBatch(batchDelDto);
        return ResponseDto.VOID;
    }
}
