package com.microservice.lms.user.service;

import com.microservice.lms.user.entity.Role;

public interface RoleService {
    public Role saveRole(Role role);
    public Role getRoleById(Integer id);
}
