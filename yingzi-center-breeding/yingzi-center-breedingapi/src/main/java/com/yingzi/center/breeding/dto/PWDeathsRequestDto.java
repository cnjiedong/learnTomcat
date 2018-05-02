package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

/**
 * 断奶前死亡
 * Created by user38 on 2018/4/25.
 */
public class PWDeathsRequestDto extends BaseVo {

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
    private PWDeathsDto param;

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

    public PWDeathsDto getParam() {
        return param;
    }

    public void setParam(PWDeathsDto param) {
        this.param = param;
    }
}
