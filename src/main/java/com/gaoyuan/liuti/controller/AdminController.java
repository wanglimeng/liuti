package com.gaoyuan.liuti.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.gaoyuan.liuti.entity.SysUser;
import com.gaoyuan.liuti.service.ISysUserService;
import com.gaoyuan.liuti.utils.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @PostMapping("/userdel")
    Object userDel(int id) {


        return iSysUserService
                .delete(new EntityWrapper<SysUser>()
                        .eq("uid",id));

    }

    @PostMapping("/userupdate")
    Object userUpdate(@RequestBody SysUser sysUser) {

        sysUser.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());

        Boolean res = iSysUserService
                .update(sysUser,new EntityWrapper<SysUser>()
                        .eq("uid",sysUser.getUid()));

        if (res) {
            return new ResponseJson(1,"succes",1,null);
        }else {
            return "";
        }


    }

}
