package com.module.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id,String name,Integer age){
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
