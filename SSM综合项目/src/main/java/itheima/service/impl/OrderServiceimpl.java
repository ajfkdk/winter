package itheima.service.impl;

import com.github.pagehelper.PageHelper;
import itheima.dao.IOrderDao;
import itheima.domain.orders;
import itheima.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceimpl implements OrderService {
    @Autowired
    private IOrderDao dao;
    @Override
    public List<orders> findAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<orders> orders = dao.FindAll();
        return orders;
    }

    @Override
    public orders findByid(int id) {
        orders orders=dao.findByid(id);
        return orders;
    }
}
