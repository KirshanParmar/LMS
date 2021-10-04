package com.microservice.lms.user.service;

import com.microservice.lms.user.dto.ResponseRequest;
import com.microservice.lms.user.entity.Department;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public Department getDepartmentById(Integer id);
}
