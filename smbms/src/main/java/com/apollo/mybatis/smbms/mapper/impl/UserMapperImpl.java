package com.apollo.mybatis.smbms.mapper.impl;

import com.apollo.mybatis.smbms.mapper.UserMapper;
import com.apollo.mybatis.smbms.pojo.User;
import com.apollo.mybatis.smbms.tools.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    @Override
    public int add(User user) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(UserMapper.class).add(user);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public User getLoginUser(String userCode) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = sqlSession.getMapper(UserMapper.class).getLoginUser(userCode);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return user;
    }

    @Override
    public List<User> getUserList(String userName, int userRole, int currentPageNo, int pageSize) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<User> userList = sqlSession.getMapper(UserMapper.class).getUserList(userName, userRole, currentPageNo, pageSize);
        MyBatisUtil.closeSqlSession(sqlSession);
        return userList;
    }

    @Override
    public int getUserCount(String userName, int userRole) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int userCount = sqlSession.getMapper(UserMapper.class).getUserCount(userName, userRole);
        MyBatisUtil.closeSqlSession(sqlSession);
        return userCount;
    }

    @Override
    public int deleteUserById(Integer delId) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(UserMapper.class).deleteUserById(delId);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public User getUserById(String id) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = sqlSession.getMapper(UserMapper.class).getUserById(id);
        MyBatisUtil.closeSqlSession(sqlSession);
        return user;
    }

    @Override
    public int modify(User user) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(UserMapper.class).modify(user);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public int updatePwd(int id, String pwd) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(UserMapper.class).updatePwd(id,pwd);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }
}
