package itheima.dao;

import itheima.domain.traveller;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITravellerDao {
@Select("SELECT * FROM traveller WHERE  id IN(SELECT travellerId FROM order_traveller WHERE orderId=#{id}) ")
    List<traveller> findAll(int id);
}
