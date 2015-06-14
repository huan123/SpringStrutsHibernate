package com.huanhuan.spring.service;

import com.huanhuan.spring.model.User;
import com.huanhuan.spring.dao.UserDao;

/**
 * Created by huan on 2015/6/14 0014.
 */
public class LoginService {
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    UserDao userDao;


    public  boolean login(String username,String password) {

        User user = userDao.get(username);
        if(user == null || user.getPassword()==null)
        {
            return false;
        }

        if (user.getPassword().equals(password)) {
            System.out.println("登陆成功");
            return  true;
        } else {
            System.out.println("登陆失败");
            return false;
        }

    }

}
