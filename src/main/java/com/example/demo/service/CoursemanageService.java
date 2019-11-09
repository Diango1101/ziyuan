package com.example.demo.service;

import com.example.demo.entity.Mycour;

import java.util.List;

public interface CoursemanageService {
    List<Mycour> getallcours(String tid);
    List<Mycour> getallstus(String cid);
    Float  getaver(String cid);
    void setgrade(float grade,String cid,String sid);
}
