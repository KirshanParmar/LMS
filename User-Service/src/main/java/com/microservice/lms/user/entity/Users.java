package com.microservice.lms.user.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_details")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="user_id")
    private Integer userId;

    private String name;
    private String email;

    /*@ManyToOne
    @JoinColumn(name="fk_departmentId")
    private Department department;*/

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_department",
            joinColumns = @JoinColumn(name = "dept_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    @JsonIgnoreProperties("usersList")
    private Department department;

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_role_id")
    private Role role;*/
/*

    @ManyToOne(targetEntity = Department.class, cascade = CascadeType.ALL)
    @JoinColumn(name="fk_departmentId")
    private Department department;
*/

}
