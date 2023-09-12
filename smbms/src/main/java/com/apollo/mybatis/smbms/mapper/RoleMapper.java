package com.apollo.mybatis.smbms.mapper;


import com.apollo.mybatis.smbms.pojo.Role;

import java.sql.Connection;
import java.util.List;

public interface RoleMapper {
    public List<Role> getRoleList()throws Exception;
}
