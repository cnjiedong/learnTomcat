package com.yingzi.center.breeding.service.query;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.dto.PageInfoDto;

/**
 * @ClassName: IHnsInfoQueryService
 * @Description: (发情未配种服务类实现)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
public interface IHnsInfoQueryService {
    /**根据id查询发情未配种信息*/
    public HsnInfoDto queryDetailById(Long  hnsInfoId);
    /**分页查询发情未配种信息*/
    PageInfo<HsnInfoDto> pageQuery(PageInfoDto<HsnInfoDto> request);
}
