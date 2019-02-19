package com.module.merchant.domain;

import lombok.Data;

/**
 * 用户权限表
 * */
@Data
public class UserRole {

    private Long id;

    private Long userId;

    private String role;

    private String roleName;
}
