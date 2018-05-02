package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * @author hpx
 * @Date 2018/4/25
 */
public class MatingRequestDto extends BaseVo {
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
