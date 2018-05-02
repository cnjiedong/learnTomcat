package com.yingzi.center.breeding.service;

import com.dtyunxi.dto.ResponseDto;
import com.yingzi.center.breeding.dto.SemencollDto;
import com.yingzi.center.breeding.eo.SemencollEo;

import java.util.List;

/**
 * @author hcp
 * Created by user22 on 2018/4/21.
 */
public interface ISemencollService {

    public ResponseDto<Long> addSemencoll(SemencollEo semencollEo);

    public ResponseDto<Void> updateSemencoll(SemencollEo SemencollEo);

    public ResponseDto<Void> deleteSemencoll(Long semencollId);

//    public List<SemencollEo> queryPageUser(SemencollDto semencollDto);
//
//    public ResponseDto<SemencollDto> queryDetailById(Long semencollId);
}
