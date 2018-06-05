package com.gaoyuan.liuti.service;

import com.gaoyuan.liuti.entity.SysUser;
import com.baomidou.mybatisplus.service.IService;
import com.gaoyuan.liuti.entity.UserRolePer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wlm
 * @since 2018-06-05
 */
public interface ISysUserService extends IService<SysUser> {

  UserRolePer findRoleAndPerByUsername(String username);
}
