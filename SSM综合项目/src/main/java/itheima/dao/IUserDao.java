package itheima.dao;

import itheima.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {
    @Select("select * from user where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles", column = "id", many = @Many(select = "itheima.dao.IRoleDao.findRolebyID"))
    })
    UserInfo findByUsername(String username);

    @Select("select * from user")
    List<UserInfo> findAll();

    @Insert("insert into `ssm2`.`user` (`email`, `username`, `password`, `phoneNum`, `status`) values (#{email}, #{username}, #{password},#{phoneNum}, #{status} )")
    void addUser(UserInfo userInfo);
}
