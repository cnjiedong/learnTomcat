package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.INurseOnApi;
import com.yingzi.center.breeding.eo.NurseOnEo;
import com.yingzi.center.breeding.service.INurseOnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author gaocheng
 * @date 2018/4/18
 */
@Service("nurseOnApi")
public class NurseOnApiImpl implements INurseOnApi {

    @Resource
    private INurseOnService nurseOnService;

    @Override
    public ResponseDto<Long> addNurseOn(NurseOnEo nurseOnEo) {
        return nurseOnService.addNurseOn(nurseOnEo);
    }

    @Override
    public ResponseDto<Void> updateNurseOn(NurseOnEo nurseOnEo) {
        return nurseOnService.update(nurseOnEo);
    }

    @Override
    public ResponseDto<Void> deleteNurseOn(Long nurseOnId) {
        return nurseOnService.delete(nurseOnId);
    }
}
