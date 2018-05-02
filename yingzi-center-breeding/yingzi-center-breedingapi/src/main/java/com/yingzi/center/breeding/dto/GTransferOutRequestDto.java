package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

@SuppressWarnings("serial")
public class GTransferOutRequestDto extends BaseVo {
	/**
     * 查询页数
     */
    private int pageNum;
    /**
     * 每页记录数
     **/
    private int pageSize;

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
}
