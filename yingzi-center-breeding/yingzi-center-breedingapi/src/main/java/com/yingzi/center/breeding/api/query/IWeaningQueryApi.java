package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.WeaningDto;
import com.yingzi.center.breeding.dto.WeaningRequestDto;


/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface IWeaningQueryApi {

    /**
     * 分页查询
     * @param request
     * @return
     */
    ResponseDto<PageInfo<WeaningDto>> queryPageUser(WeaningRequestDto request);

    /**
     * 根据id查询
     * @param weaningId
     * @return
     */
    ResponseDto<WeaningDto> queryDetailById(Long weaningId);
}
