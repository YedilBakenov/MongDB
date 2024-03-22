package kz.example.mongodb.controller;

import kz.example.mongodb.model.User;
import kz.example.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void addUser(@RequestBody User user){
           userService.addUser(user);
    }

    @GetMapping(value = "/{id}")
    private User getUserById(@PathVariable String id){
       return   userService.getUserById(id);
    }
}
