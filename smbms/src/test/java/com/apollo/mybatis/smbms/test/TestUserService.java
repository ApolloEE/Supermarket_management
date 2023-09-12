package com.apollo.mybatis.smbms.test;

import com.apollo.mybatis.smbms.pojo.User;
import com.apollo.mybatis.smbms.service.UserService;
import com.apollo.mybatis.smbms.service.impl.UserServiceImpl;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestUserService {
    UserService userService = new UserServiceImpl();

    @Test
    public void add_test() throws Exception {
        User user = new User();
        user.setUserCode("1111");
        user.setUserName("apollo");
        user.setGender(1);
        System.out.println(userService.add(user));
    }

    @Test
    public void login_test() throws Exception {
        User admin = userService.login("admin", "000");
        System.out.println("admin = " + admin);
    }

    @Test
    public void getUserList_test() throws Exception {
        List<User> users = userService.getUserList("", 0, (1 - 1) * 5, 5);
        for (User user : users) {
            System.out.println("user1 = " + user);
        }
    }

    @Test
    public void getUserCount_test() throws Exception {
        int userCount = userService.getUserCount("张", 0);
        System.out.println(userCount);
    }

    @Test
    public void deleteUserById_test() throws Exception {
        boolean b = userService.deleteUserById(30);
        System.out.println(b);
    }

    @Test
    public void selectUserCodeExist_test() throws Exception {
        User user = userService.selectUserCodeExist("zhaomin");
        System.out.println("user = " + user);
    }

    @Test
    public void getUserById_test() throws Exception {
        User user = userService.getUserById("15");
        System.out.println("user = " + user.getUserRoleName());
    }

    @Test
    public void modify_test() throws Exception {
        User user = new User();
        user.setId(31);
        user.setUserCode("1111");
        user.setUserName("apollo");
        user.setUserPassword("1008611");
        user.setGender(1);
        user.setBirthday(new Date(100, 2, 2));
        user.setPhone("515151515");
        user.setAddress("雄安");
        user.setUserRole(1);
        user.setCreatedBy(1);
        user.setCreationDate(new Date());
        user.setModifyBy(1);
        user.setModifyDate(new Date());
        boolean modify = userService.modify(user);
        System.out.println("user = " + modify);
    }

    @Test
    public void updatePwd_test() throws Exception {
        boolean b = userService.updatePwd(31, "1231231323");
        System.out.println(b);
    }
}
