package com.gaoyuan.liuti.service.impl;

import com.gaoyuan.liuti.entity.SysUser;
import com.gaoyuan.liuti.mapper.SysUserMapper;
import com.gaoyuan.liuti.service.ISysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wlm
 * @since 2018-06-05
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser findRoleAndPerByUsername(String username) {
        return sysUserMapper.findRoleAndPerByUsername(username);
    }
}
