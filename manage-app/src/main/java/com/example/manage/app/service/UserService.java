package com.example.manage.app.service;

import com.example.manage.app.pojo.entity.User;

import java.util.List;

public interface UserService {

    List<User> querUser(User user);

    User querUserByid(User user);
}
