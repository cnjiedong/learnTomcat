package com.yingzi.center.breeding.service;

import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.HnsInfoEo;

import javax.persistence.Version;
import java.lang.reflect.InvocationTargetException;
/**
 * * @ClassName: HnsInfoService
 * @Description: (发情未配种表内部Service接口实现)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd.
 */

public interface IHnsInfoService  {
   /**新增发情未配种信息*/
    long insert(HnsInfoEo hnsInfoEo);



    /**更新发情未配种信息*/
    void update( HnsInfoEo hnsInfoEo);

    /**删除发情未配种信息*/
    void delete( Long  hnsInfoId);



}
