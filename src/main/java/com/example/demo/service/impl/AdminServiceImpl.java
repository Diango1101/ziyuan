package com.example.demo.service.impl;

import com.example.demo.dao.AdminMapper;
import com.example.demo.entity.Query;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.AdminService;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public void AdminInsert(Student student) {
        System.out.println(student.getSid());
        System.out.println(student.getSname());
        System.out.println(student.getSpwd());
        adminMapper.admininsertstu(student.getSid(),student.getSname(),student.getSpwd());
    }

    @Override
    public void AdminDelete(String Sid) {
        adminMapper.admindeletestu(Sid);
    }

    @Override
    public List<Student> SelectStudent() {
        System.out.println(adminMapper.SelectByAll().size());
        return adminMapper.SelectByAll();
    }

    @Override
    public void AdminInsertt(Teacher teacher) {
        adminMapper.admininserttea(teacher.getTid(),teacher.getTname(),teacher.getTpwd());
    }

    @Override
    public void AdminDeletet(String Tid) {
        adminMapper.admindeletetea(Tid);
    }

    @Override
    public List<Teacher> SelectTeacher() {
        return adminMapper.SelectByAllt();
    }
    public List<Query> getallcour() {
        return adminMapper.SelectAllByTime();
    }

    @Override
    public void grantcour(String cid) {
        adminMapper.grantstatus(cid);}
    @Override
    public void AdminInsertExce(String Cid, String Work_label) {
        adminMapper.admininsertExce(Cid,Work_label);
    }

    @Override
    public void AdminDeleteExce(String Cid) {
        adminMapper.admindeleteExce(Cid);
    }

}
