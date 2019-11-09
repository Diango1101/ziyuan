package com.example.demo.dao;


import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface LoginMapper {

  @Select("select \"Sid\",\"Sname\",\"Spwd\",\"Spic\" FROM \"InformationOfStu\" where \"Sid\"= #{sid} and \"Spwd\"= #{spwd}")
//  @Results(id="StudentResult",value ={
//          @Result(property="Sid",column = "\"Sid\"",id=true),
//          @Result(property="Sname",column = "\"Sname\""),
//          @Result(property="Spwd",column = "\"Spwd\""),
//          @Result(property="Spic",column = "\"Spic\"")
//  }
//
//  )
  public   List<Student> findByStudentnameAndPassword(@Param("sid") String sid,@Param("spwd") String spwd);

  @Select("select * from \"InformationOfStu\" where \"Sid\"= #{sid} ")

  public   Student selectBySid(@Param("sid") String sid);

  @Select("select * from \"InformationOfTea\" where \"Tid\"= #{tid} ")

  public   Teacher selectByTid(@Param("tid") String tid);


    @Select("select \"Tid\",\"Tname\",\"Tpwd\",\"Tpic\" FROM \"InformationOfTea\" where \"Tid\"= #{tid} and \"Tpwd\"= #{tpwd}")
//    @Results(id="TeacherResult",value ={
//            @Result(property="Tid",column = "\"Tid\"",id=true),
//            @Result(property="Tname",column = "\"Sname\""),
//            @Result(property="Tpwd",column = "\"Tpwd\""),
//            @Result(property="Tpic",column = "\"Tpic\"")
//    }
//
//    )
    public List<Teacher> findByTeachernameAndPassword(@Param("tid") String sid, @Param("tpwd") String tpwd);










}
