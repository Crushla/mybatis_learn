package com.hwd;

import com.hwd.dao.StudentMapper;
import com.hwd.dao.TeacherMapper;
import com.hwd.pojo.Student;
import com.hwd.pojo.Teacher;
import com.hwd.utils.MybatisUtils;
import com.mysql.cj.Session;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<Teacher> teacherStudent = sqlSession.getMapper(TeacherMapper.class).getTeacher(1);
        for (Teacher teacher : teacherStudent) System.out.println(teacher);
        sqlSession.close();
    }
}
