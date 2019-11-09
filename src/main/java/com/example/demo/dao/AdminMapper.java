package com.example.demo.dao;

import com.example.demo.entity.Query;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminMapper {
    /*增*/
    @Insert("INSERT INTO \"InformationOfStu\"(\"Sid\",\"Sname\",\"Spwd\") VALUES(#{Sid},#{Sname},#{Spwd})")
    void admininsertstu(@Param("Sid") String Sid, @Param("Sname") String Sname, @Param("Spwd") String Spwd);
    /*删*/
    @Delete("Delete from \"InformationOfStu\" where \"Sid\"=#{Sid}")
    void admindeletestu(@Param("Sid")String Sid);
    /*改。。。。先删再加！*/
    @Select("Select * from \"InformationOfStu\"")
    public List<Student> SelectByAll();




    @Insert("INSERT INTO \"InformationOfTea\"(\"Tid\",\"Tname\",\"Tpwd\") VALUES(#{Tid},#{Tname},#{tpwd})")
    void admininserttea(@Param("Tid") String Tid, @Param("Tname") String Tname, @Param("Tpwd") String Tpwd);
    /*删*/
    @Delete("Delete from \"InformationOfTea\" where \"Tid\"=#{Tid}")
    void admindeletetea(@Param("Tid")String Tid);
    /*改。。。。先删再加！*/
    @Select("Select * from \"InformationOfTea\"")
    public List<Teacher> SelectByAllt();

    @Update("update \"MessageOfLesson\" set \"Ststus\"=1 where \"Cid\"=#{cid}")
    public void grantstatus(@Param("cid") String cid);

    @Select("Select * from \"MessageOfLesson\"   order by \"UploadTime\" desc")
    public List<Query> SelectAllByTime();

    @Insert("INSERT INTO \"Excellent_class\" (\"Cid\", \"Work_label\") VALUES (#{Cid},#{Work_label})")
    void admininsertExce(@Param("Cid") String Cid,@Param("Work_label") String Work_label);

    @Delete("Delete from \"Excellent_class\" where \"Cid\"=#{Cid}")
    void admindeleteExce(@Param("Cid") String Cid);
}
