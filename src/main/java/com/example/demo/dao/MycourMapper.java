package com.example.demo.dao;

import com.example.demo.entity.Mycour;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MycourMapper {
    /**
     *
     * @param Sid
     * @return
     */
    @Select("Select * from \"AboutLesson\"  NATURAL JOIN \"ActivityOfStudent\" where \"Sid\"=#{Sid}")
    public List<Mycour> SelectCour(@Param("Sid") String Sid);

    /**
     *
     * @param Sid
     * @param Cid
     * @param Work_word
     */
   // @Insert("INSERT INTO \"ActivityOfStudent\" (\"Work_word\", \"Uploadtime\") VALUES (#{Sid},#{Cid},#{Work_word},sysdate)")
    @Update("Update \"ActivityOfStudent\" set \"Work_word\"=#{Work_word},\"Work_code\"=#{Work_code},\"Uploadtime\"=sysdate where \"Sid\"=#{Sid} and \"Cid\"=#{Cid}")
    public void InsertCour(@Param("Sid") String Sid, @Param("Cid") String Cid, @Param("Work_word") String Work_word, @Param("Work_code") String Work_code);

    @Update("Update \"ActivityOfStudent\" set \"Uploadtime\"=sysdate where \"Sid\"=#{Sid} and \"Cid\"=#{Cid}")
    public void InsertCour1(@Param("Sid") String Sid, @Param("Cid") String Cid);

    @Select("Select * from \"AboutLesson\" NATURAL JOIN \"ActivityOfStudent\" where \"Cid\"=#{Cid}")
    public List<Mycour> SelectClass(@Param("Cid") String Cid);
}