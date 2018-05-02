package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IHerdRegisterApi;
import com.yingzi.center.breeding.eo.HerdRegisterEo;
import com.yingzi.center.breeding.service.IHerdRegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: HerdRegisterApiImpl
 * @Description: (猪只档案接口实现)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Service("herdRegisterApi")
public class HerdRegisterApiImpl implements IHerdRegisterApi {
    @Resource
    IHerdRegisterService herdRegisterService ;

    /**新增猪只档案信息*/
    @Override
    public ResponseDto<Long> insert(HerdRegisterEo herdRegisterEo) {
        return herdRegisterService.insert(herdRegisterEo);
    }

    /**更新猪只档案信息*/
    @Override
    public void update(HerdRegisterEo herdRegisterEo) {
        herdRegisterService.update(herdRegisterEo);

    }

    /**删除猪只档案信息
     * @param herdRegisterId*/
    @Override
    public void  delete(Long herdRegisterId) {
        herdRegisterService.delete(herdRegisterId);


    }
}
