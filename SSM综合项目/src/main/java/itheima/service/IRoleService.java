package itheima.service;

import itheima.domain.Permission;
import itheima.domain.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoleService {
    List<Role> findAll();

    void add(Role role);

    List<Permission> find_permission_Byid(Integer userid);

    Role findByid(Integer userid);

    void add_permission2Role(Integer roleid, Integer[] ids);
}
