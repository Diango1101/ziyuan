package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.List;

public interface tMyblogService {
    Teacher getteacherbytid(String tid);
    void  updateblogtext(Myblog myblog);
    Myblog  getallblog(String id);
    void  updateteachername(Teacher teacher);
    Message getallmessage(String id);
    void updatemessage(Message message);
    List<Openblog> getblogs(String id);
    void updateteapwd(Teacher teacher);
}
