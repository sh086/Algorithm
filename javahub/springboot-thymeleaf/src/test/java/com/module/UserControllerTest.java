package com.module;

import com.Application;
import com.module.merchant.domain.User;
import com.module.merchant.modal.UserModal;
import com.module.merchant.services.UserService;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserControllerTest {

    @Resource
    private UserService userService;

    /**
     * 新增用户
     * */
    @Test
    public void insertUser(){
        User user = new User();
        user.setName("测试");
        user.setAge(12);
        userService.insertUser(user);
    }
}
