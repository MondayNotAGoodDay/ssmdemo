package com.feng.service;

import com.feng.dao.UserDao;
import com.feng.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User findByName(String username) {
        return userDao.findByName(username);
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }
}
