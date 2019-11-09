package com.example.demo.dao;

import com.example.demo.entity.Jingping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface JingpingMapper {
    @Select(" select \"Excellent_class\".\"Cid\",\"Cname\",\"Tname\" from \"MessageOfLesson\",\"Teacher_class\",\"Excellent_class\",\"InformationOfTea\" where \"MessageOfLesson\".\"Cid\"=\"Excellent_class\".\"Cid\" and \"Excellent_class\".\"Cid\"=\"Teacher_class\".\"Cid\" and \"Teacher_class\".\"Tid\"=\"InformationOfTea\".\"Tid\"")
    public List<Jingping> showjingping();
}
