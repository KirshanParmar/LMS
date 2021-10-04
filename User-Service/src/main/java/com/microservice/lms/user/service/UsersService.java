package com.microservice.lms.user.service;
import com.microservice.lms.user.entity.Users;

public interface UsersService {

    public Users saveUser(Users users);
    public Users getUserById(Integer id);
}
