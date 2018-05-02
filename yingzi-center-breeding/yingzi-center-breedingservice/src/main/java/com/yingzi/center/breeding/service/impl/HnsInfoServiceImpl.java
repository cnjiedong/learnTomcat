package com.yingzi.center.breeding.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HsnInfoDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.HnsInfoEo;
import com.yingzi.center.breeding.mapper.HnsInfoMapper;
import com.yingzi.center.breeding.service.IHnsInfoService;
import com.github.pagehelper.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
/**
 * * @ClassName: HnsInfoServiceImpl
 * @Description: (发情未配种表内部Service接口实现)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd.
 */


@Service("hnsInfoService")
public class HnsInfoServiceImpl implements IHnsInfoService {
    /**发情未配种Mapper类*/
    @Resource
    private HnsInfoMapper hnsInfoMapper;

    /**新增发情未配种信息*/
    @Override
    public long insert(HnsInfoEo hnsInfoEo) {
        long ret = hnsInfoMapper.insert(hnsInfoEo);
        return ret;
    }
    public void setHnsInfoMapper(HnsInfoMapper hnsInfoMapper) {
        this.hnsInfoMapper = hnsInfoMapper;
    }


    /**更新发情未配种信息*/
    @Override
    public void update( HnsInfoEo hnsInfoEo){
        System.out.println(hnsInfoEo.toString());
        hnsInfoMapper.updateSelective(hnsInfoEo);
    }

    /**删除发情未配种信息*/
    @Override
    public void  delete( Long  hnsInfoId) {

         hnsInfoMapper.deleteByHnsInfoId(hnsInfoId);
    }


}
