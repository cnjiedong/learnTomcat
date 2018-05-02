/**
 * @(#) DemoMapper.java 1.0 2018-01-25
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.mapper;

import com.dtyunxi.huieryun.ds.BaseMapper;
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.dto.SemencollDto;
import com.yingzi.center.breeding.eo.DemoEo;
import com.yingzi.center.breeding.eo.SemencollEo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 采精
 *20180421
 * @author hcp
 * @since 1.0.0
 */
public interface SemenCollectionMapper extends BaseMapper<SemencollEo>{
//    @Update({"<script>" +
//            " update " +
//            " bc_semen_collection" +
//            " set dr = 1" +
//            " where id = #{id}  " +
//            "</script>"})
//    public void deleteBySemenCollectionId(@Param("id") long id);

//    @Select({"<script>" +
//            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id,collectiondate,farm_id,herd_id,male_id, " +
//            " semen_id,dosage,exp_dosage,fcolour,unit_activity,attenuation_activity,sperm_activity,assess,technician,gelatineous,suitable,fcomment" +
//            " from bc_semen_collection" +
//            " where dr = 0  " +
//            " and id = #{id}  " +
//            "</script>"})
//    public SemencollEo queryDetailById(@Param("id") long id);

    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,master_org_id,collectiondate,farm_id,herd_id,male_id, " +
            " semen_id,dosage,exp_dosage,fcolour,unit_activity,attenuation_activity,sperm_activity,assess,technician,gelatineous,suitable,fcomment" +
            " from bc_semen_collection" +
            " where dr = 0  " +
//            " <if test=\"farm_id != null and farm_id != '' \"> " +
//            " and farm_id = #{farm_id}" +
//            " </if>" +
//            " <if test=\"master_org_id != null and master_org_id != '' \"> " +
//            " and master_org_id = #{master_org_id}" +
//            " </if>" +
            "</script>"})
    public List<SemencollEo> queryPageUser(SemencollDto semencollDto);
}
