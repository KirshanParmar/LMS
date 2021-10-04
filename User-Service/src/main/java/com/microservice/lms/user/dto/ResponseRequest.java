package com.microservice.lms.user.dto;

import com.microservice.lms.user.entity.Department;
import com.microservice.lms.user.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseRequest {
    private Department department;
}
