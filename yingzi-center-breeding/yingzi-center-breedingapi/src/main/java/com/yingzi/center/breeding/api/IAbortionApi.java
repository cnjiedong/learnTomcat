package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.AbortionEo;

/**
 * Created by user26 on 2018/4/24.
 */
public interface IAbortionApi {
    /**
     * 新增
     * @param abortionEo
     * @return
     */
    ResponseDto<Long> addWeaning(AbortionEo abortionEo);

    /**
     * 修改
     * @param abortionEo
     * @return
     */
    ResponseDto<Void> updateAbortion(AbortionEo abortionEo);

    /**
     * 删除
     * @param abortionId
     * @return
     */
    ResponseDto<Void> deleteAbortion(long abortionId);
}
