package com.yingzi.center.breeding.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.GTransferOutDto;
import com.yingzi.center.breeding.dto.GTransferOutRequestDto;
import com.yingzi.center.breeding.dto.GroupIdDto;
import com.yingzi.center.breeding.eo.GTransferOutEo;
import com.yingzi.center.breeding.mapper.GTransferOutMapper;
import com.yingzi.center.breeding.service.IGTransferOutService;

/**
 * @Description: 转群
 * @author: codeMonkey_sun
 * 
 */
@Service("gTransferOutService")
public class GTransferOutServiceImpl implements IGTransferOutService {

	@Resource
	private GTransferOutMapper gTransferOutMapper;
	
	public long addGTransferOut(GTransferOutEo gTransferOutEo) {
		long ret = gTransferOutMapper.insert(gTransferOutEo);
		return ret;
    }
    
    public void updateGTransferOut(GTransferOutEo gTransferOutEo) {
        gTransferOutMapper.updateSelective(gTransferOutEo);
    }

    public void deleteGTransferOut(Long gTransferOutId) {
        gTransferOutMapper.deleteLogicById(GTransferOutEo.class, gTransferOutId, true);
    }
    
    public PageInfo<GTransferOutDto> queryPageUser(GTransferOutRequestDto gTransferOutRequestDto) {
		int pageNum = gTransferOutRequestDto.getPageNum();
	    int pageSize = gTransferOutRequestDto.getPageSize();
	    pageNum = pageNum<=0 ? 1 : pageNum;
	    pageSize = pageSize<=0 ? 20 : pageSize;
	    PageHelper.startPage(pageNum, pageSize);
	    Page<GTransferOutDto> page = gTransferOutMapper.pageQuery(gTransferOutRequestDto);
	    PageInfo<GTransferOutDto> pageInfo = new PageInfo<GTransferOutDto>(page);
	    return pageInfo;
	}
	
	public GTransferOutDto queryDetailById(Long gTransferOutId) {
		GTransferOutEo gTransferOutEo = gTransferOutMapper.findById(GTransferOutEo.class, gTransferOutId);
		GTransferOutDto gTransferOutDto = new GTransferOutDto();
        BeanUtils.copyProperties(gTransferOutEo, gTransferOutDto);
        gTransferOutDto.setId(String.valueOf(gTransferOutId));
        return gTransferOutDto;
    }
	
	public  PageInfo<GroupIdDto> queryGroupId(GTransferOutRequestDto gTransferOutRequestDto) {
		int pageNum = gTransferOutRequestDto.getPageNum();
	    int pageSize = gTransferOutRequestDto.getPageSize();
	    pageNum = pageNum<=0 ? 1 : pageNum;
	    pageSize = pageSize<=0 ? 20 : pageSize;
	    PageHelper.startPage(pageNum, pageSize);
	    Page<GroupIdDto> page = gTransferOutMapper.queryGroupId(gTransferOutRequestDto);
	    PageInfo<GroupIdDto> pageInfo = new PageInfo<GroupIdDto>(page);
	    return pageInfo;
	 }
}
