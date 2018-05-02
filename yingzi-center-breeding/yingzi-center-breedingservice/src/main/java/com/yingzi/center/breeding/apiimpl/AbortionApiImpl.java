package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IAbortionApi;
import com.yingzi.center.breeding.eo.AbortionEo;
import com.yingzi.center.breeding.service.IAbortionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user26 on 2018/4/24.
 */
@Service("abortionApi")
public class AbortionApiImpl implements IAbortionApi {

    @Resource
    private IAbortionService abortionService;
    @Override
    public ResponseDto<Long> addWeaning(AbortionEo abortionEo) {
        return abortionService.addAbortion(abortionEo);
    }

    @Override
    public ResponseDto<Void> updateAbortion(AbortionEo abortionEo) {
        return abortionService.update(abortionEo);
    }

    @Override
    public ResponseDto<Void> deleteAbortion(long abortionId) {
        return abortionService.delete(abortionId);
    }

}
