package com.myapp.users.controllers;

import com.myapp.users.domain.User;
import com.myapp.users.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/user")
    public Optional<User> getUser(@RequestParam("id") long id){
        return repository.findById(id);
    }
}
