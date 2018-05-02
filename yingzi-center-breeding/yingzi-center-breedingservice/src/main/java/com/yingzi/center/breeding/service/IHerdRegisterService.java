package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;
import com.yingzi.center.breeding.eo.HerdRegisterEo;

/**
 * @ClassName: IHerdRegisterService
 * @Description: (猪只档案服务类)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
public interface IHerdRegisterService {
    /**新增猪只档案信息*/
    ResponseDto<Long> insert(HerdRegisterEo herdRegisterEo);


    /**更新猪只档案信息*/
    void update(HerdRegisterEo herdRegisterEo);

    /**删除猪只档案信息*/
    void delete(Long  herdRegisterId);


}
