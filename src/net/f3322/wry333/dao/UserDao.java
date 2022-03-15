package net.f3322.wry333.dao;

import net.f3322.wry333.bean.User;

public interface UserDao {
    User find(User user);

    Boolean insert(User user);

    User findByEmail(User user);

    boolean resetPwd(User t_user,String pwd);
}
