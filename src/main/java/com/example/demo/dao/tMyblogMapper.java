package com.example.demo.dao;

import com.example.demo.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface tMyblogMapper {
    @Select("select * from \"InformationOfTea\" where \"Tid\"= #{tid} ")
    public Teacher selectByTid(@Param("tid") String tid);

    @Select("select * from \"IdOfBlog\" where \"Id\"= #{id} ")

    public Myblog selecttextByTid(@Param("id") String id);

    @Update("update \"IdOfBlog\" set \"Pri_page\"= #{text} where \"Id\" = #{id} ")
    public void  updateBlogText(@Param("text") String text,@Param("id") String id);

    @Update("update \"InformationOfTea\" set \"Tname\" = #{tname} where \"Tid\"= #{tid}")
    public void updateTeacherName(@Param("tname") String tname,@Param("tid") String tid);

    @Select("select * from \"Message\" where \"Id\" = #{ id}")
    public Message SelectMessageById(@Param("id") String id);

    @Update("update \"Message\" set \"Mcontext\"= #{mcontext} ,\"Acontext\"=#{acontext} where \"Id\"=#{id}")
    public void updatemessagecontext(@Param("mcontext") String mcontext,@Param("acontext") String acontext,@Param("id") String id);

    @Select("select \"Bid\",\"Blog\",\"Cid\",\"Cname\",\"SGrade\" from  \"Blog\" where \"Id\" = #{id}")
    public List<Openblog> showblogs(@Param("id") String id);

    @Update("update \"InformationOfTea\" set \"Tpwd\" =#{tpwd} where \"Tid\"=#{tid} ")
    public void updateteapwd(@Param("tpwd") String tpwd,@Param("tid") String tid);

}
