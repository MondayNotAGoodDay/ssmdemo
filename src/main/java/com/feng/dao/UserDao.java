package com.feng.dao;


import com.feng.entity.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserDao {
    User findByName(String username);
    boolean addUser(User user);
}
