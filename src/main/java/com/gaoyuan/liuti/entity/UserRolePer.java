package com.gaoyuan.liuti.entity;

import java.util.List;

public class UserRolePer extends SysUser {

    List<SysRole> roles;

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserRolePer{" +
                "roles=" + roles +
                '}';
    }
}
