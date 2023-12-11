package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //Create user
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get user by Id
    User getUser(String userId);
}
