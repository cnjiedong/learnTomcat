package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IMatingRuleApi;
import com.yingzi.center.breeding.eo.MatingRuleEo;
import com.yingzi.center.breeding.service.IMatingRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user08 on 2018/4/20.
 */
@Service("matingRuleApi")
public class MatingRuleApiImpl implements IMatingRuleApi {

    @Autowired
    private IMatingRuleService matingRuleService;

//    @Resource
//    private MatingRuleServiceImpl matingRuleService;

    @Override
    public ResponseDto<Long> addMatingRule(MatingRuleEo matingRuleEo) {
        return matingRuleService.addMatingRule(matingRuleEo);
    }

    @Override
    public ResponseDto<Void> updateMatingRule(MatingRuleEo matingRuleEo) {
        return matingRuleService.updateMatingRule(matingRuleEo);
    }

    @Override
    public  ResponseDto<Void> deleteMatingRule(Long mrId) {
        return matingRuleService.deleteMatingRule(mrId);
    }
}
