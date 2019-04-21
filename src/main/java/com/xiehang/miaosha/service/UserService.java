package com.xiehang.miaosha.service;

import com.xiehang.miaosha.dao.UserDao;
import com.xiehang.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getById(int i){

    }
}
