package com.example.project.repository;

import com.example.project.model.entity.Zzim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZzimRepository extends JpaRepository<Zzim, Long> {
}
