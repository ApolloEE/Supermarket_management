package com.apollo.mybatis.mapper;

import com.apollo.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查询用户数量
    public int selectCount();

    public List<User> selectAll();

    //根据id查询用户
    public User selectById(int id);

    //两个以上的参数需要用@param给参数取名字，必须和参数一致
    public List<User> selectByBrithdayAndGender(@Param("birthday") String birthday,@Param("gender") String gender);

    //根据手机号查询用户
    public User selectPhone(String phone);

    public List<User> selectByName(String name);

    public List<User> selectAllAndRoleName();

    public void add(User user);

    public void deleteById(int id);

    public void updateById(User user);
}
