package com.hwd.dao;

import com.hwd.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User>getUserLike(String value);
    List<User> getUserList();

    User getUserById(int id);

    User getUserById2(Map<String, Object> map);

    void addUser(User user);

    void addUser2(Map<String, Object> map);

    void updateUser(User user);

    void deleteUser(int id);
}
