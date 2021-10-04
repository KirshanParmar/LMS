package com.microservice.lms.user.serviceImp;

import com.microservice.lms.user.entity.Users;
import com.microservice.lms.user.repository.UsersRepository;
import com.microservice.lms.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImp implements UsersService {
    @Autowired
    private UsersRepository userDetailsRepository;

    @Override
    public Users saveUser(Users users) {

        return userDetailsRepository.save(users);
    }

    @Override
    public Users getUserById(Integer id) {

        return userDetailsRepository.getById(id);
    }
}
