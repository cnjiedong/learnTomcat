package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IMatingApi;
import com.yingzi.center.breeding.eo.MatingEo;
import com.yingzi.center.breeding.service.IMatingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/25
 */
@Service("matingApi")
public class MatingApiImpl implements IMatingApi {

    @Resource
    private IMatingService matingService;

    @Override
    public ResponseDto<Long> addMating(MatingEo matingEo) {
        return matingService.addMating(matingEo);
    }

    @Override
    public ResponseDto<Void> updateMating(MatingEo matingEo) {
        return matingService.update(matingEo);
    }

    @Override
    public ResponseDto<Void> deleteMating(long matingId) {
        return matingService.delete(matingId);
    }
}
