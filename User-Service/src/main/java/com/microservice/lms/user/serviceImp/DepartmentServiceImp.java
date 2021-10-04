package com.microservice.lms.user.serviceImp;
import com.microservice.lms.user.entity.Department;
import com.microservice.lms.user.repository.DepartmentRepository;
import com.microservice.lms.user.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentRepository.getById(id);
    }

}
