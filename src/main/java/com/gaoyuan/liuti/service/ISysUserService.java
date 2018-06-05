package com.gaoyuan.liuti.service;

import com.gaoyuan.liuti.entity.SysUser;
import com.baomidou.mybatisplus.service.IService;

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

  SysUser findRoleAndPerByUsername(String username);
}
