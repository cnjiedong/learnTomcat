package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;

import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;

import com.yingzi.center.breeding.eo.HerdRegisterEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
/**
 * @ClassName: HerdRegisterMapper
 * @Description: (猪只档案Mapper)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
public interface HerdRegisterMapper extends BaseMapper<HerdRegisterEo> {
    /**分页查询猪只档案信息*/
    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id,herd_id,event_id,evdate,sex,breeding,birthdate,litterid,sourcetype,source,iniparity,inillocation,fatherid,motherid,weight,price,fcomment" +
            " from bc_herd_register" +
            " where dr = 0  "+
            "</script>"})
    public Page<HerdRegisterDto> queryPageUser(HerdRegisterDto request);
}
