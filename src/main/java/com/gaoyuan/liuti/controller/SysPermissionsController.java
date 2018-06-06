package com.gaoyuan.liuti.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.gaoyuan.liuti.entity.SysPermissions;
import com.gaoyuan.liuti.service.ISysPermissionsService;
import com.gaoyuan.liuti.utils.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wlm
 * @since 2018-06-05
 */
@Controller
@RequestMapping("/per")
public class SysPermissionsController {

    @Autowired
    ISysPermissionsService iSysPermissionsService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    Object returnPers(String page, String limit) {

        return new ResponseJson(0,"",iSysPermissionsService.selectCount(null),iSysPermissionsService.selectPage(new Page<SysPermissions>()).getRecords());
    }


}

