package itheima.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("error")
public class SysExceptionResolve  {
    @RequestMapping("404")
   public ModelAndView test404() {
       System.out.println("出现了一个小错误");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("message", "出错了，请与管理员联系");
        return modelAndView;
   }
}
