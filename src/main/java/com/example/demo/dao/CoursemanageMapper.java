package com.example.demo.dao;

import com.example.demo.entity.Mycour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CoursemanageMapper {
    @Select("select avg(\"SGrade\") from \"Blog\" where \"Cid\"=#{cid}")
    public Float  averagegrade(@Param("cid") String cid);

    @Select("select \"Teacher_class\".\"Cid\",\"Cname\",\"Label\" from \"MessageOfLesson\",\"Teacher_class\" where \"Teacher_class\".\"Cid\"=\"MessageOfLesson\".\"Cid\" and \"Teacher_class\".\"Tid\"=#{tid}")
    public List<Mycour> allcours(@Param("tid") String tid);

   @Select("select \"Cid\",\"Sid\",\"Work_name\",\"Work_picture1\",\"Work_code\",\"Work_word\",\"Grade\" from \"ActivityOfStudent\" where \"Cid\"=#{cid} ")
    public List<Mycour> selectstubycid(@Param("cid" )String cid);

   @Update("update \"ActivityOfStudent\" set \"Grade\"=#{grade} where \"Cid\"=#{cid} and \"Sid\"=#{sid}")
    public void setgrade(@Param("grade") Float grade,@Param("cid") String cid,@Param("sid") String sid);



}
