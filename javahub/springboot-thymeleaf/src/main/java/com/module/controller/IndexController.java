package com.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private static final String INDEX = "index";

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("msg","欢迎访问");
        return INDEX;
    }
}
