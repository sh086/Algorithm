package com.module.merchant.services;

import java.util.List;

public interface UserRoleService {
    List<String> selectRoleById(Long id);
}
