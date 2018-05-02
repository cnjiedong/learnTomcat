package com.yingzi.center.breeding.apiimpl;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.api.IEntryToBhApi;
import com.yingzi.center.breeding.eo.EntryToBhEo;
import com.yingzi.center.breeding.service.IEntryToBhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hpx
 * @Date 2018/4/24
 */
@Service("entryToBhApi")
public class EntryToBhApiImpl implements IEntryToBhApi {

    @Resource
    private IEntryToBhService entryToBhService;

    @Override
    public ResponseDto<Long> addEntryToBh(EntryToBhEo entryToBhEo) {
        return entryToBhService.addEntryToBh(entryToBhEo);
    }

    @Override
    public ResponseDto<Void> updateEntryToBh(EntryToBhEo entryToBhEo) {
        return entryToBhService.update(entryToBhEo);
    }

    @Override
    public ResponseDto<Void> deleteEntryToBh(long entryToBhId) {
        return entryToBhService.delete(entryToBhId);
    }
}
