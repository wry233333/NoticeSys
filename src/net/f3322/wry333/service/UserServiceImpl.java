package net.f3322.wry333.service;

import net.f3322.wry333.bean.User;
import net.f3322.wry333.dao.UserDao;
import net.f3322.wry333.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao ud = new UserDaoImpl();
    @Override
    public User login(User user) {
        return ud.find(user);
    }

    @Override
    public Boolean register(User user) {
        return ud.insert(user);
    }

    @Override
    public boolean reset(User user) {
        User t_user = ud.findByEmail(user);
        if(ud.resetPwd(t_user,user.getPassword())){
            return true;
        }
        return false;
    }
}
