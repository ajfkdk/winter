package itheima.service;

import itheima.domain.orders;

import java.util.List;

public interface OrderService {
    List<orders> findAll(int page,int size);

    orders findByid(int id);
}
