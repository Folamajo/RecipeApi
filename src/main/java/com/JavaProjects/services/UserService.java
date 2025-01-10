package com.JavaProjects.services;

import com.JavaProjects.persistence.entities.User;
import com.JavaProjects.persistence.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepository;

    //Connects to the repository
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //Accepts user object from controller
    //save() is a method provided by Spring Data JPA
    @Transactional
    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
