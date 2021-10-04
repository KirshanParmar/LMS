package com.microservice.lms.user.controller;

import com.microservice.lms.user.entity.Role;
import com.microservice.lms.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService  roleService;

    @PostMapping("/save")
    public Role saveRole(@RequestBody Role role){

        return roleService.saveRole(role);
    }
    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable("id") Integer id){
        return roleService.getRoleById(id);
    }

}
