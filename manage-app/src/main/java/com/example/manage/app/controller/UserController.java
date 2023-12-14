package com.example.manage.app.controller;

import com.example.manage.app.pojo.entity.User;
import com.example.manage.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.Constanse;
import utils.JsonResult;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public JsonResult querUser(@RequestBody User user){
        List<User> user1 = userService.querUser(null);
        return JsonResult.ok(user1, Constanse.CODE_SUCCESS,"1");

    }

    @PostMapping("/userid")
    public JsonResult querUserByid(@RequestBody User user){
        User user1 = userService.querUserByid(user);
        return JsonResult.ok(user1,Constanse.CODE_SUCCESS,"1");
    }
}
