package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.User;

import java.util.List;

public interface LoginService {

    boolean verifyStudentLogin(Student student);
    boolean verifyTeacherLogin(Teacher teacher);
    String  selectStudentName(Student student);
    String  selectTeacherName(Teacher teacher);
}
