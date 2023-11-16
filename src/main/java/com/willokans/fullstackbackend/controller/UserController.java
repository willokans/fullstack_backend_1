package com.willokans.fullstackbackend.controller;

import com.willokans.fullstackbackend.exception.UserNotFoundException;
import com.willokans.fullstackbackend.model.User;
import com.willokans.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("http://localhost:3000/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User creatNewUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    Optional<User> getUserById(@PathVariable Long id){
        return Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id)));
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User updateUser, @PathVariable Long id){
        return userRepository.findById(id).map(user -> {
            user.setFull_name(updateUser.getFull_name());
            user.setUsername(updateUser.getUsername());
            user.setEmail(updateUser.getEmail());
            return userRepository.save(user);
        }).orElseThrow(() -> new UserNotFoundException(id));
    }

}
