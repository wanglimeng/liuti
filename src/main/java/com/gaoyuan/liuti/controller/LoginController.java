package com.gaoyuan.liuti.controller;


import com.gaoyuan.liuti.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/u/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String LoginHtml() {

        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String Login(String username,String password,HttpSession session) {

        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);   //完成登录
            SysUser user=(SysUser) subject.getPrincipal();
            session.setAttribute("user", user);
            return "redirect:/";
        } catch(Exception e) {
            return "login";//返回登录页面
        }
    }
}
