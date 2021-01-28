package itheima.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("return")
public class Return {
    @RequestMapping("ModelAndView")
    public ModelAndView ModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", "张三");
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("testForward")
    public String testForward() {
        System.out.println("testForward is working");

        return "forward:/WEB-INF/pages/success.jsp";
    }
    @RequestMapping("testRedirect")
    public String testRedirect() {
        System.out.println("重定向的方法执行了");

        return "redirect:ModelAndView";
    }

}
