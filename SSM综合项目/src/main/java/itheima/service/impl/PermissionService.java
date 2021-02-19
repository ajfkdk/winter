package itheima.service.impl;

import itheima.dao.IPermission;
import itheima.domain.Permission;
import itheima.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService implements IPermissionService {
    @Autowired
    private IPermission dao;

    @Override
    public List<Permission> findAll() {
        return dao.findAll();
    }

    @Override
    public void add(Permission permission) {
        dao.add(permission);
    }
}
