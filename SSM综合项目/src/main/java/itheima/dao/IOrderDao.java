package itheima.dao;

import itheima.domain.Product;
import itheima.domain.menber;
import itheima.domain.orders;
import itheima.domain.traveller;
import org.apache.ibatis.annotations.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.List;

@Repository
public interface IOrderDao {

    @Select("select * from orders")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "product",column = "productId",one = @One(select = "itheima.dao.IProductDao.findone"))

    })
    List<orders> FindAll();
//单个订单的查询
    @Select("select * from orders where id= #{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "itheima.dao.IProductDao.findone")),
            @Result(property = "menber",column = "memberId",javaType = menber.class,one = @One(select = "itheima.dao.IMenberDao.findone")),
            @Result(property = "travellers",column = "id" ,many = @Many(select = "itheima.dao.ITravellerDao.findAll"))
    })
    orders findByid(int id);
}
