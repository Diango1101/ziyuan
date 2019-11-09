package com.example.demo.service;

public interface OpencourService {
    void addppt(String cid,String ppt);
    void addcourse(String cid,String cname,String label,String processchart,String outline,String exinstruct);
    void  addtc(String tid,String cid);
}
