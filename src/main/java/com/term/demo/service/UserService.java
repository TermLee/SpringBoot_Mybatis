package com.term.demo.service;

import com.term.demo.mapper.UserMapper;
import com.term.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}
