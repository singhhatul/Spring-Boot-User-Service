package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exception.UserAlreadyExistException;

public interface UserService {
    public User saveUser(User user) throws UserAlreadyExistException;

    public User getUserById(int id);

}
