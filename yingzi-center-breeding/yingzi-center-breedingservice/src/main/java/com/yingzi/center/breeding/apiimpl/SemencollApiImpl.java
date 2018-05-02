package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.ISemencollApi;
import com.yingzi.center.breeding.eo.SemencollEo;

import com.yingzi.center.breeding.service.ISemencollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  hcp
 * Created by user22 on 2018/4/21.
 */
@Service("semencollApi")
public class SemencollApiImpl implements ISemencollApi {
    @Autowired
    ISemencollService semencollService;
    @Override
    public ResponseDto<Long> addSemencoll(SemencollEo semencollEo) {
        return semencollService.addSemencoll(semencollEo);
    }

    @Override
    public ResponseDto<Void> updateSemencoll(SemencollEo semencollEo) {
        semencollService.updateSemencoll(semencollEo);
        return ResponseDto.VOID;

    }

    @Override
    public ResponseDto<Void> deleteSemencoll(Long semencollId) {
        semencollService.deleteSemencoll(semencollId);
        return  ResponseDto.VOID;
    }
}
