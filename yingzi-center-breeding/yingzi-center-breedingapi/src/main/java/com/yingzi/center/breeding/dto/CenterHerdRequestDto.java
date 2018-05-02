package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Table;
import java.util.Date;

/**
* @ClassName: CenterHerdRequestDto
* @Description: (种猪档案数据请求dto)
* @Author JIEDONG
* @Date 2018-04-019
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/

public class CenterHerdRequestDto extends BaseVo {
    /**
     * 查询页数
     */
    private int pageNum;
    /**
     * 每页记录数
     **/
    private int pageSize;

    private Long herdId;

    private String startTime;

    private String endTime;

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

    public Long getHerdId() {
        return herdId;
    }

    public void setHerdId(Long herdId) {
        this.herdId = herdId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
