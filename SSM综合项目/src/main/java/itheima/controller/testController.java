package itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class testController {
    @ResponseBody
    @RequestMapping("01")
    public String printf() {
        System.out.println("接收到方法");
        return "接收到方法";
    }
}
