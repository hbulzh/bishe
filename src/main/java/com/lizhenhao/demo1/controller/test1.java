package com.lizhenhao.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test1 {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }
}
