package itheima.controller;

import itheima.domain.Role;
import itheima.domain.UserInfo;
import itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService service;

    @RequestMapping("findAll")

    public ModelAndView findAll() {
        List<UserInfo> users = service.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("Users", users);
        mv.setViewName("user-list");
        return mv;
    }


    @RequestMapping("add")
    public String addUser(UserInfo userInfo) {
        service.addUser(userInfo);

        return "redirect:findAll";
    }

    @RequestMapping("findById")
    public ModelAndView findById(Integer id) {
        UserInfo userInfo = service.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", userInfo);
        mv.setViewName("user-show");
        return mv;
    }

    @RequestMapping("findUserByIdAndAllRole")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id", required = true) Integer id) {
//        查找用户以及可以添加的角色
        UserInfo user = service.findById(id);
//        根据用户id查询其他没有添加到表格的角色
        List<Role> roles = service.findOtherRole(id);
        ModelAndView mc = new ModelAndView();
        mc.addObject("user", user);
        mc.addObject("roleList", roles);
        mc.setViewName("user-role-add");
        return mc;
    }

    @RequestMapping("addRoleToUser")
    public String addRoletoUser(@RequestParam(name = "userId", required = true) String userid, @RequestParam(name = "ids", required = true) Integer[] ids) {
        service.addRoleToUser(userid, ids);
        return "redirect:findAll";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String deleteUser(@RequestParam("ids") Integer[] ids) {
        for (Integer id : ids) {
            service.deleteUser(id);
        }
        return "redirect:findAll";
    }
}