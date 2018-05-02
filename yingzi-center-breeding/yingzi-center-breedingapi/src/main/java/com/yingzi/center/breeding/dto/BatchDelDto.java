package com.yingzi.center.breeding.dto;

import com.dtyunxi.vo.BaseVo;

import java.util.ArrayList;

public class BatchDelDto extends BaseVo {

    ArrayList<Id> list;

    public ArrayList<Id> getList() {
        return list;
    }

    public void setList(ArrayList<Id> list) {
        this.list = list;
    }

    public Long[] toArray(){
        int size = list.size();
        if(size>0){
           Long[] ids = new Long[size];
           int idx=0;
           for(Id id : list){
               ids[idx] = id.getId();
               idx++;
           }
           return ids;
        }
        return null;
    }
}

class Id {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}