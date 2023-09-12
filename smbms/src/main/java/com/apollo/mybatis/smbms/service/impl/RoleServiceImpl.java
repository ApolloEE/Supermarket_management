package com.apollo.mybatis.smbms.service.impl;

import com.apollo.mybatis.smbms.mapper.RoleMapper;
import com.apollo.mybatis.smbms.mapper.impl.RoleMapperImpl;
import com.apollo.mybatis.smbms.pojo.Role;
import com.apollo.mybatis.smbms.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService{
    RoleMapper roleMapper = new RoleMapperImpl();
    @Override
    public List<Role> getRoleList() throws Exception {
        List<Role> roleList = roleMapper.getRoleList();
        return roleList;
    }
}
