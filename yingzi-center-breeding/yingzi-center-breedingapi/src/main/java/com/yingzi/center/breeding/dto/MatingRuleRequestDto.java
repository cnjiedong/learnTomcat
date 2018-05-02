package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * Created by user08 on 2018/4/21.
 */
public class MatingRuleRequestDto extends BaseVo {
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
    private MatingRuleDto param;

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

    public MatingRuleDto getParam() {
        return param;
    }

    public void setParam(MatingRuleDto param) {
        this.param = param;
    }



}
