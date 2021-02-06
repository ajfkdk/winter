package itheima.service;

import itheima.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
//添加订单
    void add(Product product);
}
