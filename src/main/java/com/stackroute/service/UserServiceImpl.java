package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistException {
        if(userRepository.existsById(user.getId())){
            throw new UserAlreadyExistException("User already Exists");
        }
        User savedUser=userRepository.save(user);
        if(savedUser==null){
            throw new UserAlreadyExistException("DataBase not found-check connection");
        }
        return savedUser;
    }

    @Override
    public User getUserById(int id) {
        User retrievedUser=userRepository.findById(id).get();
        return retrievedUser;
    }

}
