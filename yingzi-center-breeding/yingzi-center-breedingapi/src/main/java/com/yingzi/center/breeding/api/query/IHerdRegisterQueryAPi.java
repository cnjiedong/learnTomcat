package com.yingzi.center.breeding.api.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;

/**
 * @ClassName: IHerdRegisterQueryAPi
 * @Description: (猪只档案查询接口)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
public interface IHerdRegisterQueryAPi {
    /**分页查询信息*/
    public PageInfo<HerdRegisterDto> queryPageUser(HerdRegRequestDto request);
    /**根据id查询信息
     * @param herdRegisterId*/
    public ResponseDto<HerdRegisterDto> queryDetailById(Long herdRegisterId);
}
