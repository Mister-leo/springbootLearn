package com.leo.service.user;

import com.leo.dao.user.UserDao;
import com.leo.entity.auth.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String username) {
        return  userDao.findUserByName(username);
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
}
