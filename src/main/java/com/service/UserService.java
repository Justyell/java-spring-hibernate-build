package com.service;

import com.dao.UserDaoImpl;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserDaoImpl userDao;

    @Transactional
    public void save(User user){
        userDao.save(user);
    }
}
