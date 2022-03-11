package net.f3322.wry333.dao;

import net.f3322.wry333.bean.User;

public interface UserDao {
    User find(User user);

    Boolean insert(User user);
}
