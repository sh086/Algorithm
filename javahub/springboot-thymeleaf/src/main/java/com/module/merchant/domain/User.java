package com.module.merchant.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户类
 * @author suhe
 * @since 2019年2月1日11:16:31
 * */
@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
}
