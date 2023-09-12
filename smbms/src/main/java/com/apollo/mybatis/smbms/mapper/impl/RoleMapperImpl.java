package com.apollo.mybatis.smbms.mapper.impl;

import com.apollo.mybatis.smbms.mapper.RoleMapper;
import com.apollo.mybatis.smbms.pojo.Role;
import com.apollo.mybatis.smbms.tools.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;
import java.util.List;

public class RoleMapperImpl implements RoleMapper{
    @Override
    public List<Role> getRoleList() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Role> roleList = sqlSession.getMapper(RoleMapper.class).getRoleList();
        MyBatisUtil.closeSqlSession(sqlSession);
        return roleList;
    }
}
