package com.yingzi.center.breeding.apiimpl.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;


import com.yingzi.center.breeding.api.query.IHerdRegisterQueryAPi;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;

import com.yingzi.center.breeding.service.query.impl.HerdRegisterQueryServicImpl;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @ClassName: HerdRegisterQueryApiImpl
 * @Description: (猪只档案查询接口实现)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Service("herdRegisterQueryApi")
public class HerdRegisterQueryApiImpl implements IHerdRegisterQueryAPi {
    @Resource
    private HerdRegisterQueryServicImpl herdRegisterQueryServic;
//
    /**分页查询猪只档案信息
     * @param request*/
    @Override
    public PageInfo<HerdRegisterDto> queryPageUser(HerdRegRequestDto request) {
        PageInfo<HerdRegisterDto> pageInfo = herdRegisterQueryServic.queryPageUser(request);
        return pageInfo;
    }


/**根据id查询猪只档案信息

 * @param herdRegisterId*/
@Override
public ResponseDto<HerdRegisterDto> queryDetailById(Long herdRegisterId) {
        HerdRegisterDto herdRegisterDto = herdRegisterQueryServic.queryDetailById(herdRegisterId);
        return new ResponseDto<HerdRegisterDto>(herdRegisterDto);
        }


}
