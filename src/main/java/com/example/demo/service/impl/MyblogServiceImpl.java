package com.example.demo.service.impl;

import com.example.demo.dao.MyblogMapper;
import com.example.demo.entity.Message;
import com.example.demo.entity.Myblog;
import com.example.demo.entity.Openblog;
import com.example.demo.entity.Student;
import com.example.demo.service.MyblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyblogServiceImpl implements MyblogService {
    @Autowired
    private MyblogMapper myblogMapper;
    @Override
    public   Student getstudentbysid(String sid){
        Student stu =  this.myblogMapper.selectBySid(sid);
       return stu;
    }
    @Override
    public void updateblogtext(Myblog myblog){
        this.myblogMapper.updateBlogText(myblog.getPri_page(),myblog.getId());
    }
    @Override
    public Myblog  getallblog(String id){
          Myblog myblog=this.myblogMapper.selecttextBySid(id);
          return myblog;
    }
    @Override
    public void  updatestudentname(Student student){
        this.myblogMapper.updateStudentName(student.getSname(),student.getSid());
    }
    @Override
    public Message getallmessage(String id){
        Message message=this.myblogMapper.SelectMessageById(id);
        return message;
    }
    @Override
    public  void  updatemessage(Message message){
        this.myblogMapper.updatemessagecontext(message.getMcontext(),message.getAcontext(),message.getId());
    }

    @Override
    public List<Openblog> getblogs(String id) {
        return myblogMapper.showblogs(id);
    }

    @Override
    public void addtourmeaasage(Message message) {
        this.myblogMapper.tourmessage(message.getMcontext(),message.getId());
    }

    @Override
    public void updatestupwd(Student student) {
        this.myblogMapper.updatestupwd(student.getSpwd(),student.getSid());
    }
}
