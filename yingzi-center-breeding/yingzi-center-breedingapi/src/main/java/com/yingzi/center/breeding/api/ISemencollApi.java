package com.yingzi.center.breeding.api;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.eo.SemencollEo;

/**
 * @author hcp
 * Created by user22 on 2018/4/21.
 */
public interface ISemencollApi {

    /*
    * 新增采精信息
    * @param semencollEo
    * @return ResponseDto<Long>
     */
    ResponseDto<Long> addSemencoll(SemencollEo semencollEo);

    //更新采精信息
    ResponseDto<Void>	updateSemencoll(SemencollEo SemencollEo);

    //删除采精信息
    ResponseDto<Void>	deleteSemencoll(Long  semencollId);

}
