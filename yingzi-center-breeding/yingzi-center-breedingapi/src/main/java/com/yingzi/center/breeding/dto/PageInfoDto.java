package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * @ClassName: BreedingSetEo
 * @Description: (品种设置单)
 * @Author jd
 * @Date 2018-04-09
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */


public class PageInfoDto<T> extends BaseVo {
    /**
     * 查询页数
     */
    private int pageNum;
    /**
     * 每页记录数
     **/
    private int pageSize;
    /**
     * 查询条件
     **/
    private T param;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}
