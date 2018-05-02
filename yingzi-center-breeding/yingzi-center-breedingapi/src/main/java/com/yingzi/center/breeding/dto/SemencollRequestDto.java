package com.yingzi.center.breeding.dto;

/**
 * Created by user22 on 2018/4/21.
 */
public class SemencollRequestDto {
    /**
     * 查询页数
     */
    private Integer pageNum;
    /**
     * 每页记录数
     **/
    private Integer pageSize;
    /**
     * 查询条件
     **/
    private SemencollDto param;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public SemencollDto getParam() {
        return param;
    }

    public void setParam(SemencollDto param) {
        this.param = param;
    }
}
