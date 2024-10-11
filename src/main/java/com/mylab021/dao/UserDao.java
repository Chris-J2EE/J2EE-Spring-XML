package com.mylab021.dao;

import com.mylab021.pojo.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> userList = new  ArrayList<User>();

    private User user;

    public void setUser(User user) {
        userList.add(user);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUser(Integer id) {
        User user = new User();
        for (User item : userList) {
            if (item.getId() == id) {
                user = item;
            }
        }
        return user;
    }

}
