package com.apollo.mybatis.smbms.mapper.impl;

import com.apollo.mybatis.smbms.mapper.BillMapper;
import com.apollo.mybatis.smbms.pojo.Bill;
import com.apollo.mybatis.smbms.tools.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BillMapperImpl implements BillMapper {
    @Override
    public int add(Bill bill) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(BillMapper.class).add(bill);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public List<Bill> getBillList(Bill bill) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Bill> billList = sqlSession.getMapper(BillMapper.class).getBillList(bill);
        MyBatisUtil.closeSqlSession(sqlSession);
        return billList;
    }

    @Override
    public int deleteBillById(String delId) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(BillMapper.class).deleteBillById(delId);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public Bill getBillById(String id) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Bill billById = sqlSession.getMapper(BillMapper.class).getBillById(id);
        MyBatisUtil.closeSqlSession(sqlSession);
        return billById;
    }

    @Override
    public int modify(Bill bill) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(BillMapper.class).modify(bill);
        sqlSession.commit();
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }

    @Override
    public int getBillCountByProviderId(String providerId) throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = sqlSession.getMapper(BillMapper.class).getBillCountByProviderId(providerId);
        MyBatisUtil.closeSqlSession(sqlSession);
        return i;
    }
}
