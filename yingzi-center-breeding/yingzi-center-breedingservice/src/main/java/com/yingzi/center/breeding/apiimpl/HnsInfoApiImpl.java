package com.yingzi.center.breeding.apiimpl;


import com.yingzi.center.breeding.api.IHnsInfoApi;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.eo.HnsInfoEo;
import com.yingzi.center.breeding.service.IHnsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * * @ClassName: HnsInfoApiaImpl
 * @Description: (发情未配种表增删改实现类)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd.
 */

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("hnsInfoApi")

public class HnsInfoApiImpl  implements IHnsInfoApi {

    @Resource
    IHnsInfoService hnsInfoService;

    /**新增发情未配种信息*/
    @Override
    public long insert(HnsInfoEo hnsInfoSetEo) {
        long ret = hnsInfoService.insert(hnsInfoSetEo);
        return ret;
    }

    /**更新发情未配种信息*/
    @Override
    public void update(HnsInfoEo hnsInfoEo){
        hnsInfoService.update(hnsInfoEo);
    }

    /**删除发情未配种信息*/
    @Override
    public void delete(HsnInfoDto hsnInfoDto) {
        long id = Long.valueOf(hsnInfoDto.getId());
        hnsInfoService.delete(id);
    }


}
