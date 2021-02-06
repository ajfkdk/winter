package itheima.controller;

import itheima.domain.Product;
import itheima.service.impl.IProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductServiceimpl service;
    @RequestMapping("01")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> all = service.findAll();
        mv.setViewName("product-list");
        mv.addObject("productList",all);
        return mv;
    }
@RequestMapping("add")

    public String addProduct(Product product) {
//        收到数据，把数据传入Service
    service.add(product);
//        跳转到查询方法
        return "redirect:01";
    }
}
