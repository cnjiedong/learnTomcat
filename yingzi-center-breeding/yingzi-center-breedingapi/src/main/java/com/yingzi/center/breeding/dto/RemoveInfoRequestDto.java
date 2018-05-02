package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 *离场分页单
 * @author user18
 * @date 2018/4/20
 */
public class RemoveInfoRequestDto extends BaseVo {
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
    private RemoveInfoDto param;

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

    public RemoveInfoDto getParam() {
        return param;
    }

    public void setParam(RemoveInfoDto param) {
        this.param = param;
    }
}
