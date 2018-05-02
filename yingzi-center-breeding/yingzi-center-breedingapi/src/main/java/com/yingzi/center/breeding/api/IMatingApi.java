package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.MatingEo;

/**
 * @author hpx
 * @Date 2018/4/25
 */
public interface IMatingApi {
    /**
     * 新增
     * @param matingEo
     * @return
     */
    ResponseDto<Long> addMating(MatingEo matingEo);

    /**
     * 修改
     * @param matingEo
     * @return
     */
    ResponseDto<Void> updateMating(MatingEo matingEo);

    /**
     * 删除
     * @param matingId
     * @return
     */
    ResponseDto<Void> deleteMating(long matingId);
}
