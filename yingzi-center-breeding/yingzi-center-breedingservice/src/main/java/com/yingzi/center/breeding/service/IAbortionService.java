package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.AbortionEo;

/**
 * Created by user26 on 2018/4/24.
 */
public interface IAbortionService {
    /**
     * 新增断奶记录
     * @param abortionEo
     * @return
     */
    ResponseDto<Long> addAbortion(AbortionEo abortionEo);

    /**
     * 更新
     * @param abortionEo
     * @return
     */
    ResponseDto<Void> update(AbortionEo abortionEo);

    /**
     * 删除
     * @param abortionId
     * @return
     */
    ResponseDto<Void> delete(long abortionId);

}
