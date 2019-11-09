package com.example.demo.service;

import com.example.demo.entity.Message;
import com.example.demo.entity.Myblog;
import com.example.demo.entity.Openblog;
import com.example.demo.entity.Student;

import java.util.List;

public interface MyblogService {
    Student getstudentbysid(String sid);
    void  updateblogtext(Myblog myblog);
    Myblog  getallblog(String id);
    void  updatestudentname(Student student);
    Message getallmessage(String id);
    void updatemessage(Message message);
    List<Openblog> getblogs(String id);
    void addtourmeaasage(Message message );
    void updatestupwd(Student student);
}
