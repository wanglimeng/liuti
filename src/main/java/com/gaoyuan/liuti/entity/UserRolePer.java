package com.gaoyuan.liuti.entity;

import java.util.List;

public class UserRolePer extends SysUser {

    List<UserRole> roles;

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserRolePer{" +
                "roles=" + roles +
                '}';
    }
}
