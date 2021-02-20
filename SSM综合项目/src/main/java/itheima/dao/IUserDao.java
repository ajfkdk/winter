package itheima.dao;

import itheima.domain.Role;
import itheima.domain.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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


    @Select("select * from user where id=#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles", column = "id", many = @Many(select = "itheima.dao.IRoleDao.findRolebyID"))
    })
    UserInfo findById(Integer id);

    @Select("SELECT * FROM role WHERE id NOT IN( SELECT roleId FROM `user_role` WHERE userId=#{id})")
    List<Role> findOtherRole(Integer id);

    @Insert("INSERT INTO `ssm2`.`user_role` (`userId`, `roleId`) VALUES (#{userid}, #{roleid})")
    void addRoleToUser(@Param("userid") String userid, @Param("roleid") Integer roleid);

    @Delete("DELETE FROM USER WHERE id=#{id}")
    void deleteUser(Integer id);

    @Delete("DELETE FROM user_role WHERE userId=#{id}")
    void deleteUser_Role(Integer id);
}
