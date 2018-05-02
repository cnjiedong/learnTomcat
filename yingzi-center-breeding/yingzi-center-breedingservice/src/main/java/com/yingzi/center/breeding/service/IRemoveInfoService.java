package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.RemoveInfoDto;
import com.yingzi.center.breeding.dto.RemoveInfoRequestDto;
import com.yingzi.center.breeding.eo.RemoveInfoEo;


/**
 *离场service接口IRemoveInfoService
 * @author user18
 * @date 2018/4/20
 */
public interface IRemoveInfoService {

    /**
     * 新增离场记录
     * @param removeInfoEo
     * @return
     */
    public ResponseDto<Long> addRemove(RemoveInfoEo removeInfoEo);

    /**
     * 更新离场记录
     * @param removeInfoEo
     * @return
     */
    public ResponseDto<Void> updateRemoveInfo(RemoveInfoEo removeInfoEo);

    /**
     * 删除离场记录
     * @param removeInfoId
     * @return
     */
    public ResponseDto<Void> deleteRemoveInfo(Long removeInfoId);

}
