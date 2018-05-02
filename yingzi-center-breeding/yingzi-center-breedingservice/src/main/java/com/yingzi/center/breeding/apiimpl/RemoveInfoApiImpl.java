package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IRemoveInfoApi;
import com.yingzi.center.breeding.eo.RemoveInfoEo;
import com.yingzi.center.breeding.service.IRemoveInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *离场接口IRemoveInfoApi实现类
 * @author user18
 * @date 2018/4/20
 */
@Service("removeInfoApiimpl")
public class RemoveInfoApiImpl implements IRemoveInfoApi {

    @Resource
    private IRemoveInfoService removeInfoService;

    @Override
    public ResponseDto<Long> addRemove(RemoveInfoEo removeInfoEo) {
        return removeInfoService.addRemove(removeInfoEo);
    }

    @Override
    public ResponseDto<Void> updateRemoveInfo(RemoveInfoEo removeInfoEo) {
        return removeInfoService.updateRemoveInfo(removeInfoEo);
    }

    @Override
    public ResponseDto<Void> deleteRemoveInfo(Long removeInfoId) {
        return removeInfoService.deleteRemoveInfo(removeInfoId);
    }
}
