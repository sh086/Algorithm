package com.module.merchant.controller;

import lombok.val;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    private final String LOGIN = "login";

    private final String INDEX = "index";

    private final String REDIRECT_INDEX = "redirect:index";


    @GetMapping("/login")
    public String login(){
        return LOGIN;
    }

    @GetMapping("/index")
    public String index(){
        return INDEX;
    }

    @PostMapping("/login")
    public String login(String name,String password,Model model){

        //获取Subject
        val subject = SecurityUtils.getSubject();
        //封装用户数据
        val token = new UsernamePasswordToken(name,password);
        //执行登录方法
        try{
            subject.login(token);
            //登陆成功，跳转到index界面
            return REDIRECT_INDEX;
        }catch (UnknownAccountException e){
            model.addAttribute("errorMsg","用户名不存在");
        }catch (IncorrectCredentialsException e){
            model.addAttribute("errorMsg","密码错误");
        }
        return LOGIN;
    }

}
