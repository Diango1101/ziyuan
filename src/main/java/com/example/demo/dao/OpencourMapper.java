package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Mapper
@Repository
public interface OpencourMapper {
    @Insert("insert into \"AboutLesson\"(\"Cid\",\"ppt\") values (#{cid},#{ppt})")
    void opencourseppt(@Param("cid") String cid,@Param("ppt") String ppt);

   @Insert("insert into \"MessageOfLesson\"(\"Cid\",\"Cname\",\"Label\",\"ProcessChart\",\"Outline\",\"ExperimentInstructer\",\"UploadTime\") " +
           "values(#{cid},#{cname},#{label},#{processchart},#{outline},#{exinstruct},sysdate)")
    void   opencourse(@Param("cid")String cid, @Param("cname") String cname,
                      @Param("label") String label, @Param("processchart") String processchart,
                      @Param("outline") String outline,@Param("exinstruct") String exinstruct);
   @Insert("insert into \"Teacher_class\"(\"Tid\",\"Cid\") values (#{tid},#{cid})")
    void opentc(@Param("tid") String tid,@Param("cid") String cid);
}
