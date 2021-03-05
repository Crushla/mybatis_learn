package com.hwd;

import com.hwd.dao.UserMapper;
import com.hwd.pojo.User;
import com.hwd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UseDaoTest {
    @Test
    public void test() {
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }

}
