package com.jun.service.impl;

import com.jun.dao.UserDao;
import com.jun.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
