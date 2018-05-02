package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import org.springframework.beans.BeanUtils;

import java.util.List;

public interface IBreadSetQueryApi {

    //分页查询
    public ResponseDto<PageInfo<BreedingSetDto>> pageQuery(PageInfoDto<BreedingSetDto> request);

    //测试分页查询的返回对象，Page对象从中心服务返回到应用服务，对象内部数据出现异常
    public ResponseDto<Page<BreedingSetEo>>   testPageQuery(PageInfoDto<BreedingSetDto> request);
}
