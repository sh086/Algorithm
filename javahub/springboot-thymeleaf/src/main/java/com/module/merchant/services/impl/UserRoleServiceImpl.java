package com.module.merchant.services.impl;

import com.module.merchant.services.UserRoleService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService{

    @Override
    public List<String> selectRoleById(Long id) {
        List<String> roleLists = new ArrayList<>();
        if(id != null && id == 1L){
            roleLists.add("user:add");
            roleLists.add("user:update");
            roleLists.add("user:delete");
        }
        return roleLists;
    }
}
