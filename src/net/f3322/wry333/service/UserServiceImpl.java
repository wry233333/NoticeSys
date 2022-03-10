package net.f3322.wry333.service;

import net.f3322.wry333.bean.User;
import net.f3322.wry333.dao.UserDao;
import net.f3322.wry333.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    @Override
    public User login(User user) {
        UserDao ud = new UserDaoImpl();
        return ud.find(user);
    }
}
