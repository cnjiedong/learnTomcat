package com.yingzi.center.breeding.service.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.WeaningDto;
import com.yingzi.center.breeding.dto.WeaningRequestDto;

/**
 * @author gaocheng.
 * @date 2018/4/24.
 */
public interface IWeaningQueryService {
    /**
     * 分页查询
     * @param request
     * @return
     */
    ResponseDto<PageInfo<WeaningDto>> queryPageUser(WeaningRequestDto request);

    /**
     * 通过id查询
     * @param weaningId
     * @return
     */
    ResponseDto<WeaningDto> queryDetailById(Long weaningId);
}
