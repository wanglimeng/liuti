package com.gaoyuan.liuti.entity;

import java.util.List;

public class UserRole extends SysRole {

    private List<SysPermissions> pers;

    public List<SysPermissions> getPers() {
        return pers;
    }

    public void setPers(List<SysPermissions> pers) {
        this.pers = pers;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "pers=" + pers +
                '}';
    }
}
