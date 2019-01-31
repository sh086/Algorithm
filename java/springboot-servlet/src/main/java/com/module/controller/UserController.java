package com.module.controller;
import com.google.common.collect.Lists;
import com.module.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@Slf4j
public class UserController {
    /**
     * 查询用户详情
     * */
    @PostMapping("/")
    public String searchUser(Model model){
        List<User> userLists = Lists.newArrayList();
        userLists.add(new User(1,"小明",12));
        userLists.add(new User(2,"小红",12));
        userLists.add(new User(3,"小李",12));
        model.addAttribute("userLists",userLists);
        return "userList";
    }

    /**
     * 查询用户详情
     * */
    @RequestMapping("/showUser")
    public ModelAndView showUser(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userLists = Lists.newArrayList();
        userLists.add(new User(1,"小明",12));
        userLists.add(new User(2,"小红",12));
        userLists.add(new User(3,"小李",12));
        modelAndView.setViewName("userList");
        modelAndView.addObject(userLists);
        return modelAndView;
    }

}
