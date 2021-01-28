package itheima.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("anno")
public class anno {
    @RequestMapping("testRequestParam")
    public String  testRequestParam(@RequestParam(value = "name") String username) {
        System.out.println(username);
        return "success";
    }
}
