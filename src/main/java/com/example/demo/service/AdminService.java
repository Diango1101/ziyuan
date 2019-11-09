package com.example.demo.service;

import com.example.demo.entity.Query;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

import java.util.List;

public interface AdminService {
    void AdminInsert(Student student);
    void AdminDelete(String Sid);
    List<Student> SelectStudent();



    void AdminInsertt(Teacher teacher);
    void AdminDeletet(String Tid);
    List<Teacher> SelectTeacher();

    List<Query> getallcour();
    void grantcour(String cid);
    void AdminInsertExce(String Cid,String Work_label);
    void AdminDeleteExce(String Cid);
}
