package com.apollo.mybatis.smbms.mapper.impl;

import com.apollo.mybatis.smbms.mapper.ProviderMapper;
import com.apollo.mybatis.smbms.pojo.Provider;
import com.apollo.mybatis.smbms.tools.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProviderMapperImpl implements ProviderMapper {
    @Override
    public int add(Provider provider) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(ProviderMapper.class).add(provider);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public List<Provider> getProviderList(String proName, String proCode) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Provider> providerList = sqlSession.getMapper(ProviderMapper.class).getProviderList(proName, proCode);
        MyBatisUtil.closeSqlSession(sqlSession);
        return providerList;
    }

    @Override
    public int deleteProviderById(String delId) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(ProviderMapper.class).deleteProviderById(delId);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public Provider getProviderById(String id) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Provider providerById = sqlSession.getMapper(ProviderMapper.class).getProviderById(id);
        MyBatisUtil.closeSqlSession(sqlSession);
        return providerById;
    }

    @Override
    public int modify(Provider provider) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(ProviderMapper.class).modify(provider);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }
}
