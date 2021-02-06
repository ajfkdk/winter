package itheima.service.impl;

import itheima.dao.IProductDao;
import itheima.domain.Product;
import itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service")
public class IProductServiceimpl implements IProductService {
    @Autowired
    private IProductDao dao;
    @Override
    public List<Product> findAll() throws Exception {
        List<Product> all = dao.findAll();
        return all;
    }

    @Override
    public void add(Product product) {
        dao.add(product);
    }
}
