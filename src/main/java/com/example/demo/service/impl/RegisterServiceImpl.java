package com.example.demo.service.impl;

import com.example.demo.dao.RegisterMapper;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.LoginService;
import com.example.demo.service.RegisterService;
import org.apache.ibatis.annotations.Flush;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.io.Serializable;
@Service
public class RegisterServiceImpl  implements RegisterService,Serializable {
    @Autowired
    private RegisterMapper registerMapper;
    @Override
//    @Transactional(readOnly = false)
//    @Flush
    public void insertstu(Student student){

        this.registerMapper.insertstu(student.getSid(),student.getSname(),student.getSpwd());
//        System.out.println(student.getSpwd());
    };
    @Override
//    @Transactional(readOnly = false)
//    @Flush
    public void inserttea(Teacher teacher){

        this.registerMapper.inserttea(teacher.getTid(),teacher.getTname(),teacher.getTpwd());

    };
}
