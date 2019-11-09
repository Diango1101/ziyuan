package com.example.demo.service.impl;

import com.example.demo.dao.LoginMapper;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService, Serializable {
    @Autowired
    private LoginMapper loginMapper;



    @Override
    public boolean verifyStudentLogin(Student student){

        List<Student> studenlist = this.loginMapper.findByStudentnameAndPassword(student.getSid(), student.getSpwd());

        return studenlist.size()>0;

    }
    @Override
    public boolean verifyTeacherLogin(Teacher teacher){

        List<Teacher> teacherlist = this.loginMapper.findByTeachernameAndPassword(teacher.getTid(), teacher.getTpwd());

        return teacherlist.size()>0;

    }
    @Override
    public  String  selectStudentName(Student student){
        Student student1=this.loginMapper.selectBySid(student.getSid());
       return student1.getSname();
    }
    public  String  selectTeacherName(Teacher teacher){
        Teacher teacher1=this.loginMapper.selectByTid(teacher.getTid());
        return teacher1.getTname();
    }

}
