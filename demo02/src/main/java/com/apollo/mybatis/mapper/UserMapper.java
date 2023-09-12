package com.apollo.mybatis.mapper;

import com.apollo.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询用户数量
    public int selectCount();

    List<User> selectAll();
}
