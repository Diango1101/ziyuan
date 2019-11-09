package com.example.demo.dao;

import com.example.demo.entity.Query;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface QueryMapper {
    @Select("Select * from \"MessageOfLesson\"   where \"Ststus\"=1 order by \"Click_rate\" desc")
    public List<Query> SelectAllByClick();
    /**
     *
     */
    @Select("Select * from \"MessageOfLesson\"  where \"Ststus\"=1 order by \"UploadTime\" desc")
    public List<Query> SelectAllByTime();
    /**
     *
     */
    @Select("Select * from \"MessageOfLesson\" where \"Cname\" like #{Cname} and   \"Ststus\"=1 order by \"Cname\" ")
    public List<Query> SelectAllByName(@Param("Cname") String Cname);

    /**
     *
     * @param Label
     * @return
     */
    @Select("Select * from \"MessageOfLesson\" where \"Label\"=#{Label} and   \"Ststus\"=1")
    public List<Query> SelectAllByLabei(@Param("Label") String Label);

    /**
     *
     * @return
     */
    @Select("Select \"Label\" from \"MessageOfLesson\"  where \"Ststus\"=1 ")
    public List<String> SelectLabel();

    @Insert("INSERT INTO \"ActivityOfStudent\" (\"Sid\", \"Cid\") VALUES (#{Sid},#{Cid})")
    public void ChooseCour(@Param("Sid") String Sid,@Param("Cid") String Cid);

    @Select("Select * from \"MessageOfLesson\"  where \"Ststus\"=1 and \"Cid\" not in (select \"Cid\" from \"Excellent_class\")order by \"UploadTime\" desc")
    public List<Query> SelectAllByTimea();

    @Select("Select * from \"MessageOfLesson\"  where \"Ststus\"=1 and \"Cid\" in (select \"Cid\" from \"Excellent_class\")order by \"UploadTime\" desc")
    public List<Query> SelectAllByTimead();
}
