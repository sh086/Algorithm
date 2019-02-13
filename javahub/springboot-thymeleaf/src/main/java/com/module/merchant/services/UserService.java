package com.module.merchant.services;

import com.module.merchant.domain.User;
import com.module.merchant.modal.UserModal;

import java.util.List;

/**
 * 用户管理 服务类
 * @author suhe
 * @since 2019年2月1日11:11:54
 * */
public interface UserService {

    void insertUser(User user);

    void deleteById(Long id);

    void updateById(User user);

    List<User> searchUsers(UserModal userModal);

    User searchById(Long id);
}
