package itheima.service.impl;

import itheima.dao.IUserDao;
import itheima.domain.Role;
import itheima.domain.UserInfo;
import itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao dao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo byUsername = dao.findByUsername(username);
        //根据状态进行判断是否登录成功
//        User user = new User(byUsername.getUsername(), "{noop}"+byUsername.getPassword(), getAuthorities(byUsername.getRoles()));
        User user = new User(byUsername.getUsername(), byUsername.getPassword(), byUsername.getStatus() == 0 ? false : true, true, true, true, getAuthorities(byUsername.getRoles()));
        return user;

    }

    public List<SimpleGrantedAuthority> getAuthorities(List<Role> roles) {
        ArrayList<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }


        return list;

    }

    @Override

    public List<UserInfo> findAll() {
//        从dao查询数据
//        需要处理吗？不用
//        直接返回
        List<UserInfo> all = dao.findAll();
        return all;
    }

    //    @Autowired
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public void addUser(UserInfo userInfo) {
        userInfo.setPassword(encoder.encode(userInfo.getPassword()));
        dao.addUser(userInfo);
        System.out.println("用户添加成功");
    }

    @Override
    public UserInfo findById(Integer id) {
        UserInfo userInfo = dao.findById(id);
        return userInfo;
    }

    @Override
    public List<Role> findOtherRole(Integer id) {
        List<Role> roles = dao.findOtherRole(id);
        return roles;
    }

    @Override
    public void addRoleToUser(String userid, Integer[] ids) {
        for (Integer id : ids) {
            dao.addRoleToUser(userid, id);
        }
    }

    @Override
    public void deleteUser(Integer id) {
        dao.deleteUser_Role(id);
        dao.deleteUser(id);
        System.out.println("delete success!");
    }
}
