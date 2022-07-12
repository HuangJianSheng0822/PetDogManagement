package com.service;

import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public boolean getUser(String adminId,String adminPwd){
        if (userMapper.getUser (adminId)==null){
            return false;
        }
        return userMapper.getUser (adminId).equals (adminPwd);
    }
}
