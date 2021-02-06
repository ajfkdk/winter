package itheima.dao;

import itheima.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductDao {
    @Select("select * from product")
    List<Product> findAll() throws Exception;
    @Insert("insert into `ssm2`.`product` (`id`, `productNum`, `productName`, `cityName`, `DepartureTime`, `productPrice`, `productDesc`, `productStatus`) values (#{id},#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void add(Product product);
}
