package com.apollo.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        //启动mybatis
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("myBatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建session工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static void closeSqlSession(SqlSession sqlSession) {
        sqlSession.close();
    }
}
