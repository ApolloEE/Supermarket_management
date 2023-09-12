package com.apollo.mybatis;

import com.apollo.mybatis.mapper.RoleMapper;
import com.apollo.mybatis.mapper.UserMapper;
import com.apollo.mybatis.pojo.Role;
import com.apollo.mybatis.pojo.User;
import com.apollo.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.sql.*;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        //创建session
        //SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //调用sql语句
//        List<User> users = sqlSession.getMapper(UserMapper.class).selectAllAndRoleName();
//        //输出
//        for (User user : users){
//            System.out.println("user = " + user);
//        }

//        User user = sqlSession.getMapper(UserMapper.class).selectPhone("13544561111");
//        System.out.println(user);
        //关闭session
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            User user=new User();
            user.setUserCode("chenxiao");
            user.setUserName("陈晓");
            user.setUserPassword("10010000");
            user.setGender(2);
            Date date = new Date(2000,1,2);
            user.setBirthday(date);
            user.setPhone("10086111");
            user.setAddress("雄安");
            sqlSession.getMapper(UserMapper.class).add(user);
            //提交
            sqlSession.commit();
        }catch (Exception ex){
            ex.printStackTrace();
            //出现异常回滚
            sqlSession.rollback();
        }finally {
            //不论怎样都执行关闭session
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        MyBatisUtil.closeSqlSession(sqlSession);


    }
}
