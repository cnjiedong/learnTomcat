package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.PWDeathsEo;

/**
 * 断奶前死亡
 * Created by user38 on 2018/4/25.
 */
public interface IPWDeathsApi {
    /**
     * 新增断奶前死亡信息
     * @param pWDeathsEo
     * @return
     */
    ResponseDto<Long> addPWDeaths(PWDeathsEo pWDeathsEo);

    /**
     * 更新断奶前死亡信息
     * @param pWDeathsEo
     * @return
     */
    ResponseDto<Void> updatePWDeaths(PWDeathsEo pWDeathsEo);

    /**
     * 删除断奶前死亡信息
     * @param pWDeathsId
     * @return
     */
    ResponseDto<Void> deletePWDeaths(Long  pWDeathsId);
}
