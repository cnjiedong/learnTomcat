package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.dto.PageInfoDto;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by user09 on 2018/4/27.
 */
public interface IHnsInfoQueryApi {
    /**分页查询*/
    public PageInfo<HsnInfoDto> pageQuery(PageInfoDto<HsnInfoDto> request);
    /**根据id查询信息*/
    public ResponseDto<HsnInfoDto> queryDetailById(Long hsnInfoDto) throws InvocationTargetException, IllegalAccessException;


}
