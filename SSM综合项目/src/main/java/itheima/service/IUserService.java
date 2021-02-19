package itheima.service;

import itheima.domain.Role;
import itheima.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {


    List<UserInfo> findAll();

    void addUser(UserInfo userInfo);

    UserInfo findById(Integer id);

    List<Role> findOtherRole(Integer id);

    void addRoleToUser(String userid, Integer[] ids);

    void deleteUser(Integer id);
}
