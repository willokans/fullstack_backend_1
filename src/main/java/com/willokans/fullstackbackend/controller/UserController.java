package com.willokans.fullstackbackend.controller;

import com.willokans.fullstackbackend.model.User;
import com.willokans.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User creatNewUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

//    @DeleteMapping("/user/{id}")
//    public User deleteUser(@PathVariable String id){
//        return userRepository.delete();
//    }

}
