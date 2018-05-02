package com.yingzi.center.breeding.api;


import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.eo.HnsInfoEo;


public interface IHnsInfoApi {

    /**新增发情未配种信息*/
    public long insert(HnsInfoEo hnsInfoEo);


    /**更新发情未配种信息*/
    public void update( HnsInfoEo hnsInfoEo);


    /**删除发情未配种信息*/
    public void delete(HsnInfoDto hsnInfoDto);

}
