package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.CheckInfoEo;

public interface ICheckInfoApi {

    //新增孕检信息
    public ResponseDto<Long> addCheckInfo(CheckInfoEo checkInfoEo);

    //更新孕检信息
    public ResponseDto<Void> updateCheckInfo(CheckInfoEo checkInfoEo);

    //删除孕检信息
    public ResponseDto<Void> deleteCheckInfo(Long  checkInfoId);
}
