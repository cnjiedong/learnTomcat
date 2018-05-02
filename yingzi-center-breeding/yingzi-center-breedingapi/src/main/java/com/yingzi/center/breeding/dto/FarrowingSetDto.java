package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
* @ClassName: FarrowingSetEo
* @Description: (分娩单)
* @Author shq
* @Date 2018-04-19
* @Version V1.0
* @Copyright Guangzhou Shadow Holding Co.,Ltd
*/


public class FarrowingSetDto extends BaseVo{

    /**ID**/
    @Id
    protected String id;

    /*事件日期*/
    private String birthingdate;//uncertain
    /**档案id*/
    @Column(name = "herd_id")
    private  long herdId;
    /**窝号*/

    private Integer litterid;
    /*位置*/

    private  String location;
    /**活仔*/

    private  Integer liveborn;
    /*健仔*/

    private  Integer goodborn;
    /**弱仔*/

    private  Integer weekborn;
    /*畸形*/

    private  Integer freakyborn;
    /**死胎*/

    private  Integer stillborn;
    /*木乃伊*/

    private  Integer mummies;
    /**窝重*/

    private  double totalweight;
    /**净寄养头数*/

    private  Integer netfosters;
    /*问题*/

    private  String problem;
    /**引产*/

    private  String induced;
    /**备注*/

    private  String fcomment;

    /**启用状态 0-启用,1-禁用*/
    public String getBirthingdate() {
        return birthingdate;
    }

    public void setBirthingdate(String birthingdate) {
        this.birthingdate = birthingdate;
    }

    public long getHerdId() {
        return herdId;
    }

    public void setHerdId(long herdId) {
        this.herdId = herdId;
    }

    public Integer getLitterid() {
        return litterid;
    }

    public void setLitterid(Integer litterid) {
        this.litterid = litterid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getLiveborn() {
        return liveborn;
    }

    public void setLiveborn(Integer liveborn) {
        this.liveborn = liveborn;
    }

    public Integer getGoodborn() {
        return goodborn;
    }

    public void setGoodborn(Integer goodborn) {
        this.goodborn = goodborn;
    }

    public Integer getWeekborn() {
        return weekborn;
    }

    public void setWeekborn(Integer weekborn) {
        this.weekborn = weekborn;
    }

    public Integer getFreakyborn() {
        return freakyborn;
    }

    public void setFreakyborn(Integer freakyborn) {
        this.freakyborn = freakyborn;
    }

    public Integer getStillborn() {
        return stillborn;
    }

    public void setStillborn(Integer stillborn) {
        this.stillborn = stillborn;
    }

    public Integer getMummies() {
        return mummies;
    }

    public void setMummies(Integer mummies) {
        this.mummies = mummies;
    }

    public double getTotalweight() {
        return totalweight;
    }

    public void setTotalweight(double totalweight) {
        this.totalweight = totalweight;
    }

    public Integer getNetfosters() {
        return netfosters;
    }

    public void setNetfosters(Integer netfosters) {
        this.netfosters = netfosters;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getInduced() {
        return induced;
    }

    public void setInduced(String induced) {
        this.induced = induced;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
