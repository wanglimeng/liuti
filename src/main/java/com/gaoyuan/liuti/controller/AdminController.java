package com.gaoyuan.liuti.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.gaoyuan.liuti.entity.SysUser;
import com.gaoyuan.liuti.service.ISysUserService;
import com.gaoyuan.liuti.utils.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    ISysUserService iSysUserService;

    @GetMapping("/user")
    @Transactional
    Object userList(Integer page,Integer limit) {

        int count = iSysUserService.selectCount(null);
        return new ResponseJson(0,"",count,iSysUserService.selectPage(new Page<SysUser>(page,limit)).getRecords());

    }

}
