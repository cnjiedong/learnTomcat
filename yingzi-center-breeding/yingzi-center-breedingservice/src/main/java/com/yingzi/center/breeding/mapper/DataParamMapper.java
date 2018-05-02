package com.yingzi.center.breeding.mapper;
import com.dtyunxi.huieryun.ds.BaseMapper;
import com.github.pagehelper.Page;
import com.yingzi.center.breeding.dto.DataParamDto;
import com.yingzi.center.breeding.eo.DataParamEo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface DataParamMapper extends BaseMapper<DataParamEo> {


    @Select({"<script>" +
            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,fenable,fcode,param_value,param_desc" +
            " from bc_set_dataparam" +
            " where dr = 0  " +
            "</script>"})
    public List<DataParamEo> queryPageUser(DataParamDto request);

//    @Select({"<script>" +
//            " select id,tenant_id,dr,create_person,create_time,update_person,update_time,fenable,fcode,param_desc,param_value" +
//            " from bc_set_dataparam" +
//            " where dr = 0  " +
//            " and id = #{id}  " +
//            "</script>"})
//    public DataParamDto queryDetailById(@Param("id") long id);

//    @Update({"<script>" +
//            " update " +
//            " bc_set_dataparam" +
//            " set dr = 1" +
//            " where id = #{id}  " +
//            "</script>"})
//    public void deleteByDataParamId(@Param("id") long id);
}