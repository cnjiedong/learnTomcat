package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.EntryToBhEo;

/**
 * @author hpx
 * @Date 2018/4/24
 */
public interface IEntryToBhService {
    /**
     * 新增转入记录
     * @param entryToBhEo
     * @return
     */
    ResponseDto<Long> addEntryToBh(EntryToBhEo entryToBhEo);

    /**
     * 更新
     * @param entryToBhEo
     * @return
     */
    ResponseDto<Void> update(EntryToBhEo entryToBhEo);

    /**
     * 删除
     * @param entryToBhId
     * @return
     */
    ResponseDto<Void> delete(long entryToBhId);

}
