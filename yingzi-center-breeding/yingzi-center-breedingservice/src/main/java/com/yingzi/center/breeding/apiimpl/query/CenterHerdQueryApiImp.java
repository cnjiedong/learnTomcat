package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.ICenterHerdQueryApi;
import com.yingzi.center.breeding.dto.CenterHerdDto;
import com.yingzi.center.breeding.dto.CenterHerdRequestDto;
import com.yingzi.center.breeding.eo.CenterHerdEo;
import com.yingzi.center.breeding.service.query.ICenterHerdQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("centerHerdQueryApi")
public class CenterHerdQueryApiImp implements ICenterHerdQueryApi {

    /**品种Mapper类*/
    @Resource
    private ICenterHerdQueryService centerHerdQueryService;

    //分页查询孕检列表
    @Override
    public ResponseDto<PageInfo<CenterHerdEo>> queryPageUser(CenterHerdRequestDto centerHerdRequestDto){
          return new ResponseDto<>(centerHerdQueryService.queryPage(centerHerdRequestDto));
    }

    public int addHerd(CenterHerdDto centerHerdDto){
        return centerHerdQueryService.addHerd(centerHerdDto);
    }

}
