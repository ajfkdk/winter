package itheima.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class hello {
    @RequestMapping(path = "hello")
    public String sayhello() {
        System.out.println("你好 SpringMVC");

        return "success";
    }
}
