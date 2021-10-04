package com.microservice.lms.user.controller;
import com.microservice.lms.user.dto.ResponseRequest;
import com.microservice.lms.user.entity.Department;
import com.microservice.lms.user.entity.Users;
import com.microservice.lms.user.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getByDepartmentId(@PathVariable("id") Integer id){
        return departmentService.getDepartmentById(id);
    }
}
