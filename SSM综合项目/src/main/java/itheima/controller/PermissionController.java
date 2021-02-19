package itheima.controller;

import itheima.domain.Permission;
import itheima.service.impl.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("permission")
public class PermissionController {
    @Autowired
    private PermissionService service;

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mc = new ModelAndView();
        List<Permission> all = service.findAll();
        mc.addObject("permissionList", all);
        mc.setViewName("permission-list");
        return mc;
    }

    @RequestMapping("add")
    public String add(Permission permission) {
        service.add(permission);
        return "redirect:findAll";
    }
}
