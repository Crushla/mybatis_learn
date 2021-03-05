package com.hwd.dao;

import com.hwd.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher(@Param("tid")int id);

    Teacher getTeacherStudent(@Param("tid")int id);
}
