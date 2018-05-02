package com.yingzi.center.breeding.dto;

/**
 * @ClassName: HerdRegRuqestDto
 * @Description: (猪只档案查询)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
public class HerdRegRequestDto {
    /**
     * 查询页数
     */
    private int pageNum;
    /**
     * 每页记录数
     **/
    private int pageSize;

    private HerdRegisterDto prarm;

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

    public void setPrarm(HerdRegisterDto prarm) {
        this.prarm = prarm;
    }

    public HerdRegisterDto getParam() {
        return prarm;
    }
}
