package com.hwd;

import com.hwd.dao.UserMapper;
import com.hwd.pojo.User;
import com.hwd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class test {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUsers();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

}
