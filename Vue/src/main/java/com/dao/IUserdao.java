package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserdao {
//    根据ID查询一个
@Select("select * from user where id = #{userId}")
    User findById(Integer userid);

//    更新用户信息
    @Select("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);

//    查询用户列表
@Select("select * from user")
    List<User> findAll();
}
