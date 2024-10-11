package com.mylab021.service.impl;

import com.mylab021.dao.UserDao;
import com.mylab021.pojo.User;
import com.mylab021.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(Integer id) {
        return userDao.getUser(1);
    }

}
