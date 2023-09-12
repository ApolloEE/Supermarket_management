package com.apollo.mybatis.smbms.test;

import com.apollo.mybatis.smbms.mapper.RoleMapper;
import com.apollo.mybatis.smbms.mapper.impl.RoleMapperImpl;
import com.apollo.mybatis.smbms.pojo.Role;
import org.junit.Test;

import java.util.List;

public class TestRoleApp {
    @Test
    public void getUserList_test() throws Exception {
        RoleMapper roleMapper = new RoleMapperImpl();
        List<Role> roleList = roleMapper.getRoleList();
        for (Role role : roleList) {
            System.out.println("role = " + role);
        }
    }
}
