package com.bowen.springboot.service;

import com.bowen.springboot.dao.UserDao;
import com.bowen.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-07-17 2:41 PM
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserByName(String name){
        User user = null;
        try {
            user = userDao.findByUserName(name);
        }catch (Exception e){

        }
        return user;

    }

}
