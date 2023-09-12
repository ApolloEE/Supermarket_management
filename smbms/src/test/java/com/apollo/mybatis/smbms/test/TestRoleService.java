package com.apollo.mybatis.smbms.test;

import com.apollo.mybatis.smbms.pojo.Role;
import com.apollo.mybatis.smbms.service.RoleService;
import com.apollo.mybatis.smbms.service.impl.RoleServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestRoleService {
    RoleService roleService = new RoleServiceImpl();
    @Test
    public void getUserList_test() throws Exception {
        List<Role> roleList = roleService.getRoleList();
        for (Role role : roleList) {
            System.out.println("role = " + role);
        }
    }
}
