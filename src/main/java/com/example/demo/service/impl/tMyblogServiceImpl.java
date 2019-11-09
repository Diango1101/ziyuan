package com.example.demo.service.impl;

import com.example.demo.dao.tMyblogMapper;
import com.example.demo.entity.*;
import com.example.demo.service.tMyblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tMyblogServiceImpl implements tMyblogService {
    @Autowired
    private tMyblogMapper tMyblogMapper;
    @Override
    public Teacher getteacherbytid(String tid){
        Teacher tea =  this.tMyblogMapper.selectByTid(tid);
        return tea;
    }
    @Override
    public void updateblogtext(Myblog myblog){
        this.tMyblogMapper.updateBlogText(myblog.getPri_page(),myblog.getId());
    }
    @Override
    public Myblog  getallblog(String id){
        Myblog myblog=this.tMyblogMapper.selecttextByTid(id);
        return myblog;
    }
    @Override
    public void   updateteachername(Teacher teacher){
        this.tMyblogMapper.updateTeacherName(teacher.getTname(),teacher.getTid());
    }
    @Override
    public Message getallmessage(String id){
        Message message=this.tMyblogMapper.SelectMessageById(id);
        return message;
    }
    @Override
    public  void  updatemessage(Message message){
        this.tMyblogMapper.updatemessagecontext(message.getMcontext(),message.getAcontext(),message.getId());
    }

    @Override
    public List<Openblog> getblogs(String id) {
        return tMyblogMapper.showblogs(id);
    }

    @Override
    public void updateteapwd(Teacher teacher) {
        this.tMyblogMapper.updateteapwd(teacher.getTpwd(),teacher.getTid());
    }
}
