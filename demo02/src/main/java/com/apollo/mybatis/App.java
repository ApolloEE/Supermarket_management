package com.apollo.mybatis;

import com.apollo.mybatis.mapper.UserMapper;
import com.apollo.mybatis.pojo.User;
import com.apollo.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.sql.*;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).selectAll();
        for (User user : users){
            System.out.println("user = " + user);
        }
        MyBatisUtil.closeSqlSession(sqlSession);


    }
}
