package itheima.Controller;

import itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
//@RequestMapping("ajax")
////public @ResponseBody Integer[] testAjax( Integer[] user) {//获取请求体里面的内容
////
////    for (Integer integer : user) {
////        System.out.println(integer);
////    }
////return user;
////}
//
//@ResponseBody
//    public  void test( @RequestParam(value="ids[]") Integer[] ids) {
//    System.out.println("hello");
//    for (Integer id : ids) {
//        System.out.println(id);
//    }
//}
    @RequestMapping(value="/ajax")
    @ResponseBody
    public String testForAjax(@RequestParam(value="userid") Integer[] userid){
        for (Integer integer : userid) {
            System.out.println(integer);
        }

        return null;
    }
}
