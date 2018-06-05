package com.gaoyuan.liuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class BaseController {

    @RequestMapping("/html/{html}")
    String returnHtml(@PathVariable("html") String html) {

        System.out.println("----------------------->");
        return html;
    }
}
