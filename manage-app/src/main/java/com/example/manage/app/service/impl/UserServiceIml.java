package com.example.manage.app.service.impl;

import com.example.manage.app.mapper.UserMapper;
import com.example.manage.app.pojo.entity.User;
import com.example.manage.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> querUser(User user) {
        return userMapper.selectList(null);
    }

    @Override
    public User querUserByid(User user) {
        User list =userMapper.selectById(user.getId());
        return list;
    }
}
