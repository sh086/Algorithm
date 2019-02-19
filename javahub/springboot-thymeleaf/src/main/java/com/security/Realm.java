package com.security;

import com.module.merchant.domain.User;
import com.module.merchant.services.UserRoleService;
import com.module.merchant.services.UserService;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class Realm extends AuthorizingRealm {

    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private UserService userService;

    /**
     * 执行授权逻辑
     * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("执行授权逻辑");

        //查询当前用户的权限
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        val role = userRoleService.selectRoleById(user.getRoleId());

        //给资源授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(role);
        return info;
    }

    /**
     * 执行认证逻辑
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("执行认证逻辑");

        //判断用户名是否正确
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        //获取用户名密码
        val user = userService.searchByName(token.getUsername());
        if(user == null){
            //用户名不存在,shiro底层抛出UnknownAccountException
            return null;
        }
        //判断密码是否正确
        return new SimpleAuthenticationInfo(user,user.getPassWord(),"");
    }
}
