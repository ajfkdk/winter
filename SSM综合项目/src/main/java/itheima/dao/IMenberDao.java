package itheima.dao;

import itheima.domain.menber;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface IMenberDao {
//    查询单个会员信息
    @Select("SELECT * FROM member WHERE id=#{id}")
    public menber findone(int id);
}
