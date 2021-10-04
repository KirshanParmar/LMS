package com.microservice.lms.user.controller;

import com.microservice.lms.user.entity.Users;
import com.microservice.lms.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersController{

    @Autowired
    private UsersService userDetailsService;

    @PostMapping("/save")
    public Users saveUserDetails(@RequestBody Users users){
        return userDetailsService.saveUser(users);
    }

    @GetMapping("/{id}")
    public Users getByIdUserDetails(@PathVariable("id") Integer id){
        return userDetailsService.getUserById(id);
    }
}
