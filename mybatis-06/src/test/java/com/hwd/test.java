package com.hwd;

import com.hwd.dao.StudentMapper;
import com.hwd.dao.TeacherMapper;
import com.hwd.pojo.Student;
import com.hwd.pojo.Teacher;
import com.hwd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher=mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void testStudent(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
        List<Student> student=studentMapper.getStudent2();
        for (Student s:student){
            System.out.println(s.getId());
            System.out.println(s.getName());
            System.out.println(s.getTeacher().getName());
        }
        sqlSession.close();
    }
}
