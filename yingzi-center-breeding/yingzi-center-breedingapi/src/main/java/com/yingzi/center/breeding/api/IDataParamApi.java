package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.DataParamEo;

/**
 * 数据验证参数设置单
 *2018-4-19
 * @author hcp
 * @since 1.0.0
 */
public interface IDataParamApi {

    //新增数据验证参数信息
    ResponseDto<Long> addDataParam(DataParamEo dataParamEo);

    //更新数据验证参数信息
    ResponseDto<Void>	updateDataParam(DataParamEo dataParamEo);

    //删除数据验证参数信息
    ResponseDto<Void>	deleteDataParam(Long  dataParamId);
}
