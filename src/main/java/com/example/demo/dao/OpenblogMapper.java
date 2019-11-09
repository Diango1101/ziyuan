package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OpenblogMapper {
    @Insert("insert into \"Blog\"(\"Bid\",\"Id\",\"Blog\",\"Cid\",\"Cname\",\"SGrade\")VALUES(\"Bid_seq\".nextval,#{id},#{blog},#{cid},#{cname},#{sgrade})")
    void insertopenblog(@Param("id") String id,@Param("blog") String blog,@Param("cid") String cid,@Param("cname") String cname,@Param("sgrade") float sgrade);
}
