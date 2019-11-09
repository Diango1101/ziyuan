package com.example.demo.service.impl;

import com.example.demo.dao.QueryMapper;
import com.example.demo.entity.Query;
import com.example.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QueryServiceImpl implements QueryService {
    @Autowired
    private QueryMapper queryMapper;

    @Override
    public List<Query> getAllByClick() {
        return queryMapper.SelectAllByClick();
    }

    @Override
    public List<Query> getAllByTime() {
        return queryMapper.SelectAllByTime();
    }

    @Override
    public List<Query> getAllByName(String Cname) {
        return queryMapper.SelectAllByName(Cname);
    }

    @Override
    public List<Query> getAllByLabel(String Label) {
        return queryMapper.SelectAllByLabei(Label);
    }

    @Override
    public List<String> getLabel(){
        return queryMapper.SelectLabel();
    }

    @Override
    public void chooseCour(String Sid, String Cid){queryMapper.ChooseCour(Sid,Cid);}

    @Override
    public List<Query> getAllByTimea() {
        return queryMapper.SelectAllByTimea();
    }

    @Override
    public List<Query> getAllByTimead() {
        return queryMapper.SelectAllByTimead();
    }

}

