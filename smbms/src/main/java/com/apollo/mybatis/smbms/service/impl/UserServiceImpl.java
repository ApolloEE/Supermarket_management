package com.apollo.mybatis.smbms.service.impl;

import com.apollo.mybatis.smbms.mapper.UserMapper;
import com.apollo.mybatis.smbms.mapper.impl.UserMapperImpl;
import com.apollo.mybatis.smbms.pojo.User;
import com.apollo.mybatis.smbms.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserMapper userMapper = new UserMapperImpl();
    @Override
    public boolean add(User user) throws Exception {
        int i = userMapper.add(user);
        return i>0;
    }

    @Override
    public User login(String userCode, String userPassword) throws Exception {
        User user = userMapper.getLoginUser(userCode);
        if(user!=null){
            if(user.getUserPassword().equals(userPassword)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize) throws Exception {
        List<User> userList = userMapper.getUserList(queryUserName,queryUserRole,(currentPageNo-1)*5,pageSize);
        return userList;
    }

    @Override
    public int getUserCount(String queryUserName, int queryUserRole) throws Exception {
        int userCount = userMapper.getUserCount(queryUserName, queryUserRole);
        return userCount;
    }

    @Override
    public User selectUserCodeExist(String userCode) throws Exception {
        User loginUser = userMapper.getLoginUser(userCode);
        return loginUser;
    }

    @Override
    public boolean deleteUserById(Integer delId) throws Exception {
        int i = userMapper.deleteUserById(delId);
        return i>0;
    }

    @Override
    public User getUserById(String id) throws Exception {
        User userById = userMapper.getUserById(id);
        return userById;
    }

    @Override
    public boolean modify(User user) throws Exception {
        int i = userMapper.modify(user);
        return i>0;
    }

    @Override
    public boolean updatePwd(int id, String pwd) throws Exception {
        int i = userMapper.updatePwd(id, pwd);
        return i>0;
    }
}
