package com.JavaProjects.api.controller;

import com.JavaProjects.persistence.entities.User;
import com.JavaProjects.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users") //this is the path that will trigger this particular method
public class UserController {

    //We create an instance of our service class to connect with the controller
    //private restricts the visibility of the userService to just this class.
    //final keyword means that once the userService is assigned a value it cannot be reassigned.
    //userService is the name of the instance of the usersService
    private final UserService userService;

    //Services is connected with controller
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    //Create a new user
        //PostMapping marks this method to handle HTTP POST requests
        //public because the method can be accessed from anywhere outside the class
        //Users it returns an object of type Users
        // createUser is the name of the method
        //RequestBody maps the incoming HTTP request to the user parameter
        //User is the entity and user is the name of the variable that will hold the object
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    //Get all users
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
