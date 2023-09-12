package com.apollo.mybatis.mapper;

import com.apollo.mybatis.pojo.Role;

public interface RoleMapper {
    public void add(Role role);

    public void deleteById(int id);

    public void updateById(Role role);
}
