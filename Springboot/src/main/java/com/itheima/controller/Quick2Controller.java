package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quick2Controller {
    @Value("${name}")//从spring容器中获取name的数值
    private String  name;
    @Value("${person.addr}")
    private String addr;
    @RequestMapping("/aaa2")
    @ResponseBody
    public String quick2(){

        return "<h1>name : "+this.name+"地址是："+addr+"</h1>";

    }
}
