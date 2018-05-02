package com.yingzi.center.breeding.service.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.NurseOnDto;
import com.yingzi.center.breeding.dto.NurseOnRequestDto;

/**
 * @author gaocheng.
 * @date 2018/4/24.
 */
public interface INurseOnQueryService {

    /**
     * 分页查询
     * @param request
     * @return
     */
    ResponseDto<PageInfo<NurseOnDto>> queryPageUser(NurseOnRequestDto request);

    /**
     * 根据id查询
     * @param nurseOnId
     * @return
     */
    ResponseDto<NurseOnDto> queryDetailById(Long nurseOnId);
}
