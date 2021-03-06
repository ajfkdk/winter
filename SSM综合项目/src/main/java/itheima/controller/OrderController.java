package itheima.controller;

import com.github.pagehelper.PageInfo;
import itheima.domain.orders;
import itheima.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService service;

    @RequestMapping("findAll")

//    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") Integer page,@RequestParam(name = "size",required =true,defaultValue = "4") Integer size) {
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {

        ModelAndView mv = new ModelAndView();
        List<orders> all = service.findAll(page, size);
        PageInfo pageInfo = new PageInfo(all);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("order-page-list");
        return mv;
    }

    @RequestMapping("findByid")
    public ModelAndView findByid(Integer id) {
        ModelAndView mv = new ModelAndView();
        orders byid = service.findByid(id);
        mv.addObject("OrderList", byid);
        mv.setViewName("orderShow");
        return mv;
    }
}
