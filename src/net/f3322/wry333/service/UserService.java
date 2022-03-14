package net.f3322.wry333.service;

import net.f3322.wry333.bean.User;

public interface UserService {
    User login(User user);

    Boolean register(User user);

    boolean reset(User user);
}
