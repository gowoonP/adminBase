package com.example.project.repository;

import com.example.project.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUserid(String userid);

    Optional<Users> findByUseridAndUserpw(String userid, String userpw);

    Users findFirstByStatusOrderByIdDesc(String status);

    Users findFirstByHpOrderByIdDesc(String hp);
}
