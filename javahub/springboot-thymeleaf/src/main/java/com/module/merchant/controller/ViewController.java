package com.module.merchant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 视图跳转前端控制器
 * @author suhe
 * @since 2019年2月1日09:51:41
 * */
@Controller
public class ViewController {

    private static final String INDEX = "index";

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("msg","欢迎访问");
        return INDEX;
    }

    @GetMapping("/view/{page}")
    public String page(@PathVariable String page,Model model,Integer id){
        model.addAttribute("msg",id);
        return page;
    }

    @GetMapping("/view-restful/{page}/{id}")
    public String page(@PathVariable String page,@PathVariable Integer id, Model model){
        model.addAttribute("msg",id);
        return page;
    }
}