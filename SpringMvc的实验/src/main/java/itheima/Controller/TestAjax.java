package itheima.Controller;

import itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ajax")
public class TestAjax {
//@RequestMapping("ajax")
//    public @ResponseBody User testAjax(@RequestBody User user) {//获取请求体里面的内容
//    user.toString();
//    user.setAge("34");
//    user.setName("zhangsan");
//    System.out.println("测试ajax的方法执行了");
////    mvc使用了jar包后会把javabean对象打包成json数据返回
//    return user;
//    }
@RequestMapping("ajax")
public @ResponseBody User testAjax(@RequestBody User user) {//获取请求体里面的内容

    System.out.println("测试ajax的方法执行了");
    System.out.println(user);
    user.setName("zhangsan");
    user.setAge("23");
    return user;
//    mvc使用了jar包后会把javabean对象打包成json数据返回

}
}
