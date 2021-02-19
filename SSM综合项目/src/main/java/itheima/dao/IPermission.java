package itheima.dao;

import itheima.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPermission {
    @Select("SELECT * FROM permission WHERE id IN(SELECT permissionId FROM `role_permission` WHERE roleId=#{id})")
    List<Permission> findByRoleId(int id);

    @Select("select * from permission")
    List<Permission> findAll();

    @Insert("insert into `ssm2`.`permission` (`permissionName`, `url`) values ('${permissionName}', '${url}')")
    void add(Permission permission);
}
