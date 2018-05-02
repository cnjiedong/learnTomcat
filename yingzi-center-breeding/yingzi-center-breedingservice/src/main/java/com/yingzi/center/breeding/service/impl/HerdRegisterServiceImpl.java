package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;
import com.yingzi.center.breeding.eo.CheckInfoEo;
import com.yingzi.center.breeding.eo.HerdRegisterEo;
import com.yingzi.center.breeding.mapper.HerdRegisterMapper;
import com.yingzi.center.breeding.service.IHerdRegisterService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: HerdRegisterServiceImpl
 * @Description: (猪只档案服务类实现)
 * @Author zxma
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Service("herdRegisterService")
public class HerdRegisterServiceImpl implements IHerdRegisterService {
    /**品种Mapper类*/
    @Resource
    private HerdRegisterMapper herdRegisterMapper;
    //@Resource
    //CheckInfoDas checkInfoDas;
    @Override

    /**新增猪只档案信息*/
    public ResponseDto<Long> insert(HerdRegisterEo herdRegisterEo){
        long id = herdRegisterMapper.insert(herdRegisterEo);
        ResponseDto<Long> result= new ResponseDto<>();
        String ret1 = id > 0 ? "SUCCESS":"FAILED";
        Long ret2 = id > 0 ? 1L:0L;
        result.setResult(ret1);
        result.setData(ret2);
        return result;
    }


    @Override
    /**更新猪只档案信息*/
    public void update(HerdRegisterEo herdRegisterEo){
        herdRegisterMapper.updateSelective(herdRegisterEo);
    }




    @Override
    /**删除猪只档案信息*/
    public void delete(Long herdRegisterId) {
        herdRegisterMapper.deleteLogicById(HerdRegisterEo.class, herdRegisterId, true);
    }


}
