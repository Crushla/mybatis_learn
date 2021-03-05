package com.hwd.dao;

import com.hwd.pojo.User;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserMapper {
    User queryUserById(@Param("id") int id);
}
