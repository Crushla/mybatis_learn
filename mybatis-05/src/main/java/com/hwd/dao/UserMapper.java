package com.hwd.dao;

import com.hwd.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
    //方法存在多个参数时，所有参数前面都要加@Param
    @Select("select * from user where id =#{id}")
    User getUserByID(@Param("id") int id);
    @Insert("insert into user(id,name,pwd)values (#{id},#{name},#{password}")
    int addUser(User user);
}
