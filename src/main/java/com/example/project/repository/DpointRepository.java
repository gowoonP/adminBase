package com.example.project.repository;

import com.example.project.model.entity.Dpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DpointRepository extends JpaRepository<Dpoint, Long> {
}
