package com.gaoyuan.liuti.config.shiro;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.gaoyuan.liuti.entity.*;
import com.gaoyuan.liuti.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AuthRealm extends AuthorizingRealm {


    @Autowired
    ISysUserService iSysUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {


        SysUser user=(SysUser) principal.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
        List<String> permissions=new ArrayList<>();
        List<UserRole> userRolePer = iSysUserService.findRoleAndPerByUsername(user.getUsername()).getRoles();

        if (userRolePer.size()>0) {

            for (UserRole sysRole:userRolePer) {
                List<SysPermissions> sysPermissions = sysRole.getPers();
                if (sysPermissions.size()>0) {
                    for (SysPermissions sysPermissions1:sysPermissions) {
                        permissions.add(sysPermissions1.getPname());
                    }
                }
            }

        }
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);//将权限放入shiro中.

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken Token) throws AuthenticationException {

        UsernamePasswordToken utoken=(UsernamePasswordToken) Token;//获取用户输入的token
        String username = utoken.getUsername();
        SysUser sysUser = iSysUserService.selectOne(new EntityWrapper<SysUser>().eq("username",username));

        return new SimpleAuthenticationInfo(sysUser,sysUser.getPassword(),this.getClass().getName());
    }
}
