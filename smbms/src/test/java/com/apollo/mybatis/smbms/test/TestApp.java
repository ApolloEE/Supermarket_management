package com.apollo.mybatis.smbms.test;

import com.apollo.mybatis.smbms.mapper.UserMapper;
import com.apollo.mybatis.smbms.mapper.impl.UserMapperImpl;
import com.apollo.mybatis.smbms.pojo.User;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestApp {

    @Test
    public void updatePwd_test() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        userMapper.updatePwd(29,"250");
    }

    @Test
    public void add_test() throws Exception {
        User user = new User();
        user.setUserCode("1111");
        user.setUserName("apollo");
        user.setGender(1);
        UserMapper userMapper = new UserMapperImpl();
        userMapper.add(user);
    }

    @Test
    public void deleteUserById_test() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        userMapper.deleteUserById(29);
    }

    @Test
    public void modify_test() throws Exception {
        User user = new User();
        user.setId(29);
        user.setUserCode("1111");
        user.setUserName("apollo");
        user.setUserPassword("1008611");
        user.setGender(1);
        user.setBirthday(new Date(100,2,2));
        user.setPhone("515151515");
        user.setAddress("雄安");
        user.setUserRole(1);
        user.setCreatedBy(1);
        user.setCreationDate(new Date());
        user.setModifyBy(1);
        user.setModifyDate(new Date());

        UserMapper userMapper = new UserMapperImpl();
        userMapper.modify(user);
    }

    @Test
    public void getUserById_test() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        User users = userMapper.getUserById("15");
        System.out.println("users = " + users.getUserRoleName());

    }

    @Test
    public void getLoginUser_test() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        User user = userMapper.getLoginUser("1111");
        System.out.println("user = " + user);

    }

    @Test
    public void getUserList_test() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        List<User> userList = userMapper.getUserList(null,0,(1-1)*5,5);
        for (User user : userList) {
            System.out.println("user = " + user);
        }
    }

    @Test
    public void getUserCount_test() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        int userCount = userMapper.getUserCount("张",0);
        System.out.println("userCount = " + userCount);

    }
}
