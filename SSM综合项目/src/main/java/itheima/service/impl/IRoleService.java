package itheima.service.impl;

import itheima.dao.IRoleDao;
import itheima.domain.Permission;
import itheima.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IRoleService implements itheima.service.IRoleService {
    @Autowired
    private IRoleDao dao;

    @Override
    public List<Role> findAll() {
        return dao.findAll();

    }

    @Override
    public void add(Role role) {
        dao.add(role);
    }

    @Override
    public List<Permission> find_permission_Byid(Integer userid) {
        List<Permission> ps = dao.find_permission_Byid(userid);
        return ps;
    }

    @Override
    public Role findByid(Integer userid) {
        Role role = dao.findByid(userid);
        return null;
    }

    @Override
    public void add_permission2Role(Integer roleid, Integer[] ids) {
        for (Integer id : ids) {
            dao.add_permission2Role(roleid, id);
        }
    }
}
