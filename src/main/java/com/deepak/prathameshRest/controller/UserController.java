package com.deepak.prathameshRest.controller;

import com.deepak.prathameshRest.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final Map<String, User> userMap = new HashMap<>();
    //create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        userMap.put(id, user);
        return user;
    }

    //Get All Users
    @GetMapping
    public Map<String, User> getAllUsers() {
        return userMap;
    }

    //Get specific user by id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userMap.get(id);
    }

    //Update a user by id
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        User existingUser = userMap.get(id);
        if(existingUser != null) {
            existingUser.setName(updatedUser.getName());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setAge(updatedUser.getAge());
            userMap.put(id, existingUser);
            return existingUser;
        }
        return null;
    }

    // Delete a user by id
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userMap.remove(id);
        return "User with ID " + id + " has been deleted";
    }

}
