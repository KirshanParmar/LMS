package com.microservice.lms.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dept_id")
    private Integer id;
    private String departmentName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="department", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("department")
    private List<Users> usersList = new ArrayList<>();

}
