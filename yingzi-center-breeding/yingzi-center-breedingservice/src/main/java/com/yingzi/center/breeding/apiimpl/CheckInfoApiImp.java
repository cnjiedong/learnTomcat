package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.ICheckInfoApi;
import com.yingzi.center.breeding.api.query.IQuerySetEventApi;
import com.yingzi.center.breeding.dto.SetEventDto;
import com.yingzi.center.breeding.eo.CheckInfoEo;
import com.yingzi.center.breeding.service.ICheckInfoService;
import com.yingzi.center.breeding.service.query.ISetEventQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("checkInfoApi")
public class CheckInfoApiImp implements ICheckInfoApi {

    /**品种Mapper类*/
    @Resource
    private ICheckInfoService checkInfoService;

    //新增孕检信息
    @Override
    public ResponseDto<Long> addCheckInfo(CheckInfoEo checkInfoEo){
        return new ResponseDto<Long>(checkInfoService.addCheckInfo(checkInfoEo));
    }

    //更新孕检信息
    @Override
    public ResponseDto<Void> updateCheckInfo(CheckInfoEo checkInfoEo){
        checkInfoService.updateCheckInfo(checkInfoEo);
        return ResponseDto.VOID;
    }

    //删除孕检信息
    @Override
    public ResponseDto<Void> deleteCheckInfo(Long  checkInfoId){
        checkInfoService.deleteCheckInfo(checkInfoId);
        return ResponseDto.VOID;
    }

}
