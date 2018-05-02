package com.yingzi.center.breeding.service.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.MatingDto;
import com.yingzi.center.breeding.dto.MatingRequestDto;

/**
 * @author hpx
 * @Date 2018/4/25
 */
public interface IMatingQueryService {
    /**
     * 分页查询
     * @param request
     * @return
     */
    ResponseDto<PageInfo<MatingDto>> queryPageUser(MatingRequestDto request);

    /**
     * 通过id查询
     * @param matingId
     * @return
     */
    ResponseDto<MatingDto> queryDetailById(Long matingId);
}
