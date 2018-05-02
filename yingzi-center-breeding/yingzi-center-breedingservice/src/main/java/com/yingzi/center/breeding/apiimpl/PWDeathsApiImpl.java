package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IPWDeathsApi;
import com.yingzi.center.breeding.eo.PWDeathsEo;
import com.yingzi.center.breeding.service.IPWDeathsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user38 on 2018/4/25.
 */
@Service("pWDeathsApi")
public class PWDeathsApiImpl implements IPWDeathsApi {

    @Resource
    private IPWDeathsService pWDeathsService;

    @Override
    public ResponseDto<Long> addPWDeaths(PWDeathsEo pWDeathsEo) {
        return pWDeathsService.addPWDeaths(pWDeathsEo);
    }

    @Override
    public ResponseDto<Void> updatePWDeaths(PWDeathsEo pWDeathsEo) {
        return pWDeathsService.updatePWDeaths(pWDeathsEo);
    }

    @Override
    public ResponseDto<Void> deletePWDeaths(Long pWDeathsId) {
        return pWDeathsService.deletePWDeaths(pWDeathsId);
    }
}
