package com.module;

import com.Application;
import com.module.merchant.domain.User;
import com.module.merchant.services.UserService;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserControllerTest {

    @Resource
    private UserService userService;

    @Test
    public void searchUser(){
        User page =  new User();
        val users = userService.searchUsers(page);
        System.out.println("-+-+-+-+-+-+-+-+");
        User addUser = new User();
        addUser.setName("2");
        userService.insertUser(addUser);
        System.out.println("-+-+-+-+-+-+-+-+");
        val uses = userService.searchUsers(page);
        System.out.println("-+-+-+-+-+-+-+-+");
    }

    /**
     * 新增用户
     * */
    @Test
    public void insertUser(){
        User user = new User();
        user.setName("测试");
        userService.insertUser(user);
    }
}
