package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.eo.WeaningEo;
import com.yingzi.center.breeding.mapper.WeaningMapper;
import com.yingzi.center.breeding.service.IWeaningService;
import com.yingzi.center.breeding.dto.WeaningDto;
import com.yingzi.center.breeding.dto.WeaningRequestDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import sun.security.x509.RDN;

import javax.annotation.Resource;

/**
 * Created by user14 on 2018/4/18.
 * @author gaocheng
 */
@Service("weaningService")
public class WeaningServiceImpl implements IWeaningService {

    @Resource
    private WeaningMapper weaningMapper;

    @Override
    public ResponseDto<Long> addWeaning(WeaningEo weaningEo) {
        long id = weaningMapper.insert(weaningEo);
        ResponseDto<Long> result= new ResponseDto<>();
        String ret1 = id > 0 ? "SUCCESS":"FAILED";
        Long ret2 = id > 0 ? 1L:0L;
        result.setResult(ret1);
        result.setData(ret2);
        return result;
    }

    @Override
    public ResponseDto<Void> update(WeaningEo weaningEo) {
        weaningMapper.updateWianingById(weaningEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> delete(long weaningId) {
        weaningMapper.deleteByWeaningId(weaningId);
        return ResponseDto.VOID;
    }

}
