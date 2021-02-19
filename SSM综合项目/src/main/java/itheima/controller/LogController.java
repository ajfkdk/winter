package itheima.controller;

import com.github.pagehelper.PageInfo;
import itheima.dao.ISysLogDao;
import itheima.domain.SysLog;
import itheima.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("log")
public class LogController {
    @Autowired
    private ISysLogService service;

    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "10") Integer size) throws Exception {
//        决定使用pagehelper来实现分页的功能
//        调用service获取数据
        List<SysLog> all = service.findAll(page, size);
//        把数据传入pageinfo
        PageInfo pageInfo = new PageInfo(all);
//        把数据打包进modelandview
        ModelAndView mv = new ModelAndView();
//        把modelandview加上key传入jsp
        mv.addObject("pageinfo", pageInfo);
        mv.setViewName("syslog-page-list");
        return mv;
    }
}

