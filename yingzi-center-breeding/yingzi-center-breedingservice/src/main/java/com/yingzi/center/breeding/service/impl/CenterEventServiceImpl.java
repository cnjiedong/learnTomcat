/**
 * @(#) DemoServiceImpl.java 1.0 2018-01-17
 * Copyright (c) 2018, YUNXI. All rights reserved.
 * YUNXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yingzi.center.breeding.service.impl;

import com.dtyunxi.eo.BaseEo;
import com.yingzi.center.breeding.eo.CenterEventEo;
import com.yingzi.center.breeding.eo.CheckInfoEo;
import com.yingzi.center.breeding.mapper.CenterEventMapper;
import com.yingzi.center.breeding.mapper.CheckInfoMapper;
import com.yingzi.center.breeding.service.ICenterEventService;
import com.yingzi.center.breeding.service.ICheckInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: CenterEventServiceImpl
 * @Description: (事件中心服务类)
 * @Author JIEDONG
 * @Date 2018-04-19
 **/
@Service("centerEventServiceImpl")
public class CenterEventServiceImpl implements ICenterEventService {

    /**
     * 事件中心Mapper类
     */
    @Resource
    private CenterEventMapper centerEventMapper;

    //记录事件中心表
    public int insert(CenterEventEo centerEventEo) {
        return centerEventMapper.insert(centerEventEo);
    }

    public void syncCenterEvent(String method, Object object) {
        CenterEventEo centerEventEo;
        if (method.startsWith("insert") && (centerEventEo = transformObject(object)) != null) {
            insert(centerEventEo);
        }
    }

    //分类别的事件表EO对象，转换成事件中心表的 CenterEventEo对象
    public CenterEventEo transformObject(Object object) {
            if (object == null) {
                return null;
            }

            if (!(object instanceof BaseEo)) {
                return null;
            }

            if (object instanceof CheckInfoEo) {
                return transformFromCheckInfoEo((CheckInfoEo) object);
            }
            return null;
    }

    public CenterEventEo transformFromCheckInfoEo(CheckInfoEo checkInfoEo) {
        CenterEventEo centerEventEo = new CenterEventEo();
        centerEventEo.setHerdId(centerEventEo.getHerdId());
        centerEventEo.setEvType(String.valueOf(checkInfoEo.getEventId()));
        centerEventEo.setEvdate(checkInfoEo.getCheckDate());
        centerEventEo.setPkPointer(String.valueOf(checkInfoEo.getId()));
        centerEventEo.setFserial(String.valueOf(checkInfoEo.getId()));
        String fcomment = String.format("位置:[%s],技术员[%s],备注[%s]", checkInfoEo.getDeslocation(), checkInfoEo.getTechnician(), checkInfoEo.getFcomment());
        centerEventEo.setFcomment(fcomment);
        return centerEventEo;
    }

}
