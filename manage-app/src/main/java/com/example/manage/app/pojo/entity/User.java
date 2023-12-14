package com.example.manage.app.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("manage_user")
public class User {
    @TableId
    private Integer id;
    private String name;
    private String phone;
    private String password;

}
