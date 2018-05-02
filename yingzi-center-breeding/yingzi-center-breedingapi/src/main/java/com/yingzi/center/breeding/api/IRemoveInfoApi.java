package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.RemoveInfoEo;

/**
 *离场接口IRemoveInfoApi
 * @author user18
 * @date 2018/4/20
 */
public interface IRemoveInfoApi {

    /**
     * 新增离场信息
     * @param removeInfoEo
     * @return ResponseDto<Long>
     */
    ResponseDto<Long> addRemove(RemoveInfoEo removeInfoEo);

    /**
     * 更新离场信息
     * @param removeInfoEo
     * @return ResponseDto<Void>
     */
    ResponseDto<Void> updateRemoveInfo(RemoveInfoEo removeInfoEo);

    /**
     * 删除离场信息
     * @param removeInfoId
     * @return ResponseDto<Void>
     */
    ResponseDto<Void> deleteRemoveInfo(Long  removeInfoId);
}
