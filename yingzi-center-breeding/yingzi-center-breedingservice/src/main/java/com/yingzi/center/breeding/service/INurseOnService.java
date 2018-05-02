package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.NurseOnDto;
import com.yingzi.center.breeding.dto.NurseOnRequestDto;
import com.yingzi.center.breeding.eo.NurseOnEo;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface INurseOnService {

    /**
     * 新增整窝寄入
     * @param nurseOnEo
     * @return
     */
    ResponseDto<Long> addNurseOn(NurseOnEo nurseOnEo);

    /**
     * 更新
     * @param nurseOnEo
     * @return
     */
    ResponseDto<Void> update(NurseOnEo nurseOnEo);

    /**
     * 删除
     * @param nurseOnId
     * @return
     */
    ResponseDto<Void> delete(long nurseOnId);

}
