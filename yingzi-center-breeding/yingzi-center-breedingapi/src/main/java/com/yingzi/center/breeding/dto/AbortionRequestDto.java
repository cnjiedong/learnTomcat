package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * Created by user26 on 2018/4/24.
 */
public class AbortionRequestDto extends BaseVo {
    /**分页页数*/
    private Integer pageNum;

    /**页面大小*/
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
