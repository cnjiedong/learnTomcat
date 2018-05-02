package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.MatingEo;

/**
 * @author hpx
 * @Date 2018/4/25
 */
public interface IMatingService {
    /**
     * 新增配种记录
     * @param matingEo
     * @return
     */
    ResponseDto<Long> addMating(MatingEo matingEo);

    /**
     * 更新
     * @param matingEo
     * @return
     */
    ResponseDto<Void> update(MatingEo matingEo);

    /**
     * 删除
     * @param matingId
     * @return
     */
    ResponseDto<Void> delete(long matingId);
}
