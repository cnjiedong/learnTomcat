package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.NurseOnEo;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
public interface INurseOnApi {

    /**
     * 新增
     * @param nurseOnEo
     * @return
     */
    ResponseDto<Long> addNurseOn(NurseOnEo nurseOnEo);

    /**
     * 修改
     * @param nurseOnEo
     * @return
     */
    ResponseDto<Void> updateNurseOn(NurseOnEo nurseOnEo);

    /**
     * 删除
     * @param nurseOnId
     * @return
     */
    ResponseDto<Void> deleteNurseOn(Long  nurseOnId);
}
