package itheima.controller;

import itheima.domain.Permission;
import itheima.domain.Role;
import itheima.service.impl.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("role")
public class RoleController {
    @Autowired
    private IRoleService service;

    @RequestMapping("findAll")

    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<Role> all = service.findAll();
        mv.addObject("roleList", all);
        mv.setViewName("role-list");
        return mv;
    }

    @RequestMapping("add")
    public String add(Role role) {
        service.add(role);
        return "redirect:findAll";
    }

    @RequestMapping("findUserByIdAndAllpermission")
    ModelAndView findUserByIdAndAllpermission(@RequestParam(name = "id", required = true) Integer userid) throws Exception {
        ModelAndView mv = new ModelAndView();
//    通过roleid查找role
        Role role = service.findByid(userid);
//    通过roleid查找该role没有的permission
        List<Permission> ps = service.find_permission_Byid(userid);
        mv.addObject("role", role);
        mv.addObject("permissionList", ps);
        mv.setViewName("role-permission-add");
        return mv;
    }

    @RequestMapping("add_permission2Role")
    String add_permission2Role(@RequestParam(name = "roleid", required = true) Integer roleid, @RequestParam(name = "ids", required = true) Integer[] ids) {
        service.add_permission2Role(roleid, ids);
        return "redirect:findAll";

    }
}
