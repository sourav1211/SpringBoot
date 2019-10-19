package com.sourav.mynewspringbootapp.services;

import com.sourav.mynewspringbootapp.Repository.UserRepository;
import com.sourav.mynewspringbootapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        user.setIsActive(1);
        user = userRepository.save(user);
        return user != null ? user : null;
    }
}
