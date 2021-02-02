package vue.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class accountController {
    @RequestMapping("aaa")
    @ResponseBody
    public String quick() {
        System.out.println("让我来告诉你热部署成功了");
        return "<h1>前端的页面已经完成部署，只要按下Ctrl + F9</h1>";
    }
}
