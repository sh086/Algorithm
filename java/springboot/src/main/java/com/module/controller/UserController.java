package com.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户管理 前端控制器
 * @author suhe
 * @since 2019年1月21日13:04:53
 * */
@RestController
public class UserController {

    @GetMapping("/")
    public Map<String,String> helloWord(){
        Map<String,String> map = new HashMap<>();
        map.put("msg","helloWord");
        return map;
    }
}
