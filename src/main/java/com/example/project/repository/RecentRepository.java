package com.example.project.repository;

import com.example.project.model.entity.Recent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecentRepository extends JpaRepository<Recent, Long> {
}
