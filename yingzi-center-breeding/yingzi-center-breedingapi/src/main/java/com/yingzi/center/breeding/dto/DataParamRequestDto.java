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


public class DataParamRequestDto extends BaseVo {
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
    private DataParamDto param;

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

    public DataParamDto getParam() {
        return param;
    }

    public void setParam(DataParamDto param) {
        this.param = param;
    }
}
