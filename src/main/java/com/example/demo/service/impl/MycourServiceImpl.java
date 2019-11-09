package com.example.demo.service.impl;

import com.example.demo.dao.MycourMapper;
import com.example.demo.entity.Mycour;
import com.example.demo.service.MycourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MycourServiceImpl implements MycourService {
    @Autowired
    private MycourMapper mycourMapper;

    @Override
    public List<Mycour> getAllCour(String Sid) {
        return mycourMapper.SelectCour(Sid);
    }

    @Override
    public void addWord(String Sid, String Cid, String Work_word, String Work_code) {
        mycourMapper.InsertCour(Sid,Cid,Work_word,Work_code);
    }

    @Override
    public void addWord1(String Sid, String Cid) {
        mycourMapper.InsertCour1(Sid,Cid);
    }

    @Override
    public List<Mycour> getAllStu(String Cid) {
        if(Cid.length()<8)
        {
            for(;Cid.length()<8;)
                Cid=Cid+" ";
        }
//        PS：上面的循环是我char的时候个数可能不足，所以使用的循环让他补满8位，你可以不用
        return mycourMapper.SelectClass(Cid);
    }
}
