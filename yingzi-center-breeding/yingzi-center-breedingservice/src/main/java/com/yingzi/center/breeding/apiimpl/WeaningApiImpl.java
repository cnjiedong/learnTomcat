package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IWeaningApi;
import com.yingzi.center.breeding.eo.WeaningEo;
import com.yingzi.center.breeding.service.IWeaningService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
@Service("weaningApi")
public class WeaningApiImpl implements IWeaningApi {

    @Resource
    private IWeaningService weaningService;

    @Override
    public ResponseDto<Long> addWeaning(WeaningEo weaningEo) {
        return weaningService.addWeaning(weaningEo);
    }

    @Override
    public ResponseDto<Void> updateWeaning(WeaningEo weaningEo) {
        return weaningService.update(weaningEo);
    }

    @Override
    public ResponseDto<Void> deleteWeaning(long weaningId) {
        return weaningService.delete(weaningId);
    }
}
