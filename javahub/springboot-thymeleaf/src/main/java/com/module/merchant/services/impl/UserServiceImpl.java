package com.module.merchant.services.impl;

import com.google.common.collect.Maps;
import com.module.merchant.domain.User;
import com.module.merchant.mapper.UserMapper;
import com.module.merchant.services.UserService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.List;

/**
 * 用户管理服务实现类
 * */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "user",key = "#user")
    public List<User> searchUsers(@NonNull User user) {
        return userMapper.searchUsers(user);
    }

    @Override
    @Cacheable(value = "user",key = "#id")
    public User searchById(@NonNull Long id) {
        User user = new User();
        user.setId(id);
        return userMapper.searchUsers(user).get(0);
    }

    @Override
    public User searchByName(String name) {
        if(StringUtils.isBlank(name)){
            return null;
        }
        HashMap<String,String> params = Maps.newHashMap();
        params.put("name",name);
        return userMapper.selectByName(params);
    }

    @Override
    @CacheEvict(value = "user",allEntries = true)
    public void insertUser(@NonNull User user) {
        userMapper.insertUser(user);
    }

    @Override
    @CacheEvict(value = "user",allEntries = true)
    public void deleteById(@NonNull Long id) {
        if(searchById(id) == null){
            throw new RuntimeException("用户["+id+"]不存在");
        }
        HashMap<String,Long> params = Maps.newHashMap();
        params.put("id",id);
        userMapper.deleteUser(params);
    }

    @Override
    @CacheEvict(value = "user",allEntries = true)
    public void updateById(@NonNull User user) {
        if(searchById(user.getId()) == null){
            throw new RuntimeException("用户["+user.getId()+"]不存在");
        }
        userMapper.updateById(user);
    }
}
