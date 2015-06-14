package com.huanhuan.spring;

import com.huanhuan.spring.dao.UserDao;


import com.huanhuan.spring.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huan on 2015/5/29 0029.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao = ctx.getBean("userDao", UserDao.class);

      /*  User c = new User();
        c.setUsername("4");
        c.setNick("boei");
        c.setPassword("456");
        System.out.println("dog");
        userDao.save(c);*/
        User user = userDao.get("4");
        System.out.println(user.toString());

    }


}
