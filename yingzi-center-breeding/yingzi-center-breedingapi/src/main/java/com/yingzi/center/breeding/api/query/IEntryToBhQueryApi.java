package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.EntryToBhDto;
import com.yingzi.center.breeding.dto.EntryToBhRequestDto;

/**
 * @author hpx
 * @Date 2018/4/24
 */
public interface IEntryToBhQueryApi {
    /**
     * 分页查询
     * @param request
     * @return
     */
    ResponseDto<PageInfo<EntryToBhDto>> queryPageUser(EntryToBhRequestDto request);

    /**
     * 根据id查询
     * @param entryToBhId
     * @return
     */
    ResponseDto<EntryToBhDto> queryDetailById(Long entryToBhId);
}
