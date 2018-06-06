package com.gaoyuan.liuti.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.gaoyuan.liuti.entity.SysRole;
import com.gaoyuan.liuti.service.ISysRoleService;
import com.gaoyuan.liuti.utils.ResponseJson;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wlm
 * @since 2018-06-05
 */
@Controller
@RequestMapping("/sys")
public class SysRoleController {

    @Autowired
    ISysRoleService iSysRoleService;

    /**
     * @param page  页号
     * @param limit 每页大小
     * @return
     */
    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    @ResponseBody
    Object returnRoles(int page, int limit) {

        return new ResponseJson(0, "", iSysRoleService.selectCount(null), iSysRoleService.selectPage(new Page<SysRole>(page, limit)).getRecords());
    }

    /**
     * @param rname 权限名称
     * @return
     */
    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    @ResponseBody
    Object AddRole(String rname) {

        SysRole sysRole = new SysRole();
        sysRole.setRname(rname);
        sysRole.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());
        Boolean res = iSysRoleService.insert(sysRole);

        if (res) {
            return new ResponseJson(0, "成功", 0, null);
        } else {

            return new ResponseJson(1, "失败", 1, null);
        }


    }

}

