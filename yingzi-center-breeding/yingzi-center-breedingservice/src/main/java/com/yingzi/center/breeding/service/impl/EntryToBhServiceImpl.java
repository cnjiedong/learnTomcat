package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.EntryToBhEo;
import com.yingzi.center.breeding.mapper.EntryToBhMapper;
import com.yingzi.center.breeding.service.IEntryToBhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/24
 */
@Service("entryToBhService")
public class EntryToBhServiceImpl implements IEntryToBhService {

    @Resource
    private EntryToBhMapper entryToBhMapper;

    @Override
    public ResponseDto<Long> addEntryToBh(EntryToBhEo entryToBhEo) {
        long id = entryToBhMapper.insert(entryToBhEo);
        ResponseDto<Long> result= new ResponseDto<>();
        String ret1 = id > 0 ? "SUCCESS":"FAILED";
        Long ret2 = id > 0 ? 1L:0L;
        result.setResult(ret1);
        result.setData(ret2);
        return result;
    }

    @Override
    public ResponseDto<Void> update(EntryToBhEo entryToBhEo) {
        entryToBhMapper.updateEntryToBhById(entryToBhEo);
        return ResponseDto.VOID;
    }

    @Override
    public ResponseDto<Void> delete(long entryToBhId) {
        entryToBhMapper.deleteByEntryToBhId(entryToBhId);
        return ResponseDto.VOID;
    }
}
