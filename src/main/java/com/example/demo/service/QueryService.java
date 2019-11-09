package com.example.demo.service;

import com.example.demo.entity.Query;

import java.util.List;

public interface QueryService {
    List<Query> getAllByClick();
    List<Query> getAllByTime();
    List<Query> getAllByName(String Cname);
    List<Query> getAllByLabel(String Label);
    List<String> getLabel();
    void chooseCour(String Sid, String Cid);
    List<Query> getAllByTimea();
    List<Query> getAllByTimead();
}
