package com.example.demo.dao;

import com.example.demo.entity.Message;
import com.example.demo.entity.Myblog;
import com.example.demo.entity.Openblog;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MyblogMapper {
    @Select("select * from \"InformationOfStu\" where \"Sid\"= #{sid} ")
    public Student selectBySid(@Param("sid") String sid);

    @Select("select * from \"IdOfBlog\" where \"Id\"= #{id} ")

    public Myblog selecttextBySid(@Param("id") String id);

    @Select("select * from \"Message\" where \"Id\" = #{ id}")
    public Message SelectMessageById(@Param("id") String id);

    @Update("update \"IdOfBlog\" set \"Pri_page\"= #{text} where \"Id\" = #{id} ")
    public void  updateBlogText(@Param("text") String text,@Param("id") String id);

    @Update("update \"InformationOfStu\" set \"Sname\" = #{sname} where \"Sid\"=#{sid}")
    public void updateStudentName(@Param("sname") String sname,@Param("sid") String sid);

    @Update("update \"Message\" set \"Mcontext\"= #{mcontext} ,\"Acontext\"=#{acontext} where \"Id\"=#{id}")
    public void updatemessagecontext(@Param("mcontext") String mcontext,@Param("acontext") String acontext,@Param("id") String id);

    @Update("update \"Message\" set \"Mcontext\"= #{mcontext} where \"Id\"=#{id}")
    public void tourmessage(@Param("mcontext") String mcontext,@Param("id") String id);


    @Select("select \"Bid\",\"Blog\",\"Cid\",\"Cname\",\"SGrade\" from  \"Blog\" where \"Id\"=#{id}")
    public List<Openblog> showblogs(String id);

    @Update("update \"InformationOfStu\" set \"Spwd\" =#{spwd} where \"Sid\"=#{sid} ")
    public void updatestupwd(@Param("spwd") String spwd,@Param("sid") String sid);


}
