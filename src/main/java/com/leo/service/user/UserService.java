package com.leo.service.user;

import com.leo.entity.auth.User;
import org.springframework.stereotype.Component;

public interface UserService {
    public User findUserByName(String username);
    public void saveUser(User user);
}
