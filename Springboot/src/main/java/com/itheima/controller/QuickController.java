package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {
    @RequestMapping("/aaa")
    @ResponseBody
    public String quick(){
        return "<h1>法律是保护弱势群体的</h1>";
    }
}
