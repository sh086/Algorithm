package com.module.merchant.services.impl;

import com.common.converter.orika.BeanConvertUtil;
import com.google.common.collect.Maps;
import com.module.merchant.domain.User;
import com.module.merchant.mapper.UserMapper;
import com.module.merchant.modal.UserModal;
import com.module.merchant.services.UserService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户管理服务实现类
 * */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> searchUsers(@NonNull UserModal userModal) {
        return userMapper.searchUsers(userModal);
    }

    @Override
    public User searchById(@NonNull Long id) {
        UserModal userModal = new UserModal();
        userModal.setId(id);
        return userMapper.searchUsers(userModal).get(0);
    }

    @Override
    public void insertUser(@NonNull UserModal userModal) {
        User user = BeanConvertUtil.getMapper().map(userModal,User.class);
        if(StringUtils.isBlank(user.getName())){
            throw new RuntimeException("姓名不能为空");
        }
        if(user.getAge() == null){
            throw new RuntimeException("年龄不能为空！");
        }
        userMapper.insertUser(user);
    }

    @Override
    public void deleteById(@NonNull Long id) {
        if(searchById(id) == null){
            throw new RuntimeException("用户["+id+"]不存在");
        }
        HashMap<String,Long> params = Maps.newHashMap();
        params.put("id",id);
        userMapper.deleteUser(params);
    }

    @Override
    public void updateById(@NonNull User user) {
        if(searchById(user.getId()) == null){
            throw new RuntimeException("用户["+user.getId()+"]不存在");
        }
        userMapper.updateById(user);
    }
}
