package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.WeaningEo;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface IWeaningApi {

    /**
     * 新增
     * @param weaningEo
     * @return
     */
    ResponseDto<Long> addWeaning(WeaningEo weaningEo);

    /**
     * 修改
     * @param weaningEo
     * @return
     */
    ResponseDto<Void> updateWeaning(WeaningEo weaningEo);

    /**
     * 删除
     * @param weaningId
     * @return
     */
    ResponseDto<Void> deleteWeaning(long weaningId);
}
