package com.hwd;

import com.hwd.dao.UserMapper;
import com.hwd.pojo.User;
import com.hwd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UseDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();


    }
}
