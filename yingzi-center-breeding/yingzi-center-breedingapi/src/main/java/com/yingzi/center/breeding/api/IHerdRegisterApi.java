package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.HerdRegisterEo;

/**
 * @ClassName: IHerdRegisterApi
 * @Description: (猪只档案增删改接口)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */

public interface IHerdRegisterApi {
    /**新增猪只档案*/
    ResponseDto<Long> insert(HerdRegisterEo herdRegisterEo);


    /**更新新增猪只档案*/
    void update(HerdRegisterEo herdRegisterEo);


    /**删除新增猪只档案
     * @param herdRegisterId*/
    void delete(Long herdRegisterId);
}
