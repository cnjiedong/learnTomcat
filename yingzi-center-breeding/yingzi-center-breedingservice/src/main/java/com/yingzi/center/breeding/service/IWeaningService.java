package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.WeaningDto;
import com.yingzi.center.breeding.dto.WeaningRequestDto;
import com.yingzi.center.breeding.eo.WeaningEo;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface IWeaningService {

    /**
     * 新增断奶记录
     * @param weaningEo
     * @return
     */
    ResponseDto<Long> addWeaning(WeaningEo weaningEo);

    /**
     * 更新
     * @param weaningEo
     * @return
     */
    ResponseDto<Void> update(WeaningEo weaningEo);

    /**
     * 删除
     * @param weaningId
     * @return
     */
    ResponseDto<Void> delete(long weaningId);

}
