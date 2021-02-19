package itheima.dao;

import itheima.domain.Permission;
import itheima.domain.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleDao {
    @Select("SELECT * FROM role WHERE id IN(SELECT roleId FROM `user_role` WHERE userId=#{userId})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", many = @Many(select = "itheima.dao.IPermission.findByRoleId"))
    })
    List<Role> findRolebyID(Integer userId);

    @Select("select * from role")
    List<Role> findAll();

    @Insert("insert into `ssm2`.`role` (`roleName`, `roleDesc`) values (#{roleName}, #{roleDesc})")
    void add(Role role);

    @Select("SELECT * FROM permission WHERE id NOT IN(SELECT permissionId FROM role_permission WHERE roleId=#{userid})")
    List<Permission> find_permission_Byid(Integer userid);

    @Select("select * from role where id = #{userid}")
    Role findByid(Integer userid);

    @Insert("insert into `ssm2`.`role_permission` (`permissionId`, `roleId`) values (#{roleid},#{id})")
    void add_permission2Role(@Param("roleid") Integer roleid, @Param("id") Integer id);
}
