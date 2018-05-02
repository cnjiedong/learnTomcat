package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IHnsInfoQueryApi;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.service.impl.HnsInfoServiceImpl;
import com.yingzi.center.breeding.service.query.impl.HnsInfoQueryServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: HnsInfoQueryApiImpl
 * @Description: (发情未配种查询接口实现)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Service("hnsInfoQueryApi")
public class HnsInfoQueryApiImpl implements IHnsInfoQueryApi {
    @Resource
    private HnsInfoQueryServiceImpl hnsInfoQueryService;
//
    /**分页查询猪只档案信息*/

    @Override
    public PageInfo<HsnInfoDto> pageQuery(PageInfoDto<HsnInfoDto> request) {
        PageInfo<HsnInfoDto> pageInfo = hnsInfoQueryService.pageQuery(request);
        return pageInfo;
    }

    /**根据id查询猪只档案信息*/

    @Override
    public ResponseDto<HsnInfoDto> queryDetailById(Long hnsInfoId) throws InvocationTargetException, IllegalAccessException {
        HsnInfoDto hsnInfoDto = hnsInfoQueryService.queryDetailById(hnsInfoId);
        return new ResponseDto<HsnInfoDto>(hsnInfoDto);
    }


}
