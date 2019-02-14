package com.module.merchant.controller;
import com.common.converter.orika.BeanConvertUtil;
import com.common.response.ResultModal;
import com.module.merchant.domain.User;
import com.module.merchant.modal.UserModal;
import com.module.merchant.services.UserService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 用户管理 前端控制器
 * @author suhe
 * @since 2019年2月1日11:08:30
 * */

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    private static final String USER_INDEX = "user/index";

    private static final String USER_ADD = "user/add";

    private static final String REDIRECT_USER_ADD = "redirect:/user";

    private static final String USER_UPDATE = "user/update";

    @Resource
    private UserService userService;

    /**
     * 分页查询当前用户
     * */
    @GetMapping("/")
    public String searchUsers(Model model,UserModal userModal){
        User user = BeanConvertUtil.getMapper().map(userModal,User.class);
        val users = userService.searchUsers(user);
        model.addAttribute("users",users);
        return USER_INDEX;
    }

    /**
     * 新增用户
     * @param userModal 用于服务端数据校验
     * */
    @GetMapping("/add")
    public String addView(UserModal userModal){
        return USER_ADD;
    }

    /**
     * 新增用户
     * */
    @PostMapping("/add")
    public String insertUser(@Valid UserModal userModal, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return USER_ADD;
        }
        User user = BeanConvertUtil.getMapper().map(userModal,User.class);
        userService.insertUser(user);
        return REDIRECT_USER_ADD;
    }

    /**
     * 删除用户
     * */
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id,Model model){
        userService.deleteById(id);
        return "redirect:/user/";
    }

    /**
     * 更新当前用户
     * */
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        User user = userService.searchById(id);
        model.addAttribute("user",user);
        return USER_UPDATE;
    }

    /**
     * 更新当前用户
     * */
    @PostMapping("/update")
    public String updateById(User user){
        userService.updateById(user);
        return "redirect:/user/";
    }

}
