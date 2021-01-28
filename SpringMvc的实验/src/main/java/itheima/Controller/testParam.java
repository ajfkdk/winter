package itheima.Controller;

import itheima.domain.Account;
import itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/param")
public class testParam {
    @RequestMapping("/test")
    public String test(String username,String password) {
        System.out.println("执行了ing");
        System.out.println("用户名："+username+"密码："+password);
        return "success";
    }
    @RequestMapping("Test_javabean")
    public String javabean(Account account) {
        System.out.println(account.toString());
        return "success";
    }

}
