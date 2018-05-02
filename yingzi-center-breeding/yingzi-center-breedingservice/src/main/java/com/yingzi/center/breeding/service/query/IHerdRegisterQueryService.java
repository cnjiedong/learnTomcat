package com.yingzi.center.breeding.service.query;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;

/**
 * @ClassName: IHerdRegisterQueryService
 * @Description: (猪只档案查询服务类)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
public interface IHerdRegisterQueryService {
    /**分页查询猪只档案信息
     * @param request*/
    PageInfo<HerdRegisterDto> queryPageUser(HerdRegRequestDto request);

    /**根据id查询猪只档案信息*/
    public HerdRegisterDto queryDetailById(Long herdRegisterId);

}
