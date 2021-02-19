package itheima.service;

import itheima.domain.Permission;

import java.util.List;

public interface IPermissionService {
    List<Permission> findAll();

    void add(Permission permission);
}
