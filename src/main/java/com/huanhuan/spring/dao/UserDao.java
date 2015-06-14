package com.huanhuan.spring.dao;

import com.huanhuan.spring.model.User;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by huan on 2015/5/29 0029.
 */
public class UserDao extends HibernateDaoSupport {
    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    public User get(Integer id) {
        return getHibernateTemplate().get(User.class, id);
    }

    public User get(String username)
    {
        List<User> users = (List<User>) getHibernateTemplate().find("from User u where username=" + username);
        if (users.size() <= 0) {
            return null;
        } else {
            return users.get(0);
        }
    }
}
