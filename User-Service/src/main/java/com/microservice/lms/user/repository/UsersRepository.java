package com.microservice.lms.user.repository;

import com.microservice.lms.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
 //  public Users getByUserId(Integer id);

}
