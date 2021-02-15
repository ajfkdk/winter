package itheima.dao;

import itheima.domain.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleDao {
    @Select("SELECT * FROM role WHERE id IN(SELECT roleId FROM `user_role` WHERE userId=#{userId})")
    List<Role> findRolebyID(Integer userId);
}
