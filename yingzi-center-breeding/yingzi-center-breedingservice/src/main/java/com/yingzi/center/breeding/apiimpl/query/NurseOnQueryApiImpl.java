package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.INurseOnQueryApi;
import com.yingzi.center.breeding.dto.NurseOnDto;
import com.yingzi.center.breeding.dto.NurseOnRequestDto;
import com.yingzi.center.breeding.service.query.INurseOnQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
@Service("nurseOnQueryApi")
public class NurseOnQueryApiImpl implements INurseOnQueryApi {

    @Resource
    private INurseOnQueryService nurseOnQueryService;

    @Override
    public ResponseDto<PageInfo<NurseOnDto>> queryPageUser(NurseOnRequestDto request) {
        return nurseOnQueryService.queryPageUser(request);
    }

    @Override
    public ResponseDto<NurseOnDto> queryDetailById(Long nurseOnId) {
        return nurseOnQueryService.queryDetailById(nurseOnId);
    }
}
