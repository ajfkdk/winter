package itheima.controller;

import itheima.service.impl.IProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductServiceimpl service;
    @RequestMapping("findAll")
    public ModelAndView findAll() {

        return null;
    }
}
