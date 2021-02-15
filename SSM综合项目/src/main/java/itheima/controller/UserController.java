package itheima.controller;

import itheima.domain.UserInfo;
import itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService service;

    @RequestMapping("findAll")
    ModelAndView findAll() {
        List<UserInfo> users = service.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("Users", users);
        mv.setViewName("user-list");
        return mv;
    }


    @RequestMapping("add")
    String addUser(UserInfo userInfo) {
        service.addUser(userInfo);

        return "redirect:findAll";
    }
}
