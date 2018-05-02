package com.yingzi.center.breeding.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.PeriodDto;
import com.yingzi.center.breeding.dto.PeriodRequestDto;
import com.yingzi.center.breeding.eo.PeriodEo;
import com.yingzi.center.breeding.mapper.PeriodMapper;
import com.yingzi.center.breeding.service.IPeriodService;

/**
 * @Description: 养殖账期
 * @author: codeMonkey_sun
 * 
 */
@Service("periodService")
public class PeriodServiceImpl implements IPeriodService {

	@Resource
    private PeriodMapper periodMapper;
	
	public long addPeriod(PeriodEo periodEo) {
		long ret = periodMapper.insert(periodEo);
		return ret;
    }

    public void updatePeriod(PeriodEo periodEo) {
    	periodMapper.updateSelective(periodEo);
    }

    public void deletePeriod(Long  periodId) {
    	periodMapper.deleteLogicById(PeriodEo.class, periodId, true);
    }
    
    public  PageInfo<PeriodDto> queryPageUser(PeriodRequestDto periodRequestDto) {
	       int pageNum =periodRequestDto.getPageNum();
	       int pageSize = periodRequestDto.getPageSize();
	       pageNum = pageNum<=0 ? 1 : pageNum;
	       pageSize = pageSize<=0 ? 20 : pageSize;
	       PageHelper.startPage(pageNum, pageSize);
	       Page<PeriodDto> page = periodMapper.pageQuery(periodRequestDto);
	       PageInfo<PeriodDto> pageInfo = new PageInfo<PeriodDto>(page);
	       return pageInfo;
	 }

	 public PeriodDto queryDetailById(Long periodId) {
		 PeriodEo periodEo = periodMapper.findById(PeriodEo.class, periodId);
		 PeriodDto periodDto = new PeriodDto();
	     BeanUtils.copyProperties(periodEo, periodDto);
	     periodDto.setId(String.valueOf(periodId));
	     return periodDto;
	 }
	 
	 public  PageInfo<PeriodDto> queryByPeriodYear(PeriodRequestDto periodRequestDto) {
		 int pageNum =periodRequestDto.getPageNum();
	       int pageSize = periodRequestDto.getPageSize();
	       pageNum = pageNum<=0 ? 1 : pageNum;
	       pageSize = pageSize<=0 ? 20 : pageSize;
	       PageHelper.startPage(pageNum, pageSize);
	       Page<PeriodDto> page = periodMapper.queryByPeriodYear(periodRequestDto, periodRequestDto.getPeriodYear());
	       PageInfo<PeriodDto> pageInfo = new PageInfo<PeriodDto>(page);
	       return pageInfo;
	 }
}
