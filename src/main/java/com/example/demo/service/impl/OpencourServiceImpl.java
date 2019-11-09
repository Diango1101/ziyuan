package com.example.demo.service.impl;

import com.example.demo.dao.OpencourMapper;
import com.example.demo.service.OpencourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpencourServiceImpl implements OpencourService {
     @Autowired
     private OpencourMapper opencourMapper;
    @Override
    public void addppt(String cid, String ppt) {
        opencourMapper.opencourseppt(cid,ppt);
    }

    @Override
    public void addcourse(String cid, String cname, String label, String processchart, String outline, String exinstruct) {
        opencourMapper.opencourse(cid,cname,label,processchart,outline,exinstruct);
    }


    @Override
    public void addtc(String tid, String cid) {
        opencourMapper.opentc(tid,cid);
    }
}
