package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

public interface RegisterService {
    void insertstu(Student student);
    void inserttea(Teacher teacher);
}
