package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.EntryToBhEo;

/**
 * @author hpx
 * @Date 2018/4/24
 */
public interface IEntryToBhApi {
    /**
     * 新增
     * @param entryToBhEo
     * @return
     */
    ResponseDto<Long> addEntryToBh(EntryToBhEo entryToBhEo);

    /**
     * 修改
     * @param entryToBhEo
     * @return
     */
    ResponseDto<Void> updateEntryToBh(EntryToBhEo entryToBhEo);

    /**
     * 删除
     * @param entryToBhId
     * @return
     */
    ResponseDto<Void> deleteEntryToBh(long entryToBhId);
}
