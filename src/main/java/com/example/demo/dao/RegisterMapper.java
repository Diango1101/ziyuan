package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RegisterMapper {


    @Insert("INSERT INTO \"InformationOfStu\"(\"Sid\",\"Sname\",\"Spwd\") VALUES(#{sid},#{sname},#{spwd})")
//    @Options( keyColumn = "\"Sid\"", keyProperty = "Sid")
    void insertstu(@Param("sid") String sid,@Param("sname") String sname,@Param("spwd") String spwd);

    @Insert("INSERT INTO \"InformationOfTea\"(\"Tid\",\"Tname\",\"Tpwd\") VALUES(#{tid},#{tname},#{tpwd})")

    void inserttea(@Param("tid") String tid,@Param("tname") String tname,@Param("tpwd") String tpwd);
}
