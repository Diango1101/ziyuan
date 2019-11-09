package com.example.demo.service;

import com.example.demo.entity.Mycour;

import java.util.List;

public interface MycourService {
    List<Mycour> getAllCour(String Sid);
    void addWord(String Sid, String Cid, String Work_word, String Work_code);
    void addWord1(String Sid, String Cid);
    public List<Mycour> getAllStu(String Cid);
}
