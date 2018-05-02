package com.yingzi.center.breeding.apiimpl.query;


import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.api.query.IQueryBreadSetApi;
import com.yingzi.center.breeding.api.query.IQueryFarrowSetApi;
import com.yingzi.center.breeding.dto.BatchDelDto;
import com.yingzi.center.breeding.dto.BreedingSetDto;
import com.yingzi.center.breeding.dto.FarrowingSetDto;
import com.yingzi.center.breeding.dto.PageInfoDto;
import com.yingzi.center.breeding.eo.BreedingSetEo;
import com.yingzi.center.breeding.eo.FarrowingSetEo;
import com.yingzi.center.breeding.mapper.BreedSetMapper;
import com.yingzi.center.breeding.mapper.FarrowSetMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service("farrowSetService")
public class QueryFarrowSetApiImp implements IQueryFarrowSetApi {

    /**分娩Mapper类*/
    @Resource
    private FarrowSetMapper farrowSetMapper;

    public long insert(FarrowingSetEo farrowingSetEo) {
        long ret = farrowSetMapper.insert(farrowingSetEo);
        return ret;
    }


    public PageInfo<FarrowingSetDto> pageQuery(PageInfoDto<FarrowingSetDto> request) {

        int pageNum = request.getPageNum();
        int pageSize = request.getPageSize();
        pageNum = pageNum<=0 ? 1 : pageNum;
        pageSize = pageSize<=0 ? 20 : pageSize;

        PageHelper.startPage(pageNum, pageSize);
        Page<FarrowingSetDto> list = (Page<FarrowingSetDto>)farrowSetMapper.pageQuery(request.getParam());

//        Page<FarrowingSetDto> newList = new Page<FarrowingSetDto>();
//        newList.setPageNum(list.getPageNum());
//        newList.setPageSize(list.getPageSize());
//        newList.setStartRow(list.getStartRow());
//        newList.setEndRow(list.getEndRow());
//        newList.setTotal(list.getTotal());
//        newList.setPages(list.getPages());
//        newList.setCount(list.isCount());
//
//        for (FarrowingSetDto eo : list) {
//            FarrowingSetDto dto = new FarrowingSetDto();
//            dto.setId(String.valueOf(eo.getId()));
//            dto.setBirthingdate(eo.getBirthingdate());
//            dto.setHerd_id(eo.getHerd_id());
//            dto.setLitterid(eo.getLitterid());
//            dto.setLocation(eo.getLocation());
//            dto.setLiveborn(eo.getLiveborn());
//            dto.setGoodborn(eo.getGoodborn());
//            dto.setWeekborn(eo.getWeekborn());
//            dto.setFreakyborn(eo.getFreakyborn());
//            dto.setStillborn(eo.getStillborn());
//
//            dto.setMummies(eo.getMummies());
//            dto.setTotalweight(eo.getTotalweight());
//            dto.setNetfosters(eo.getNetfosters());
//            dto.setInduced(eo.getInduced());
//
//
//            dto.setProblem(eo.getProblem());
//            dto.setFcomment(eo.getFcomment());
//
//            System.out.println(dto.getHerd_id());
//
//            newList.add(dto);
//        }
        PageInfo<FarrowingSetDto> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public int update( FarrowingSetEo farrowingSetEo){
        return farrowSetMapper.update(farrowingSetEo);
    }

    public int delete( FarrowingSetDto farrowingSetDto){
        long id = Long.valueOf(farrowingSetDto.getId());
        return farrowSetMapper.deleteByFarrowingId(id);
    }


    public int deleteBatch(BatchDelDto batchDelDto){
        int size = batchDelDto.getList().size();
        Long[] ids = batchDelDto.toArray();
        //return 0;
        return farrowSetMapper.deleteLogicBatchIds(  FarrowingSetEo.class, ids,true);
    }



//    public Page<FarrowingSetEo> testPageQuery(PageInfoDto<FarrowingSetDto> request){
//        int pageNum = request.getPageNum();
//        int pageSize = request.getPageSize();
//        pageNum = pageNum<=0 ? 1 : pageNum;
//        pageSize = pageSize<=0 ? 20 : pageSize;
//
//        PageHelper.startPage(pageNum, pageSize);
//        Page<FarrowingSetDto> list = (Page<FarrowingSetDto>)farrowSetMapper.pageQuery(request.getParam());
//
//        long total = list.getTotal();
//        System.out.println(total);
//        Page<FarrowingSetDto> newList = new Page<FarrowingSetDto>();
//        newList.setPageNum(list.getPageNum());
//        newList.setPageSize(list.getPageSize());
//        newList.setStartRow(list.getStartRow());
//        newList.setEndRow(list.getEndRow());
//        newList.setTotal(list.getTotal());
//        newList.setPages(list.getPages());
//        newList.setCount(list.isCount());
//
//        for (FarrowingSetDto eo : list) {
//            FarrowingSetDto dto = new FarrowingSetDto();
//            dto.setId(String.valueOf(eo.getId()));
//
//            dto.setComment(eo.getComment());
//            dto.setProblem(eo.getProblem());
//            newList.add(dto);
//        }
//        PageInfo<FarrowingSetDto> pageInfo = new PageInfo<FarrowingSetDto>(newList);
//        return list;
//    }


    public ResponseDto<FarrowingSetDto> queryDetailById(Long mrID) {
        FarrowingSetDto matingRuleDto = farrowSetMapper.queryDetailById(mrID);
        return new ResponseDto<>(matingRuleDto);
    }
}
