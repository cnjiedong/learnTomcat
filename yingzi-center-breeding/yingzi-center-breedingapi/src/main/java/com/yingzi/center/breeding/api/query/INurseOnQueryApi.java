package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.NurseOnDto;
import com.yingzi.center.breeding.dto.NurseOnRequestDto;


/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface INurseOnQueryApi {

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
