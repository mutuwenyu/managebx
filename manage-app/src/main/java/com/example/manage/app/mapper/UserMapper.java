package com.example.manage.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.manage.app.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
