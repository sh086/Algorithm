package com.module.merchant.mapper;

import com.module.merchant.domain.User;
import java.util.List;
import java.util.Map;

/**
 * 用户管理 Mapper接口
 * @author suhe
 * @since 2019年2月1日11:23:31
 * */
public interface UserMapper {
    void insertUser(User user);
    void deleteUser(Map params);
    void updateById(User user);
    List<User> searchUsers(User user);
}
