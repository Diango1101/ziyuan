package com.example.demo.service.impl;

import com.example.demo.dao.CoursemanageMapper;
import com.example.demo.entity.Mycour;
import com.example.demo.service.CoursemanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursemanageServiceImpl implements CoursemanageService {
    @Autowired
    private CoursemanageMapper coursemanageMapper;

    @Override
    public List<Mycour> getallcours(String tid) {
        return coursemanageMapper.allcours(tid);
    }

    @Override
    public List<Mycour> getallstus(String Cid) {

        if(Cid.length()<8)
        {
            for(;Cid.length()<8;)
                Cid=Cid+" ";
        }
//        PS：上面的循环是我char的时候个数可能不足，所以使用的循环让他补满8位，你可以不用

        return coursemanageMapper.selectstubycid(Cid);
    }

    @Override
    public Float getaver(String cid) {
        return coursemanageMapper.averagegrade(cid);
    }

    @Override
    public void setgrade(float grade, String Cid, String sid) {
        if(Cid.length()<8)
        {
            for(;Cid.length()<8;)
                Cid=Cid+" ";
        }
        coursemanageMapper.setgrade(grade,Cid,sid);
    }
}
