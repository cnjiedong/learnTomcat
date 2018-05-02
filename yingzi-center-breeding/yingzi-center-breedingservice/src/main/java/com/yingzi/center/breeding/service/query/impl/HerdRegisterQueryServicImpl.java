package com.yingzi.center.breeding.service.query.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.CheckInfoDto;
import com.yingzi.center.breeding.dto.HerdRegRequestDto;
import com.yingzi.center.breeding.dto.HerdRegisterDto;
import com.yingzi.center.breeding.eo.CheckInfoEo;
import com.yingzi.center.breeding.eo.HerdRegisterEo;
import com.yingzi.center.breeding.mapper.HerdRegisterMapper;
import com.yingzi.center.breeding.service.query.IHerdRegisterQueryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: IHerdRegisterQueryService
 * @Description: (猪只档案查询服务类实现)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Service("herdRegisterQueryService")
public class HerdRegisterQueryServicImpl implements IHerdRegisterQueryService {

    @Resource
    private HerdRegisterMapper herdRegisterMapper;

    @Override
    /**分页查询猪只档案信息*/
    public PageInfo<HerdRegisterDto> queryPageUser(HerdRegRequestDto request) {
        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<HerdRegisterDto> page = herdRegisterMapper.queryPageUser(request.getParam());
        PageInfo<HerdRegisterDto> pageInfo = new PageInfo<HerdRegisterDto>(page);
        return pageInfo;
    }

    @Override
    /**根据id查询猪只档案信息*/
    public HerdRegisterDto queryDetailById(Long herdRegisterId) {
        HerdRegisterEo herdRegisterEo = herdRegisterMapper.findById(HerdRegisterEo.class,herdRegisterId);
        HerdRegisterDto herdRegisterDto = new HerdRegisterDto();
        if(herdRegisterEo == null){
            return null;
        }
        BeanUtils.copyProperties(herdRegisterEo, herdRegisterDto);
        herdRegisterDto.setId(String.valueOf(herdRegisterEo.getId()));
        return herdRegisterDto;
    }
}
