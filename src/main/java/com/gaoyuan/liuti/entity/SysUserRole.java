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
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;
    private Integer rid;
    private String createTime;
    private String updateTime;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }


    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysUserRole{" +
        ", uid=" + uid +
        ", rid=" + rid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
