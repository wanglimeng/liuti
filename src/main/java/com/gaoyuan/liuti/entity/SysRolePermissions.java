package com.gaoyuan.liuti.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wlm
 * @since 2018-06-05
 */
public class SysRolePermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;
    private Integer pid;
    private String createTime;
    private String updateTime;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysRolePermissions{" +
        ", uid=" + uid +
        ", pid=" + pid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
